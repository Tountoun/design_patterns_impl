package creational.prototype;

public class ShopFactory {
    public IShop getClone(IShop shop){
        return shop.makeCopy();
    }
}
