package main.java.model;
import java.time.LocalDate;
import java.util.List;
import main.java.model.*;
public class Customer extends User{
    private List<Order> orderList;
 public Customer(String name, String surname, LocalDate birthDate, String email, String password, String phoneNumber, Boolean isActive){
        super(name, surname, birthDate, email, password, phoneNumber, isActive);
 }   

 public void addOrder(Order order){
     orderList.add(order);
 }
}
