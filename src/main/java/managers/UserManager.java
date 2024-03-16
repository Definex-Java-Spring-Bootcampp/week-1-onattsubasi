package main.java.managers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.time.LocalDate;
import main.java.model.Application;
import main.java.model.User;

import java.math.BigDecimal;

public class UserManager {
    private static UserManager instance;
    private List<User> userList;

    private UserManager() {
        userList = new ArrayList<>();
    }

    public static synchronized UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public synchronized User createUser(String name, String surname, LocalDate birthDate, String email, String password, String phoneNumber, Boolean isActive) {
        if(emailExists(email)) {
            System.out.println("This email is already registered.");
            return null;
        }
        User temp = new User(name, surname, birthDate, email, password, phoneNumber, isActive);
       
        userList.add(temp);
        return temp;
    }

    private boolean emailExists(String email) {
        return userList.stream().anyMatch(u -> u.getEmail().equals(email));
    }

    public synchronized Optional<User> findUserByEmail(String email) {
        return userList.stream().filter(u -> u.getEmail().equals(email)).findFirst();
    }

    public void listuserList() {
        userList.forEach(user -> System.out.println("Name: " + user.getName() + ", Email: " + user.getEmail()));
    }
    public String getMaxAppliedUser() {
        return userList.stream().max((u1, u2) -> u1.getApplicationList().size() - u2.getApplicationList().size()).orElse(null).getName();
    }
    public String getMinAppliedUser() {
        return userList.stream().min((u1, u2) -> u1.getApplicationList().size() - u2.getApplicationList().size()).orElse(null).getName();
    }
    public String userWithMaxLoanApplied() {
        BigDecimal max = new BigDecimal(0);
        User tempUser = null;
        for(User u : userList) {
            for(Application a : u.getApplicationList()) {
                if(a.getLoan() != null ) {
                    if(a.getLoan().getAmount().compareTo(max) > 0)
                    {
                        max = a.getLoan().getAmount();
                        tempUser = u;
                    }
                }
            }
        }
        return tempUser.getName() + " " + max.toString();
    }

    public List<Application> getApplicationsByUser(String mail) {
        User user = findUserByEmail(mail).orElse(null);
        if(user == null) {
            System.out.println("User not found");
        }
        return user.getApplicationList();
    }
}