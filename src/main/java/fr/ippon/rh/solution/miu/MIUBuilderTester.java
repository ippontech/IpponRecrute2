package fr.ippon.rh.solution.miu;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MIUBuilderTester {
    @Test
    public void testRule1() {
        String res;
        res = new MIUBuilder("M").applyRule1().getFinalString();
        assertThat(res, is("M"));
        res = new MIUBuilder("MI").applyRule1().getFinalString();
        assertThat(res, is("MIU"));
        res = new MIUBuilder("MIII").applyRule1().getFinalString();
        assertThat(res, is("MIIIU"));
    }

    @Test
    public void testRule2() {
        String res;
        res = new MIUBuilder("M").applyRule2().getFinalString();
        assertThat(res, is("M"));
        res = new MIUBuilder("MI").applyRule2().getFinalString();
        assertThat(res, is("MII"));
        res = new MIUBuilder("MERT").applyRule2().getFinalString();
        assertThat(res, is("MERTERT"));
        res = new MIUBuilder("AERT").applyRule2().getFinalString();
        assertThat(res, is("AERT"));
    }

    @Test
    public void testRule3() {
        String res;
        res = new MIUBuilder("M").applyRule3().getFinalString();
        assertThat(res, is("M"));
        res = new MIUBuilder("MIII").applyRule3().getFinalString();
        assertThat(res, is("MU"));
        res = new MIUBuilder("IIIIII").applyRule3().getFinalString();
        assertThat(res, is("UU"));
        res = new MIUBuilder("IIIzIII").applyRule3().getFinalString();
        assertThat(res, is("UzU"));
    }

    @Test
    public void testRule4() {
        String res;
        res = new MIUBuilder("M").applyRule4().getFinalString();
        assertThat(res, is("M"));
        res = new MIUBuilder("UU").applyRule4().getFinalString();
        assertThat(res, is(""));
        res = new MIUBuilder("MUUUU").applyRule4().getFinalString();
        assertThat(res, is("M"));
        res = new MIUBuilder("UUtUU").applyRule4().getFinalString();
        assertThat(res, is("t"));
    }
}
