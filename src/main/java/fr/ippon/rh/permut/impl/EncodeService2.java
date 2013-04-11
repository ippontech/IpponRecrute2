package fr.ippon.rh.permut.impl;

public class EncodeService2 extends BaseEncodeService {

    static char[] originalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
    static char[] encodedChars = "zNsvfxPXoLnKHSyegbWacjqVQtJGIMphFAuTlBOdYrwRkmDCEUiZ".toCharArray();

    public EncodeService2() {
        super(originalChars, encodedChars);
    }
}
