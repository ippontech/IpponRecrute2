package fr.ippon.rh.permut.impl;

import fr.ippon.rh.permut.EncodeService;

public abstract class BaseEncodeService implements EncodeService {

	protected String transpose(String str, char[] fromChars, char[] toChars) {
		StringBuilder sb = new StringBuilder();
		for(char c : str.toCharArray()) {
			sb.append(transpose(c, fromChars, toChars));
		}
		return sb.toString();
	}

	protected char transpose(char c, char[] fromChars, char[] toChars) {
		char result = c;
		for(int i = 0; i < fromChars.length ; ++i) {
			if(fromChars[i] == c)  {
				result = toChars[i];
				break;
			}
		}
		return result;
	}

}