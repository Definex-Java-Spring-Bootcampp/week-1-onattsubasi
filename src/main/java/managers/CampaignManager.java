package main.java.managers;

import java.util.List;

import main.java.enums.SectorType;
import main.java.model.Bank;
import main.java.model.Campaign;
import main.java.model.CreditCard;
import main.java.model.Loan;

import java.util.ArrayList;
import java.time.LocalDate;

public class CampaignManager {
    private List<Campaign> campaignList;

    public CampaignManager(){
        campaignList = new ArrayList<>();
    }

    public synchronized Campaign createCampaign(String title, String content, LocalDate dueDate, LocalDate createDate, LocalDate updateDate, SectorType sector, Bank bank, Object parameter) {
        Campaign temp = null;
        if (parameter instanceof Loan) {
            Loan loan = (Loan)parameter;
            if(loan.getBank() == bank) {
                temp= new Campaign(title, content, dueDate, createDate, updateDate, sector, bank, (Loan)parameter);
            }
            else{
                System.out.println("Invalid Bank parameter! ");
                return null;
            }
        } else if (parameter instanceof CreditCard){
            CreditCard creditCard = (CreditCard)parameter;
            if(creditCard.getBank() == bank) {
                temp = new Campaign(title, content, dueDate, createDate, updateDate, sector, bank, (CreditCard)parameter);
                if(creditCard.getCampaignList() == null) {
                    List<Campaign> campaign = new ArrayList<>();
                    creditCard.setCampaignList(campaign);
                }
                creditCard.addCampaign(temp);
            }
            else{
                System.out.println("Invalid Bank parameter! ");
                return null;
            }           
        } else {
            System.out.println("Invalid Object parameter type! ");
            return null;
        } 
        if(bank.getcampaignList() == null) {
            List<Campaign> campaign = new ArrayList<>();
            bank.setcampaignList(campaign);
        }

        bank.addCampaign(temp);
        campaignList.add(temp);
        return temp;
    }

    // once basvurularda kredikarti olanlari ayiriyor
    // daha sonra size'ina gore siraliyor
    public synchronized List<Campaign> sortCreditCardCampaignByNumber() {
        List<Campaign> sortedList = new ArrayList<>();
        campaignList.forEach(a -> {
            if(a.getCreditCard()!=null) {
                sortedList.add(a);
                System.out.println(a.getTitle() + " " + a.getCreditCard().getCampaignList().size());
            }                
        });
        sortedList.sort((c1, c2) -> c2.getBank().getcampaignList().size() - c1.getBank().getcampaignList().size());
        System.out.println(sortedList);
        return sortedList;
    }





}
