package fr.ippon.rh.solution.miu;


public class MIUProven {
	public static void main(String[] args) {
		
		new MIUProven().doIt();

		// Ca donne 3 solutions !!
//		Found MUIIU with 221234
//		Found MUIIU with 221324
//		Found MUIIU with 223124

		
		// TODO : problème : comment garantir que c'est le chemin le plus court ?? 
		// Il faut résoudre le problème pour ça ...
//		MIUBuilder builder = new MIUBuilder("MI")
//			.applyRule2()
//			.applyRule2()
//			.applyRule1()
//			.applyRule2()
//			.applyRule3()
//			.applyRule4();
//		String solution = builder.getFinalString();
//		String code = builder.getFinalCode();
//
//		System.out.println(solution); // => MUIIU
//		System.out.println(code);     // => 221234
	}

	private void doIt() {
		// brute force :
		find(1,"MI","");
	}

	private void find(int depth, String input, String baseSequence) {
		if(depth == 7) {
			return;
		}
		// Note : je dois tester tous les cas d'une profondeur donnée pour m'assurer que la solution est unique ...
		for(int ruleNum = 1 ; ruleNum <= 4 ; ++ruleNum ) {
			String sequence = baseSequence + ruleNum;
			try {
				String str = MIUBuilder.applyRule(ruleNum, input); 
				if(str.equals("MUIIU")) {
					System.out.println(String.format("Found %s with %s", str, sequence));
				}
				find(depth + 1, str,sequence);
			} catch (Exception e) {
				// ignore
				// TODO : à optimiser via un test ...
				
			}
		}	
	}
}
