package creational.prototype;

public class Shoe {
    private String brand;
    private int size;
    private Quality quality;

    public Shoe(int size, String brand, Quality quality){
        this.size =size;
        this.brand = brand;
        this.quality = quality;
    }

    public String getBrand() {
        return brand;
    }
    public int getSize() {
        return size;
    }
    public Quality getQuality() {
        return quality;
    }
    @Override
    public String toString() {
        return "Shoe{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", quality=" + quality +
                '}';
    }

}
