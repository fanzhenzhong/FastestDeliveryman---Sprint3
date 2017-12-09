package sprint_3;

import java.util.*;

// Author: Low Kah Yee 
//For Sprint3
public class Service {

    private String foodName;
    private String description;
    private String foodCat;
    private String status;
    private String price;
    private String promoRate;
    private String foodID;

    public Service(String foodID, String foodName, String description, String foodCat, String status, String price, String promoRate) {
        this.foodID = foodID;
        this.foodName = foodName;
        this.description = description;
        this.foodCat = foodCat;
        this.status = status;
        this.price = price;
        this.promoRate = promoRate;
    }

    public void setFoodID(String foodID) {
        this.foodID = foodID;
    }

    public String getFoodID() {
        return foodID;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }

    public String getDesc() {
        return description;
    }

    public void setFoodCat(String foodcat) {
        this.foodCat = foodcat;
    }

    public String getFoodCat() {
        return foodCat;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setPromoRate(String promorate) {
        this.promoRate = promorate;
    }

    public String getPromoRate() {
        return promoRate;
    }

    public String toString() {
        return String.format("%-7s %-25s %-29s %-13s %-13s %-10s %-8s", foodID, foodName, description, foodCat, status, price, promoRate);
    }
}