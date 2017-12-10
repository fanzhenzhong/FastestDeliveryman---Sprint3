/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint_3;

/**
 *
 * @author Alex
 */
public class RestaurantInfo {
    private String resName,Type;
    private int Rating,averPrice;
    private String location;

    public RestaurantInfo() {
    }

    public RestaurantInfo(String resName, String Type, int Rating, int averPrice, String location) {
        this.resName = resName;
        this.Type = Type;
        this.Rating = Rating;
        this.averPrice = averPrice;
        this.location = location;
    }

    
    
    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }

    public int getAverPrice() {
        return averPrice;
    }

    public void setAverPrice(int averPrice) {
        this.averPrice = averPrice;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "RestaurantInfo{" + "resName=" + resName + ", Type=" + Type + ", Rating=" + Rating + ", averPrice=" + averPrice + ", location=" + location + '}';
    }
    
    
}
