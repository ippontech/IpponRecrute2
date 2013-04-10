package fr.ippon.rh.permut.impl;

import fr.ippon.rh.permut.EncodeService;

public class EncodeServiceIdempotent implements EncodeService  {

	@Override
	public String encode(String str) {
		return str;
	}

	@Override
	public String decode(String str) {
		return str;
	}
	
}
