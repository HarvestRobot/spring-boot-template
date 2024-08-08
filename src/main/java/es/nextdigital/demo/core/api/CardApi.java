package es.nextdigital.demo.core.api;

import es.nextdigital.demo.core.model.CardConfiguration;

public interface CardApi {

    void activateCard (String card);
    void changePinCode(String cardId, byte[] pinCode, byte[] newPinCode);
    void changeCardConfiguration(String cardId, CardConfiguration cardConfiguration);
    CardConfiguration readCardConfiguration(String cardId);
}
