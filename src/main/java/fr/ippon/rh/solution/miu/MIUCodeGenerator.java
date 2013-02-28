package fr.ippon.rh.solution.miu;


public class MIUCodeGenerator {
	public static void main(String[] args) {
		
		// TODO : problème : comment garantir que c'est le chemin le plus court ?? 
		// Il faut résoudre le problème pour ça ...

		MIUBuilder builder = new MIUBuilder("MI")
			.applyRule2()
			.applyRule2()
			.applyRule1()
			.applyRule2()
			.applyRule3()
			.applyRule4();
		String solution = builder.getFinalString();
		String code = builder.getFinalCode();

		System.out.println(solution); // => MUIIU
		System.out.println(code);     // => 221234
	}
}
