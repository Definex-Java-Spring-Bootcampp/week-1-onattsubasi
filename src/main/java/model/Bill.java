package main.java.model;
import java.math.BigDecimal;
import java.util.List;
import main.java.model.*;
import java.time.LocalDate;

public class Bill {
    private String billID;
    private Customer customer;
    private BigDecimal amount;
    private List<Goods> goodsList;
    private LocalDate date;

    public Bill(String billID, Customer customer, BigDecimal amount, List<Goods> goodsList, LocalDate date) {
        this.billID = billID;
        this.customer = customer;
        this.amount = amount;
        this.goodsList = goodsList;
        this.date = date;
    }

    public String getBillID() {
        return billID;
    }

    public Customer getCustomer() {
        return customer;
    } 

    public BigDecimal getAmount() {
        return amount;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setBillID(String billID) {
        this.billID = billID;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public void addGoods(Goods goods){
        goodsList.add(goods);
    }

 }
