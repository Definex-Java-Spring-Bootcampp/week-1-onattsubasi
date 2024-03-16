package main.java.model;

import main.java.enums.SectorType;

import java.time.LocalDate;

public class Campaign {

    private String title;
    private String content;
    private LocalDate dueDate;
    private LocalDate createDate;
    private LocalDate updateDate;
    private SectorType sector;
    private Bank bank;
    private Loan loan;
    private CreditCard creditCard;

    public Campaign(String title, String content, LocalDate dueDate, LocalDate createDate, LocalDate updateDate, SectorType sector, Bank bank, Loan loan) {
        this.title = title;
        this.content = content;
        this.dueDate = dueDate;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.sector = sector;
        this.bank = bank;
        this.loan = loan;

    }
    public Campaign(String title, String content, LocalDate dueDate, LocalDate createDate, LocalDate updateDate, SectorType sector, Bank bank, CreditCard creditCard) {
        this.title = title;
        this.content = content;
        this.dueDate = dueDate;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.sector = sector;
        this.bank = bank;
        this.creditCard = creditCard;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public SectorType getSector() {
        return sector;
    }

    public void setSector(SectorType sector) {
        this.sector = sector;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    // @Override
    // public String toString() {
    //     return "Campaign{" +
    //             "title='" + title + '\'' +
    //             ", content='" + content + '\'' +
    //             ", dueDate=" + dueDate +
    //             ", createDate=" + createDate +
    //             ", updateDate=" + updateDate +
    //             ", sector=" + sector +
    //             '}';
    // }
}
