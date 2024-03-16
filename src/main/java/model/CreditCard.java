package main.java.model;

import java.math.BigDecimal;
import java.util.List;

public class CreditCard implements Product{

    private BigDecimal fee;
    private List<Campaign> campaignList;
    private Bank bank;

    public CreditCard(BigDecimal fee, Bank bank) {
        this.fee = fee;
        this.bank = bank;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public List<Campaign> getCampaignList() {
        return campaignList;
    }

    public void setCampaignList(List<Campaign> campaignList) {
        this.campaignList = campaignList;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void addCampaign(Campaign campaign){
        campaignList.add(campaign);
    }

    // @Override
    // public String toString() {
    //     return "CreditCard{" +
    //             "fee=" + fee +
    //             ", campaignList=" + campaignList +
    //             ", bank=" + bank +
    //             '}';
    // }
}
