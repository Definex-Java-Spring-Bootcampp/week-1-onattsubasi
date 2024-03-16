package main.java.model;

import java.util.List;

public class Bank {

    private String name;
    private List<Loan> loanList;
    private List<CreditCard> creditCardList;
    private List<Campaign> campaignList;

    public Bank(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Loan> getLoanList() {
        return loanList;
    }

    public void setLoanList(List<Loan> loanList) {
        this.loanList = loanList;
    }

    public List<CreditCard> getCreditCardList() {
        return creditCardList;
    }

    public void setCreditCardList(List<CreditCard> creditCardList) {
        this.creditCardList = creditCardList;
    }

    public void addCreditCard(CreditCard creditCard){
        creditCardList.add(creditCard);
    }
    
    public void addLoan(Loan loan){
        loanList.add(loan);
    }
    
    public List<Campaign> getcampaignList() {
        return campaignList;
    }

    public void setcampaignList(List<Campaign> campaignList) {
        this.campaignList = campaignList;
    }

    public void addCampaign(Campaign campaign){
        campaignList.add(campaign);
    }

  /*   @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", loanList=" + loanList +
                '}';
    }*/
}
