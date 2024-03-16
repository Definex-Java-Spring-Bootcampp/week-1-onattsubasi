package main.java.managers;

import java.util.List;
import main.java.model.*;
import java.util.ArrayList;
import java.time.LocalDate;
public class OrderManager {
    private List<Order> orderList;

    public OrderManager(){
        orderList = new ArrayList<>();
    }

    public synchronized Order creatOrder(String orderID, Customer customer, List<Goods> goodsList, LocalDate date, Bill bill) {
        Order order = new Order(orderID, customer, goodsList, date, bill);
        orderList.add(order);
        if(customer.getOrderList()!=null){
            customer.getOrderList().add(order);
        }
        else{
            List<Order> orderList = new ArrayList<>();
            orderList.add(order);
            customer.setOrderList(orderList);
        }
        return order;
    }

    public synchronized List<Order> getOrderList() {
        return orderList;
    }
    public synchronized void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
