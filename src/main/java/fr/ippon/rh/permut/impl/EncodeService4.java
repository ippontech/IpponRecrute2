package fr.ippon.rh.permut.impl;

public class EncodeService4 extends BaseEncodeService  {
	
	static char[] originalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] encodedChars  = "vMNHwBRjPAQqpXfJUzDhWFLmuETnSVdorylsCbKckaGitZeOIYxg".toCharArray();

	public EncodeService4() {
		super(originalChars,encodedChars);
	}
}
