package main.java.model;


import main.java.enums.ApplicationStatus;

import java.time.LocalDateTime;

public class Application {

    private Loan loan;
    private User user;
    private CreditCard creditCard;
    private LocalDateTime localDateTime;
    private ApplicationStatus applicationStatus;
    private String name;
    
    public Application(String name, CreditCard creditCard, User user, LocalDateTime localDateTime) {
        this.name = name;
        this.creditCard = creditCard;
        this.user = user;
        this.localDateTime = localDateTime;
        this.applicationStatus = ApplicationStatus.INITIAL;
    }

     public Application(String name, Loan loan, User user, LocalDateTime localDateTime) {
        this.name = name;
        this.loan = loan;
        this.user = user;
        this.localDateTime = localDateTime;
        this.applicationStatus = ApplicationStatus.INITIAL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public ApplicationStatus getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(ApplicationStatus applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    // @Override
    // public String toString() {
    //     return "Application{" +
    //             "loan=" + loan +
    //             ", user=" + user.getName() +
    //             ", localDateTime=" + localDateTime +
    //             ", applicationStatus=" + applicationStatus +
    //             '}';
    // }
}
