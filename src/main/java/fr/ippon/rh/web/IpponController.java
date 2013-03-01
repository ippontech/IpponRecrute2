package fr.ippon.rh.web;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.ippon.rh.service.EtapeAService;

/**
 * Controller principal, servant les pages Web du jeu.
 */
@Controller
public class IpponController {
    
    private final EtapeAService etapeAService;

    @Inject
    public IpponController(EtapeAService etapeAService) {
        this.etapeAService = etapeAService;
    }

    /**
     * Affiche l'étape 3.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String debut(Model model) {
    	return "etapeMIU";
    }
    
    @RequestMapping(value = "/etapeA", method = RequestMethod.GET)
    public String etapeA(Model model) {
    	model.addAttribute("texte", etapeAService.decriptTextAfterMIUPuzzle());
    	return "etapeA";
    }
}
