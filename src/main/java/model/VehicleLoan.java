package main.java.model;

import main.java.enums.LoanType;
import main.java.enums.VehicleStatuType;

import java.math.BigDecimal;

public class VehicleLoan extends Loan {

    private LoanType loanType = LoanType.ARAC_KREDISI;
    private VehicleStatuType vehicleStatuType;

    public VehicleLoan() {

    }

    public VehicleLoan(BigDecimal amount, Integer installment, Double interestRate, Bank bank) {
        super(amount, installment, interestRate, bank);
    }

    public LoanType getLoanType() {
        return loanType;
    }

    @Override
    void calculate(BigDecimal amount, int installment) {
        //istediği kadar ödeme yapabilir.
    }
}
