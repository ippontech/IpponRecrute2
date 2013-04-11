package fr.ippon.rh.permut.impl;

public class EncodeService1 extends BaseEncodeService {

    static char[] originalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
    static char[] encodedChars = "NXHjTrtuhyepcYVWBSgofAGPKnvkQmLdqUlaRCzbIExFsZwJDiOM".toCharArray();

    public EncodeService1() {
        super(originalChars, encodedChars);
    }

}
