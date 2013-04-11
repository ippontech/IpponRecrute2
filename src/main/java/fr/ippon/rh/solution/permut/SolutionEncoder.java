package fr.ippon.rh.solution.permut;

import fr.ippon.rh.permut.EncodeService;
import fr.ippon.rh.permut.impl.EncodeService1;
import fr.ippon.rh.permut.impl.EncodeService2;
import fr.ippon.rh.permut.impl.EncodeService3;
import fr.ippon.rh.permut.impl.EncodeService4;
import org.apache.commons.io.IOUtils;

import java.io.InputStream;

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

        // Solution du MIU : 221234 ==> TODO : vérifier qu'elle est unique et que c'est la plus courte !
        // Donc on encode à l'envers par 432122
        InputStream inputStream = this.getClass().getResourceAsStream("textToEncode.txt");
        String input = IOUtils.toString(inputStream, "UTF-8");
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
