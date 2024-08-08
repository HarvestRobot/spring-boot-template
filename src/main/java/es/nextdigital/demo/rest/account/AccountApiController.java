package es.nextdigital.demo.rest.account;

import es.nextdigital.demo.core.model.CardDetails;
import org.openapitools.model.AccountMovementList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@RestController
@RequestMapping("${openapi.bankAccounting.base-path:}")
public class AccountApiController implements AccountApi {

    @Override
    public ResponseEntity<AccountMovementList> accountAccountIdSummaryGet (String accountId, Integer pageNumber, Integer pageSize, Integer pageLimit){

        //Reccger las opciones de paginación en un solo objeto

        //comprobar quie la cuenta existe

        //Llamar a la interfaz de entrada del core AccountApi con los datos restantes y el objeto nuevo de paginación

        //recoger la respuesta y enviarla

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> accountAccountIdOperationSavePost (String accountId, Integer amount, Object cardDetails, String atmId){

        //comprobaciones básicas (la cantidad de dinero es positiva, la cuenta existe, el cajero existe...)

        //comprobar que el cajero y la tarjeta son del mismo banco
        //si no lo son, devolver FORBIDDEN

        //Llamar a la interfaz de entrada del core AccountApi con los datos restantes

        //si ha salido bien, enviar un 204 NO CONTENT

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> accountAccountIdOperationTransferPost (String accountId, String toAccountId, Integer amount, Object cardDetails, String atmId){

        //comprobaciones básicas (la cantidad de dinero es positiva, las cuentas existen, el cajero existe...)

        //Llamar a la interfaz de entrada del core AccountApi con los datos restantes

        //si ha salido bien, enviar un 204 NO CONTENT

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> accountAccountIdOperationWithdrawPost (String accountId, Integer amount, Object cardDetails, String atmId){

        //comprobaciones básicas (la cantidad de dinero es positiva, la cuenta existe, el cajero existe...)

        //Llamar a la interfaz de entrada del core AccountApi con los datos restantes

        //si ha salido bien, enviar un 204 NO CONTENT

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
