package creational.prototype;


import static org.junit.jupiter.api.Assertions.*;

public  class BookTest {

    public static void main(String[] args){
        ShopFactory factory = new ShopFactory();
        BookShop bookShop = new BookShop();
        BookShop cloned = (BookShop) factory.getClone(bookShop);
        System.out.println(bookShop.hashCode());
        System.out.println(cloned.hashCode());
    }
}