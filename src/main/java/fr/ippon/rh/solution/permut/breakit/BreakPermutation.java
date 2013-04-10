package fr.ippon.rh.solution.permut.breakit;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;

import fr.ippon.rh.permut.EncodeService;
import fr.ippon.rh.permut.impl.BaseEncodeService;
import fr.ippon.rh.permut.impl.EncodeService1;
import fr.ippon.rh.permut.impl.EncodeService2;
import fr.ippon.rh.permut.impl.EncodeService3;
import fr.ippon.rh.permut.impl.EncodeService4;

public class BreakPermutation {
	private BaseEncodeService[] encoderArray;
	private ArrayList<Possibility> possilities;

	public static void main(String[] args) throws Exception {
		new BreakPermutation().doIt();
	}
	
	public BreakPermutation() {
		
		BaseEncodeService s1 = new EncodeService1();
		BaseEncodeService s2 = new EncodeService2();
		BaseEncodeService s3 = new EncodeService3();
		BaseEncodeService s4 = new EncodeService4();
		
//		encoderArray = new EncodeService[] { s1, s2, s3, s4 };
		encoderArray = new BaseEncodeService[] { s1, s2, s3, s4 };
	}

	private void doIt() throws Exception {
		
		long start = System.currentTimeMillis();
		
		String str;
		
		// TODO : décoder un autre texte ?
		// TODO : n'est-ce pas trop prêt de l'algo pour MIU ?
		
		//
		// On peut faire décoder un texte qui est un extrait d'une spec ou d'une doc 
		// => donc il y aura "bean" à l'intérieur par exemple ..
		// 
		
		// => Rq : une façon de faire un brute force sur un gros texte est de faire le brute que sur une partie du texte => ca améliore le temps d'exécution ...
		
//		InputStream inputStream = this.getClass().getResourceAsStream("extract.txt");
		InputStream inputStream = this.getClass().getResourceAsStream("article.txt");
		String input = IOUtils.toString(inputStream,"UTF-8"); 
		str = encode(input,Arrays.asList(3,4,2,1,4,2,1));  // utiliser un chiffre magique ? lequel ? avec uniqumeent 1,2,3,4 ?
		
//		InputStream inputStream = this.getClass().getResourceAsStream("/fr/ippon/rh/service/etapeAToDecode.txt");
//		String input = IOUtils.toString(inputStream,"UTF-8");
//		str = input;
		
		// décodage :
		this.possilities = new ArrayList<Possibility>();
//		find(str);
		find2(str);

		Possibility best = null;
		for(Possibility p : possilities) {
			if(best == null) {
				best = p;
			} else {
				if(p.score > best.score) {
					best = p;
					// reset all
				} else if(p.score == best.score) {
					// save all with this score
				}
			}
		}
		String decoded = decode(str, best.code);
		System.out.println("best score : "+best.score);
		System.out.println("best code : "+best.code);
		System.out.println(decoded);
		
		long end= System.currentTimeMillis();
		System.out.println("In : "+((end-start)/1000/60d)+"min.");
	}
	
	private void find2(String str) {
		String mostPresentChars = getMostRepresentedCharsAsStr(str);
		System.out.printf("Most represented chars : %s%n",mostPresentChars);
		
		// score permutations :
		List<List<Integer>> bestPermutations = new ArrayList<List<Integer>>();
		genAndPermutation(bestPermutations, mostPresentChars, new ArrayList<Integer>());
		System.out.printf("Found %d permutations with a good score%n",bestPermutations.size());
//		System.out.println(bestPermutations);
		
		for (List<Integer> seq : bestPermutations) {
			String decoded = decode(str,seq);
			int score = computeScore(decoded);
			addNewPossibility(seq, score);
		}
		
	}

	private void genAndPermutation(List<List<Integer>> bestPermutations, String mostPresentChars, List<Integer> inputSeq) {
		if(inputSeq.size() > 10) {
			return;
		}
		for(int i = 1 ; i < 5 ; ++i) {
			List<Integer> current = new ArrayList<Integer>(inputSeq);
			current.add(i);
			
			String decoded = decode(mostPresentChars,current);
			
			int score = 0;
			if(decoded.charAt(0) == 'e') score+=2;// bonus ...
			if(decoded.contains("e")) ++score;
			if(decoded.contains("s")) ++score;
			if(decoded.contains("a")) ++score;
			if(decoded.contains("i")) ++score;
			if(decoded.contains("t")) ++score;
			if(decoded.contains("n")) ++score;
			
			if(score > 5) {
				bestPermutations.add(current);
			}
			
			// recurse :
			genAndPermutation(bestPermutations,mostPresentChars,current);
		}
	}

	private String getMostRepresentedCharsAsStr(String str) {
		List<Character> mostPresentChars = getMostRepresentedChars(str);
		StringBuilder sb = new StringBuilder();
		for(Character c : mostPresentChars) {
			sb.append(c);
		}
		String mostPresentChars2 = sb.toString();
		return mostPresentChars2;
	}
	
