package es.nextdigital.demo.rest.card;

import es.nextdigital.demo.core.model.CardConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-08-08T19:41:47.671017400+02:00[Europe/Madrid]")

@RestController
public class CardApiController implements CardApi {

    @Override
    public ResponseEntity<Void> cardCardIdActivatePost (String cardId){

        //comprobar que la tarjeta existe

        //Llamar a la interfaz de entrada del core CardApi con los datos restantes

        //si ha salido bien, enviar un 204 NO CONTENT

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> cardCardIdSecurityPinCodePost (String cardId, byte[] pinCode, byte[] newPinCode){

        //comprobar que la tarjeta existe

        //Llamar a la interfaz de entrada del core CardApi con los datos restantes

        //si ha salido bien, enviar un 204 NO CONTENT

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> cardCardIdSecurityConfigurationPatch (String cardId, org.openapitools.model.CardConfiguration cardConfiguration){

        //comprobar que la tarjeta existe

        //pasar el objeto cardConfiguration de la entrada al CardConfiguration del core

        //Llamar a la interfaz de entrada del core CardApi con los datos restantes

        //si ha salido bien, enviar un 204 NO CONTENT

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<org.openapitools.model.CardConfiguration> cardCardIdSecurityConfigurationGet (String cardId){

        //comprobar que la tarjeta existe

        //Llamar a la interfaz de entrada del core CardApi con los datos restantes

        //retornar el objeto de salida

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
