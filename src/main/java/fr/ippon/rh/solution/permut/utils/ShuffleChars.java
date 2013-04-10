package fr.ippon.rh.solution.permut.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleChars {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i=65;i<=122;++i) {
			if(i >=91 && i <=96 ) continue;
			sb.append((char)i);
		}
		String alphabet = sb.toString();
		System.out.println(alphabet);
	
		shuffle(alphabet);
		shuffle(alphabet);
		shuffle(alphabet);
		shuffle(alphabet);

	}

	private static void shuffle(String CHARS) {
		List<Character> l = new ArrayList<Character>();
		for (char c : CHARS.toCharArray()) {
			l.add(c);
		}
		Collections.shuffle(l);
		StringBuilder sb = new StringBuilder();
		for(Character c : l) {
			sb.append(c);
		}
		System.out.println(sb.toString());
	}
}
