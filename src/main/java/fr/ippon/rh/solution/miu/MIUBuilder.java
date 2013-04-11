package fr.ippon.rh.solution.miu;

/**
 * Cf http://en.wikipedia.org/wiki/MU_puzzle
 *
 * @author Fabien
 *         <p/>
 *         <p/>
 *         Attention !
 *         - Pour la recherche du code : on considère qu'on ne peut appliquer une règle que si elle s'applique
 *         - les règles 3 et 4 peuvent remplacer plusieurs groupes à la fois
 *         - on a le droit d'appliquer autant de fois qu'on veut une règle
 *         TODO : problème : comment garantir que c'est le chemin le plus court ??
 */
public class MIUBuilder {

    public class InvalidMIURuleApplication extends RuntimeException {
        public InvalidMIURuleApplication(String current, int i) {
            super(String.format("Rule %d can't be applied on %s", i, current));
        }
    }

    private String current;
    private String code;
    private boolean printCurrent = true;

    public MIUBuilder(String base) {
        this.current = base;
        this.code = "";
    }

    public MIUBuilder printCurrent(boolean printCurrent) {
        this.printCurrent = printCurrent;
        return this;
    }

    public static String applyRule(int ruleNum, String base) throws InvalidMIURuleApplication {
        switch (ruleNum) {
            case 1:
                return applyRule1(base);
            case 2:
                return applyRule2(base);
            case 3:
                return applyRule3(base);
            case 4:
                return applyRule4(base);
        }
        return "";
    }

    public static String applyRule1(String base) throws InvalidMIURuleApplication {
        return new MIUBuilder(base).printCurrent(false).applyRule1().getFinalString();
    }

    public MIUBuilder applyRule1() throws InvalidMIURuleApplication {
//	    xI → xIU
        if (current.endsWith("I")) {
            current = current + "U";
        } else {
            throw new InvalidMIURuleApplication(current, 1);
            // nop
        }
        printCurrent();
        code += "1";
        return this;
    }

    private void printCurrent() {
        if (printCurrent) {
            System.out.println("current : " + current);
        }
    }

    public static String applyRule2(String base) throws InvalidMIURuleApplication {
        return new MIUBuilder(base).printCurrent(false).applyRule2().getFinalString();
    }

    public MIUBuilder applyRule2() throws InvalidMIURuleApplication {
//	    Mx → Mxx
        if (current.startsWith("M")) {
            current = current.replaceAll("^M(.*)$", "M$1$1");
        } else {
            throw new InvalidMIURuleApplication(current, 2);
            // nop
        }
        printCurrent();
        code += "2";
        return this;
    }

    public static String applyRule3(String base) throws InvalidMIURuleApplication {
        return new MIUBuilder(base).printCurrent(false).applyRule3().getFinalString();
    }

    public MIUBuilder applyRule3() throws InvalidMIURuleApplication {
//	    xIIIy → xUy
        if (current.contains("III")) {
            current = current.replaceAll("III", "U");
        } else {
            throw new InvalidMIURuleApplication(current, 3);
            // nop
        }
        printCurrent();
        code += "3";
        return this;
    }

    public static String applyRule4(String base) throws InvalidMIURuleApplication {
        return new MIUBuilder(base).printCurrent(false).applyRule4().getFinalString();
    }

    public MIUBuilder applyRule4() throws InvalidMIURuleApplication {
//	    xUUy → xy
        if (current.contains("UU")) {
            current = current.replaceAll("UU", "");
        } else {
            throw new InvalidMIURuleApplication(current, 4);
            // nop
        }
        printCurrent();
        code += "4";
        return this;
    }

    public String getFinalString() {
        return current;
    }

    public String getFinalCode() {
        return code;
    }

}
