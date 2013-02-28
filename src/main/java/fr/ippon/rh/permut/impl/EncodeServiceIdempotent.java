package fr.ippon.rh.permut.impl;

public class EncodeServiceIdempotent extends BaseEncodeService  {

	@Override
	public String encode(String str) {
		return str;
	}

	@Override
	public String decode(String str) {
		return str;
	}

}
