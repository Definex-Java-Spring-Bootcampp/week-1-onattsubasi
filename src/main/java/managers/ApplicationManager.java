package main.java.managers;
import java.time.LocalDateTime;
import java.util.List;

import main.java.model.Application;
import main.java.model.CreditCard;
import main.java.model.Loan;
import main.java.model.User;

import java.util.ArrayList;

public class ApplicationManager {
    private List<Application> applications;

    public ApplicationManager() {
        applications = new ArrayList<>();
    }

    public synchronized Application createApplication(String name, Object parameter, User user, LocalDateTime localDateTime) {
        Application temp = null;
        if (parameter instanceof Loan) {
            temp= new Application(name, (Loan)parameter, user, localDateTime);
        } else if (parameter instanceof CreditCard){
            temp = new Application(name, (CreditCard)parameter, user, localDateTime);
        } else {
            System.out.println("Invalid Object parameter type! ");
            return null;
        } 
        if(user.getApplicationList() == null) {
            List<Application> app = new ArrayList<>();
            user.setApplicationList(app);
        }
        user.addApplication(temp);
        applications.add(temp);

        return temp;
    } 
    
    // suan istege gore sadece isimleri donduruluyor. listeye cevrilebilir
    public synchronized void listApplicationsByLastMonth() {
        
        applications.forEach(a -> {
            if(a.getLocalDateTime().isAfter(LocalDateTime.now().minusMonths(1))) {
                System.out.println(a.getName());
            }
        });
    }
}
