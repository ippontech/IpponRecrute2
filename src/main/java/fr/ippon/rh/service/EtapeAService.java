package fr.ippon.rh.service;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;

import fr.ippon.rh.permut.EncodeService;


@Service
public class EtapeAService {

	List<EncodeService> encodeServicesSequence;
	
    public String decriptTextAfterMIUPuzzle() {
    	
    	String text;
		try {
			text = IOUtils.toString(this.getClass().getResource("etapeAToDecode.txt"));
		} catch (IOException e) {			
			throw new RuntimeException("oups",e);
		}
    	for(EncodeService s : (List<EncodeService>)encodeServicesSequence) {
    		text = s.decode(text);
    	}
        return text;
    }


    @Inject
    @Named("listEtapeA")
    // rq : pour injecter une liste, il faut tricher avec Spring sinon
    // il essaye d'injecter la liste des beans du type demandé plutôt que la liste fabriquée 
	public void setEncodeServicesSequence(Object encodeServicesSequence) {
		this.encodeServicesSequence = (List<EncodeService>)encodeServicesSequence;
	}
   
}
