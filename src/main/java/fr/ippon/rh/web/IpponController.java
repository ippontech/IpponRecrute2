package fr.ippon.rh.web;

import fr.ippon.rh.service.Etape2Service;
import fr.ippon.rh.service.Etape4Service;
import fr.ippon.rh.service.EtapeAService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;

/**
 * Controller principal, servant les pages Web du jeu.
 */
@Controller
public class IpponController {

    private final Etape2Service etape2Service;

    private final Etape4Service etape4Service;
    
    private final EtapeAService etapeAService;

    @Inject
    public IpponController(Etape2Service etape2Service, Etape4Service etape4Service, EtapeAService etapeAService) {
        this.etape2Service = etape2Service;
        this.etape4Service = etape4Service;
        this.etapeAService = etapeAService;
    }

    /**
     * Affiche l'étape 3.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String etape3(Model model) {
        model.addAttribute("texte", etape2Service.decriptText());
        return "etape3";
    }

     /**
     * Affiche l'étape 4.
     */
    @RequestMapping(value = "/etape4", method = RequestMethod.GET)
    public String etape4(Model model) {
        model.addAttribute("texte", etape4Service.decriptText());
        return "etape4";
    }
    
    @RequestMapping(value = "/etapeMIU", method = RequestMethod.GET)
    public String etapeMIU(Model model) {
//    	model.addAttribute("texte", etapeAService.decriptTextAfterMIUPuzzle());
    	return "etapeMIU";
    }
    
    @RequestMapping(value = "/etapeA", method = RequestMethod.GET)
    public String etapeA(Model model) {
    	model.addAttribute("texte", etapeAService.decriptTextAfterMIUPuzzle());
    	return "etapeA";
    }
}
