package creational.prototype;

import java.util.Arrays;
import java.util.List;

import static creational.prototype.Quality.*;

public class ShoeShop implements IShop{
    private List<Shoe> shoes = null;

    public ShoeShop(){
        this.fetchData();
    }

    @Override
    public IShop makeCopy() {
        IShop shop = null;
        try {
            shop = (ShoeShop) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return shop;
    }

    @Override
    public void fetchData() {
        // The data fetch in the database will be stored in shoes list
        this.shoes = Arrays.asList(
           new Shoe(32, "Nike", MEDIUM),
           new Shoe(45, "Addidas", HIGH),
           new Shoe(40, "Air Force", LOW)
        );
        System.out.println("Data fetched successfully");
    }

    @Override
    public String toString() {
        return "ShoeShop{" +
                "shoes=" + shoes +
                '}';
    }
}
