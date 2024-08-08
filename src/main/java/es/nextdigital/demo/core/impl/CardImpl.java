package es.nextdigital.demo.core.impl;

import es.nextdigital.demo.core.api.CardApi;
import es.nextdigital.demo.core.model.CardConfiguration;

public class CardImpl implements CardApi {


    @Override
    public void activateCard(String card) {

    }

    @Override
    public void changePinCode(String cardId, byte[] pinCode, byte[] newPinCode) {

    }

    @Override
    public void changeCardConfiguration(String cardId, CardConfiguration cardConfiguration) {

    }

    @Override
    public CardConfiguration readCardConfiguration(String cardId) {
        return null;
    }
}
