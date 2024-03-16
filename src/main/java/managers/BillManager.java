package main.java.managers;

import java.util.List;
import main.java.model.*;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class BillManager {
    private List<Bill> billList;

    public BillManager(){
        billList = new ArrayList<>();
    }
    public Bill createBill(String billID, Customer customer, BigDecimal amount, List<Goods> goodsList, LocalDate date) {
        Bill bill = new Bill(billID, customer, amount, goodsList, date);
        billList.add(bill);
        return bill;
    }
}
