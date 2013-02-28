package fr.ippon.rh.solution.miu;

/**
 * Cf http://en.wikipedia.org/wiki/MU_puzzle
 * @author Fabien
 *
 *
 *  Attention !
 *  - Pour la recherche du code : on considère qu'on ne peut appliquer une règle que si elle s'applique
 *  - les règles 3 et 4 peuvent remplacer plusieurs groupes à la fois
 *  - on a le droit d'appliquer autant de fois qu'on veut une règle  
 *  TODO : problème : comment garantir que c'est le chemin le plus court ??
 */
public class MIUBuilder {

	public class InvalidMIURuleApplication extends RuntimeException {
		public InvalidMIURuleApplication(String current, int i) {
			super(String.format("Rule %d can't be applied on %s",i,current));
		}
	}
	
	private String current;
	private String code;
	public MIUBuilder(String base) {
		this.current = base;
		this.code = "";
	}
	
	public MIUBuilder applyRule1()  throws InvalidMIURuleApplication {
//	    xI → xIU
		if(current.endsWith("I")) {
			current = current + "U";
		} else {
			throw new InvalidMIURuleApplication(current,1);
			// nop
		}
		System.out.println("current : "+current);
		code += "1";
		return this;
	}
	
	public MIUBuilder applyRule2() throws InvalidMIURuleApplication {
//	    Mx → Mxx
		if(current.startsWith("M")) {
			current = current.replaceAll("^M(.*)$", "M$1$1");
		} else {
			throw new InvalidMIURuleApplication(current,2);
			// nop
		}
		System.out.println("current : "+current);
		code += "2";
		return this;
	}
	public MIUBuilder applyRule3() throws InvalidMIURuleApplication {
//	    xIIIy → xUy
		if(current.contains("III")) {
			current = current.replaceAll("III", "U");
		} else {
			throw new InvalidMIURuleApplication(current,3);
			// nop
		}
		System.out.println("current : "+current);
		code += "3";
		return this;
	}
	public MIUBuilder applyRule4() throws InvalidMIURuleApplication {
//	    xUUy → xy
		if(current.contains("UU")) {
			current = current.replaceAll("UU", "");
		} else {
			throw new InvalidMIURuleApplication(current,4);
			// nop
		}
		System.out.println("current : "+current);
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
