package fr.ippon.rh.solution.permut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.util.StringUtils;

import fr.ippon.rh.permut.EncodeService;
import fr.ippon.rh.permut.impl.EncodeService1;
import fr.ippon.rh.permut.impl.EncodeService2;
import fr.ippon.rh.permut.impl.EncodeService3;
import fr.ippon.rh.permut.impl.EncodeService4;

public class SolutionEncoder {
	
	public static void main(String[] args) throws Exception {
		new SolutionEncoder().doIt();
	}

	private void doIt() throws Exception {
		
		EncodeService s1 = new EncodeService1();
		EncodeService s2 = new EncodeService2();
		EncodeService s3 = new EncodeService3();
		EncodeService s4 = new EncodeService4();
		
		String str;
		
		// test :
//		String ori = "Suppose there are the symbols M, I, and U which can be combined to produce strings of symbols called \"word\". The MU puzzle asks one to start with the \"axiomatic\" word MI and transform it into the word MU using in each step one of the following transformation rules:    Add a U to the end of any string ending in I. For example: MI to MIU.    Double any string after the M (that is, change Mx, to Mxx). For example: MIU to MIUIU.    Replace any III with a U. For example: MUIIIU to MUUU.    Remove any UU. For example: MUUU to MU.";
//		str = ori;
//		System.out.println(str);
//		str = s1.encode(str);
//		System.out.println(str);
//		str = s1.decode(str);
//		System.out.println(str);
//		
//		System.out.println();
		
		// Solution du MIU : 221234 ==> TODO : vérifier qu'elle est unique et que c'est la plus courte !
		// Donc on encode à l'envers par 432122 
		InputStream inputStream = this.getClass().getResourceAsStream("textToEncode.txt");
		String input = IOUtils.toString(inputStream);
		str = input;
		System.out.println(str);
		System.out.println();
		
		str = s4.encode(str);
		str = s3.encode(str); 
		str = s2.encode(str); 
		str = s1.encode(str); 
		str = s2.encode(str);
		str = s2.encode(str); 
		System.out.println(str);
		
		System.out.println();
		
		// décodage :
		str = s2.decode(str);
		str = s2.decode(str); 
		str = s1.decode(str); 
		str = s2.decode(str); 
		str = s3.decode(str); 
		str = s4.decode(str);

		System.out.println(str);
		
	
	}

}
