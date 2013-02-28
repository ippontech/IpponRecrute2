package fr.ippon.rh.permut.impl;

public class EncodeService1 extends BaseEncodeService  {

	char[] originalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
	char[] encodedChars  = "NXHjTrtuhyepcYVWBSgofAGPKnvkQmLdqUlaRCzbIExFsZwJDiOM".toCharArray();

	@Override
	public String encode(String str) {
		return transpose(str,originalChars,encodedChars);
	}

	@Override
	public String decode(String str) {
		return transpose(str,encodedChars,originalChars);
	}

}
