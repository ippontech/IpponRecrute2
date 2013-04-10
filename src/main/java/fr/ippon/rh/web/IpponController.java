package fr.ippon.rh.web;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.ippon.rh.service.Etape3Service;

/**
 * Controller principal, servant les pages Web du jeu.
 */
@Controller
public class IpponController {
    
    private final Etape3Service etape3Service;

    @Inject
    public IpponController(Etape3Service etape3Service) {
        this.etape3Service = etape3Service;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String debut(Model model) {
    	return "etape1";
    }

    @RequestMapping(value = "/etape2", method = RequestMethod.GET)
    public String etape2(Model model) {
    	return "etape2";
    }
    
    @RequestMapping(value = "/etape3", method = RequestMethod.GET)
    public String etape3(Model model) {
    	String text = etape3Service.decriptText();
		model.addAttribute("texte", text);
    	return "etape3";
    }
}
