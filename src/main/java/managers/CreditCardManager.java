package main.java.managers;

import java.util.ArrayList;
import java.util.List;

import main.java.model.Bank;
import main.java.model.CreditCard;

import java.math.BigDecimal;

public class CreditCardManager {
    private List<CreditCard> creditCards;

    public CreditCardManager(){
        creditCards = new ArrayList<>();
    }

    public synchronized CreditCard createCreditCard(BigDecimal fee, Bank bank) {
        CreditCard temp = new CreditCard(fee, bank);
        
        if(bank.getCreditCardList() == null) {
            List<CreditCard> card = new ArrayList<>();
            bank.setCreditCardList(card);
        }
        
        bank.addCreditCard(temp);
        creditCards.add(temp);
        return temp;
    }

    public synchronized List<CreditCard> sortByMaxCampaign() {
        List<CreditCard> sortedList = creditCards;
        sortedList.sort((c1, c2) -> c2.getCampaignList().size() - c1.getCampaignList().size());
        System.out.println(sortedList);
        return sortedList;
    }



}

