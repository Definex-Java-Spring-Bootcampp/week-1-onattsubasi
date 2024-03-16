package main.java.managers;

import java.util.List;
import main.java.model.*;
import java.util.ArrayList;
import java.time.LocalDate;
public class CustomerManager {
    private List<Customer> customerList;
    public CustomerManager() {
        customerList = new ArrayList<>();
    }

    public synchronized Customer createCustomer(String name, String surname, LocalDate birthDate, String email, String password, String phoneNumber, Boolean isActive) {
        Customer customer = new Customer(name, surname, birthDate, email, password, phoneNumber, isActive);
        customerList.add(customer);
        return customer;
    }




}
