package main.java.model;
import java.util.List;
import main.java.model.*;
import java.time.LocalDate;
public class Order {
    private String orderID;
    private List<Goods> goodsList;
    private Bill bill;
    private Customer customer;
    private LocalDate date;


    public Order(String orderID, Customer customer, List<Goods> goodsList, LocalDate date, Bill bill) {
        this.orderID = orderID;
        this.customer = customer;
        this.goodsList = goodsList;
        this.date = date;
        this.bill = bill;
   
    }
    
    public String getOrderID() {
        return orderID;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public Customer getCustomer() {
        return customer;
    }  

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }   

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    } 
    
    public void addGoods(Goods goods){
        goodsList.add(goods);
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Bill getBill() {
        return bill;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }



}
