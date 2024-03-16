package main.java.model;
import java.math.BigDecimal;

public class Goods {
    private String name;
    private BigDecimal price;
    private Integer stock;
    private String category;


    public Goods(String name, BigDecimal price, Integer stock, String category) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    public String getName() {
        return name;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public Integer getStock() {
        return stock;
    }

    public String getCategory() {
        return category;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }
}
