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
        String input = "<!DOCTYPE html>\n" +
                "<!--[if lt IE 7]>      <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\"> <![endif]-->\n" +
                "<!--[if IE 7]>         <html class=\"no-js lt-ie9 lt-ie8\"> <![endif]-->\n" +
                "<!--[if IE 8]>         <html class=\"no-js lt-ie9\"> <![endif]-->\n" +
                "<!--[if gt IE 8]><!--> <html class=\"no-js\"> <!--<![endif]-->\n" +
                "<head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n" +
                "    <title>Ippon Recrute 3</title>\n" +
                "    <meta name=\"author\" content=\"Julien Dubois\" />\n" +
                "    <meta name=\"description\" content=\"\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width\">\n" +
                "\n" +
                "    <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\">\n" +
                "    <style>\n" +
                "        body {\n" +
                "            padding-top: 60px;\n" +
                "            padding-bottom: 40px;\n" +
                "        }\n" +
                "    </style>\n" +
                "    <link rel=\"stylesheet\" href=\"resources/css/bootstrap-responsive.min.css\">\n" +
                "    <link rel=\"stylesheet\" href=\"resources/css/main.css\">\n" +
                "\n" +
                "    <script src=\"resources/js/vendor/modernizr-2.6.2-respond-1.1.0.min.js\"></script>\n" +
                "</head>\n" +
                "<body>\n" +
                "<!--[if lt IE 7]>\n" +
                "<p class=\"chromeframe\">You are using an <strong>outdated</strong> browser. Please <a href=\"http://browsehappy.com/\">upgrade your browser</a> or <a href=\"http://www.google.com/chromeframe/?redirect=true\">activate Google Chrome Frame</a> to improve your experience.</p>\n" +
                "<![endif]-->\n" +
                "\n" +
                "<!-- This code is taken from http://twitter.github.com/bootstrap/examples/hero.html -->\n" +
                "\n" +
                "<div class=\"navbar navbar-inverse navbar-fixed-top\">\n" +
                "    <div class=\"navbar-inner\">\n" +
                "        <div class=\"container\">\n" +
                "            <a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\n" +
                "                <span class=\"icon-bar\"></span>\n" +
                "                <span class=\"icon-bar\"></span>\n" +
                "                <span class=\"icon-bar\"></span>\n" +
                "            </a>\n" +
                "            <div class=\"nav-collapse collapse\">\n" +
                "                <ul class=\"nav\">\n" +
                "                    <li>\n" +
                "                        <a class=\"brand\" href=\"/\">Ippon Recrute 3</a>\n" +
                "                    </li>\n" +
                "                    <li>\n" +
                "                        <a href=\"/etape1\">Etape 1</a>\n" +
                "                    </li>\n" +
                "                    <li>\n" +
                "                        <a href=\"/etape2\">Etape 2</a>\n" +
                "                    </li>\n" +
                "                    <li class=\"active\">\n" +
                "                        <a href=\"/etape3\">Etape 3</a>\n" +
                "                    </li>\n" +
                "                </ul>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div>\n" +
                "\n" +
                "<div class=\"container\">\n" +
                "\n" +
                "    <h1>Bravo !</h1>\n" +
                "\n" +
                "    <p>\n" +
                "        Vous avez vaincu la 3&egrave;me &eacute;dition du concours \"Ippon Recrute\" !\n" +
                "        Nous vous proposons donc de postuler chez Ippon Technologies, en envoyant un mail &agrave;\n" +
                "        \"<a href=\"mailto:recrutement@ippon.fr\">recrutement@ippon.fr</a>\", avec dans le titre de votre message \"[Ippon-Recrute-3]\".\n" +
                "    </p>\n" +
                "\n" +
                "    <p>\n" +
                "        Pour avoir des points bonus lors de votre entretien,\n" +
                "        si vous avez utilis&eacute; une m&eacute;thode amusante pour r&eacute;soudre l'un des puzzles\n" +
                "        (par exemple de l'injection de code JavaScript dans la premi&egrave;re &eacute;tape...),\n" +
                "        vous pouvez d&eacute;crire la m&eacute;thode utilis&eacute;e et rajouter en copie\n" +
                "        \"Julien Dubois &lt;jdubois@ippon.fr&gt;\", qui se fera un plaisir d'&eacute;tudier votre code !\n" +
                "    </p>\n" +
                "\n" +
                "    <p>\n" +
                "        A bient&ocirc;t,\n" +
                "        <br/><br/>\n" +
                "        Ippon Technologies.\n" +
                "    </p>\n" +
                "    <hr>\n" +
                "\n" +
                "    <footer>\n" +
                "        <p>&copy; Ippon Technologies 2013</p>\n" +
                "    </footer>\n" +
                "\n" +
                "</div> <!-- /container -->\n" +
                "\n" +
                "<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\"></script>\n" +
                "<script>window.jQuery || document.write('<script src=\"resources/js/vendor/jquery-1.9.1.min.js\"><\\/script>')</script>\n" +
                "\n" +
                "<script src=\"resources/js/vendor/bootstrap.min.js\"></script>\n" +
                "\n" +
                "<script src=\"resources/js/main.js\"></script>\n" +
                "\n" +
                "</body>\n" +
                "</html>\n" +
                " \n";

        str = input;
        System.out.println(str);
        System.out.println("-----------------------------------------------");

        str = s4.encode(str);
        str = s3.encode(str);
        str = s2.encode(str);
        str = s1.encode(str);
        str = s2.encode(str);
        str = s2.encode(str);
        System.out.println(str);

        System.out.println("-----------------------------------------------");

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
