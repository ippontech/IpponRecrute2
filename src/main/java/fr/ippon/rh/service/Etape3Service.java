package fr.ippon.rh.service;

import fr.ippon.rh.permut.EncodeService;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;
import java.util.List;


@Service
public class Etape3Service {

    List<EncodeService> encodeServicesSequence;

    public String decriptText() {
        String text;
        try {
            text = IOUtils.toString(this.getClass().getResource("etape3ToDecode.txt"), "UTF-8");
        } catch (IOException e) {
            throw new RuntimeException("oups", e);
        }
        for (EncodeService s : encodeServicesSequence) {
            text = s.decode(text);
        }
        return text;
    }


    @Inject
    @Named("listEtape3")
    // rq : pour injecter une liste, il faut tricher avec Spring sinon
    // il essaye d'injecter la liste des beans du type demandé plutôt que la liste fabriquée ...
    @SuppressWarnings("unchecked")
    public void setEncodeServicesSequence(Object encodeServicesSequence) {
        this.encodeServicesSequence = (List<EncodeService>) encodeServicesSequence;
    }

}