	private List<Character> getMostRepresentedChars(String str) {
		// 1 / compute statistical data : 
		Map<Character,Integer> m = new HashMap<Character, Integer>();
		for(char c : str.toCharArray()) {
			if(m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c,1);
			}
		}
		// get 6 most representive characters :
		// cf http://fr.wikipedia.org/wiki/Fr%C3%A9quence_d%27apparition_des_lettres_en_fran%C3%A7ais
		// e, s, a, i, t, n
		Map<Integer,List<Character>> frequencies = new HashMap<Integer, List<Character>>();
		int maxFrequency = 0;
		for(char c : m.keySet()) {
			if(Character.isWhitespace(c)) {
				continue;
			}
			int frequency = m.get(c);
			maxFrequency = Math.max(maxFrequency, frequency);
			List<Character> list;
			if(frequencies.containsKey(frequency)) {
				list = frequencies.get(frequency);
			} else {
				list = new ArrayList<Character>();
				frequencies.put(frequency,list);
			}
			list.add(c);
		}
		List<Character> mostPresentChars = new ArrayList<Character>();
		int i=maxFrequency;
		while(mostPresentChars.size()<6 && i>0) {
			List<Character> c = frequencies.get(i);
			if(c != null) {
				System.out.printf("Adding char with frequency %d : %s%n",i,c);
				mostPresentChars.addAll(c);
			}
			--i;
		}
		return mostPresentChars;
	}
	
	

	private void find(String str) {
		// si le texte est trop long, pas besoin de scorer sur l'ensemble du texte :
		if(str.length() > 3000) {
			str = str.substring(0,3000);
		}
		find(str,new ArrayList<Integer>());
//		find(str,new ArrayList<Integer>());
	}
	
	class Possibility {
		int score;
		List<Integer> code;
//		String decoded;
	}
	
	

	private void find(String currentInput, List<Integer> currentDecodingSeq ) {
		// TODO : ne pas donner la profondeur de recherche => forcer une recherche par parcours en largeur ? => comment utiliser un heuristique dans ce cas ?
		// TODO : appliquer le décodage petit à petit sur la chaine déjà décodé en partie ?

		// TODO : une profondeur de 6, c'est trop rapide ...
		// 
		
		// rq: la force brute ne fonctionne pas si on a aucun indice tangible
		// se baser sur un dictionnaire est nécessaire + un scoring ...
		// ...
		
		if(currentDecodingSeq.size() > 8) {
			return;
		}
		for(int additionalCode=1; additionalCode < 5 ; ++additionalCode) {
			List<Integer> newDecodingSeq = new ArrayList<Integer>(currentDecodingSeq);
			newDecodingSeq.add(additionalCode);
			
			String decoded = decode(currentInput, additionalCode);
			
			// TODO : utiliser fork-join pour tester les possibilités ...
			
			// le seul indice nécessaire est la langue dans laquelle le texte est écrit ...
			// et aussi éventuellement le fait qu'il y a ait un lien http ...

			int score = computeScore(decoded);

			addNewPossibility(newDecodingSeq, score);
			// recurse :
			find(decoded,newDecodingSeq);
		}
	}

	private void addNewPossibility(List<Integer> newDecodingSeq, int score) {
		//			if(score > 0) {
		if(score > 1) {
//			System.out.printf("Found a possibility with score %s : %s%n",score, newDecodingSeq);
			Possibility p = new Possibility();
			p.score = score;
			p.code = newDecodingSeq;
//				p.decoded = decoded; // TO optimize ...
			possilities.add(p);
		}
	}

	
	static List<Pattern> scoringPatterns;
	static {
		String[] dico =  {"les", "le", "de", "un", "la" , "en", "tu", "il", "elle", "ils", "vous", "par", "où", "et", "donc", "or", "ni", "car", "nous", "mais", "ou" };
		
		scoringPatterns = new ArrayList<Pattern>();
		StringBuilder regex = new StringBuilder(); 
		for(String mot : dico) {
			scoringPatterns.add(Pattern.compile(" " +mot + " ",Pattern.CASE_INSENSITIVE)); 
		}
	}
	
	private int computeScore(String decoded) {
		int score = 0;
//		String lowerCase = decoded.toLowerCase();
//			if(lowerCase.contains("http")) { //trick ...
//				score += 10;
//			}
//		for(String mot : dico) {
//			if(lowerCase.contains(" "+mot+" ")) { // la casse importe ...
//				// faut-il donner un poid ? suivant le nombre de d'occurrence ?
//				score ++; 
//			}
//		}
		for(Pattern p : scoringPatterns) {
			if(p.matcher(decoded).find()) {
				score ++; 
			}
		}
		return score;
	}


	private String decode(String input, int i) {
		return encoderArray[i-1].decode(input);
	}
//	private String decode(String str, Iterable<Integer> code) {
//		// TODO : compute a new Decoder ...
//		for (int i : code) {
//			str = encoderArray[i-1].decode(str);
//		}
//		return str;
//	}
	private String decode(String str, Iterable<Integer> code) {
		StringBuilder sb = new StringBuilder(str.length());
		for(char c : str.toCharArray()) {
			for (int i : code) {
				c = encoderArray[i-1].decodeLight(c);
			}
			sb.append(c);
		}
		return sb.toString();
	}
	private String encode(String str, Iterable<Integer> code) {
		for (int i : code) {
			str = encoderArray[i-1].encode(str);
		}
		return str;
	}
}
