package fr.ippon.rh.permut.impl;

public class EncodeService3 extends BaseEncodeService {

    static char[] originalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
    static char[] encodedChars = "juPqzWVBfpCwLmyZtYJonicKGbsAXNdFUMaOHDgxvESrQIRehkTl".toCharArray();

    public EncodeService3() {
        super(originalChars, encodedChars);
    }

}
