import main.java.managers.*;
import main.java.model.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws Exception {
        UserManager userManager = UserManager.getInstance();
        ApplicationManager appManager = new ApplicationManager();
        LoanManager loanManager = new LoanManager();
        CampaignManager campaignManager = new CampaignManager();
        CreditCardManager creditCardManager = new CreditCardManager();
        BankManager bankManager = new BankManager();

        //ayni kullanici hatasi user3'te vermeli
        User user1 = userManager.createUser("Ahmet", "Yilmaz", LocalDate.of(1991,1,7), "ahmetyilmaz@gmail.com", "password123" ,"5428324321", true);
        User user2 = userManager.createUser("Mehmet", "Yildirim", LocalDate.of(1981,5,24), "mehmetyildirim@gmail.com", "password1234" ,"5328524221", true);
        User user3 = userManager.createUser("Ahmet", "Yilmaz", LocalDate.of(1991,11,6), "ahmetyilmaz@gmail.com", "password123" ,"5428324321", true);
        User user4 = userManager.createUser("onat", "subasi", LocalDate.of(1991,5,7), "cemdrman@gmail.com", "password123" ,"5428324321", true);
        
        userManager.listuserList();
        Bank bank1 = bankManager.createBank("Bank1");
        Bank bank2 = bankManager.createBank("Bank2");
        Loan loan1 = loanManager.createLoan("house", new BigDecimal(500000), 12, 0.1, bank1);
        Loan loan2 = loanManager.createLoan("house", new BigDecimal(100000), 12, 0.1, bank2);
        Loan loan3 = loanManager.createLoan("vehicle", new BigDecimal(200000), 12, 0.1, bank2);
        Loan loan4 = loanManager.createLoan("consumer", new BigDecimal(300000), 12, 0.1, bank1);
        CreditCard card1 = creditCardManager.createCreditCard(new BigDecimal(500000), bank1);
        CreditCard card2 = creditCardManager.createCreditCard(new BigDecimal(100000), bank2);
        CreditCard card3 = creditCardManager.createCreditCard(new BigDecimal(200000), bank2);
        Campaign camp1 = campaignManager.createCampaign("camp1", null, null, null, null, null, bank1, loan1);
        Campaign camp2 = campaignManager.createCampaign("camp2", null, null, null, null, null,bank1,loan2);
        Campaign camp3 = campaignManager.createCampaign("camp3", null, null, null, null, null, bank2, loan3);
        Campaign camp4 = campaignManager.createCampaign("camp4", null, null, null, null, null, bank2, loan4);
        Campaign camp5 = campaignManager.createCampaign("camp5", null, null, null, null, null, bank1, card1);
        Campaign camp6 = campaignManager.createCampaign("camp6", null, null, null, null, null, bank1, card2);
        Campaign camp7 = campaignManager.createCampaign("camp7", null, null, null, null, null, bank1, card3);

        Application application1 = appManager.createApplication("application1", loan1, user1, LocalDateTime.of(2024, 3, 15, 20, 1, 1));
        System.out.println(application1.getLoan());
        Application application2 = appManager.createApplication("application2",loan2, user2, LocalDateTime.of(2024, 3, 15, 20, 1, 1));   
        System.out.println(application2.getLoan().getAmount());
        Application application3 = appManager.createApplication("application3",loan3, user3, LocalDateTime.of(2023, 3, 15, 20, 1, 1));   
        Application application4 = appManager.createApplication("application4",card1, user4, LocalDateTime.of(2023, 3, 15, 20, 1, 1));
        Application application5 = appManager.createApplication("application5",card2, user1, LocalDateTime.of(2024, 3, 15, 20, 1, 1));

        //en cok basvuru yapan kisi
        System.out.println(userManager.getMaxAppliedUser());

        //en yuksek tutarlı kredi basvurusu yapan kisi ve tutarı
        System.out.println(userManager.userWithMaxLoanApplied());
        // son bir ayda yapilan basvurular
        appManager.listApplicationsByLastMonth();

        //Kampanya sayısını coktan aza listeleme
        campaignManager.sortCreditCardCampaignByNumber();

        //spesifik mail adresinin ship oldugu basvurular
        System.out.println(userManager.getApplicationsByUser(user4.getEmail()));



        CustomerManager customerManager = new CustomerManager();
        BillManager billManager = new BillManager();
        OrderManager orderManager = new OrderManager();
        GoodsManager goodsManager = new GoodsManager();

        Customer customer1 = customerManager.createCustomer("Ahmet", "Yilmaz", LocalDate.of(1991,1,7), "ahmetyilmaz", "password123" ,"5428324321", true);
        Goods goods1 = goodsManager.createGoods("goods1", new BigDecimal(100), 10, "category1");
        Goods goods2 = goodsManager.createGoods("goods2", new BigDecimal(200), 20, "category2");
        Goods goods3 = goodsManager.createGoods("goods3", new BigDecimal(300), 30, "category3");
        List<Goods> goodsList = List.of(goods1, goods2, goods3);
        Bill bill1 = billManager.createBill("bill1", customer1, new BigDecimal(500), goodsList, LocalDate.of(2021, 3, 15));
        Order order1 = orderManager.creatOrder("order1", customer1, goodsList, LocalDate.of(2021, 3, 15), bill1);
        System.out.println(orderManager.getOrderList());


    }
}
