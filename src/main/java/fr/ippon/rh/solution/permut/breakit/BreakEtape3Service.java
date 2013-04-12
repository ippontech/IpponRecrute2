package fr.ippon.rh.solution.permut.breakit;

import java.util.ArrayList;
import java.util.List;

import fr.ippon.rh.permut.EncodeService;
import fr.ippon.rh.permut.impl.BaseEncodeService;
import fr.ippon.rh.service.Etape3Service;

public class BreakEtape3Service {

    public static void main(String[] args) {
        new BreakEtape3Service().doIt();
    }

    private void doIt() {

        char[] encodedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
        
        
        
        // début : 
        char[] originalChar0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
        // html / head / body
        char[] originalChar1 = "bBCDEFGHIJKLMNtPQRSTUVWlYZfAcaxdgsijymXnpoqrhOuvwekz".toCharArray();
        // px / link rel="stylesheet" href
        char[] originalChar2 = "bBCDEFpHIJiLMNtPQRSTUfWlsnVAcawdgYKjymXkGoquhOrvxeZz".toCharArray();      
        // script / div / class
        char[] originalChar3 = "bBCDEFpHIJiLMvtPQcSTUfWlsnVARawdgYKjymXkGoquhOrNxeZz".toCharArray();      
        // author / Julien Dubois
        char[] originalChar4 = "bBCgEFpHIQiLMvtPJcSTUfWlsnVARawdDYKjymXkuoqGhOrNxeZz".toCharArray();      
        // js / write
        char[] originalChar5 = "bBCgjFpHwQiLMvtPJcSTUfWlsnVARaIdDYKEymXkuoqGhOrNxeZz".toCharArray();      
        // Bravo / Ippon Recrute / message / avez / A / Technologies / Etape
        char[] originalChar6 = "bGCqjzpHwQiLMvtPJcSNUfElsnVYWaXdDAKRymIkuogBhOrTxeZF".toCharArray();      
        // Vous / Pour / qui
        char[] originalChars = "bGCLjzpHwQiqMvtUJcSNPfElsnWYVaXdDAKRymIkuogBhOrTxeZF".toCharArray();      
        
        // == texte entièrement décodé (mais pas tout le html)
        
        Etape3Service service = new Etape3Service();
        List<EncodeService> list = new ArrayList<EncodeService>();
        list.add(new BaseEncodeService(originalChars,encodedChars) {
        });
        service.setEncodeServicesSequence(list);
        
        System.out.println(service.decriptText());

    }
    
}
