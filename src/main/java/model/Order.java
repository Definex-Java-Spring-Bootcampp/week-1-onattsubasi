package main.java.model;
import java.util.List;
import main.java.model.*;
public class Order {
    private String orderID;
    private List<Goods> goodsList;
    private Bill bill;


    public Order(String orderID, List<Goods> goodsList) {
        this.orderID = orderID;
        this.goodsList = goodsList;
    }
    
    public String getOrderID() {
        return orderID;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
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
}
