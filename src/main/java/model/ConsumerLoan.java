package main.java.model;


import main.java.enums.LoanType;

import java.math.BigDecimal;
import java.util.List;

public class ConsumerLoan extends Loan {

    private LoanType loanType = LoanType.IHTIYAC_KREDISI;
    private List<Integer> installmentOptions;

    public ConsumerLoan() {

    }

    public ConsumerLoan(BigDecimal amount, Integer installment, Double interestRate, Bank bank) {
        super(amount, installment, interestRate, bank);
    }

    public LoanType getLoanType() {
        return loanType;
    }

    @Override
    void calculate(BigDecimal amount, int installment) {
        //tc bul, maaşı bul
    }


}
