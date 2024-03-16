package main.java.managers;
import java.math.BigDecimal;
import java.util.List;
import main.java.model.*;
import java.time.LocalDate;
import java.util.ArrayList;
public class GoodsManager {
    private List<Goods> goodsList;

    public GoodsManager() {
        goodsList = new ArrayList<>();
    }

    public synchronized Goods createGoods(String name, BigDecimal price, Integer stock, String category) {
        Goods goods = new Goods( name, price, stock, category);
        goodsList.add(goods);
        return goods;
    }

    public synchronized List<Goods> getGoodsList() {
        return goodsList;
    }
    public synchronized void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

}
