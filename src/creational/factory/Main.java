package creational.factory;

public class Main {
    public static void main(String[] args){
        Factory factory = new ImageFactory();
        ImageJpg imageJpg = (ImageJpg) factory.createImage("cat.jpg");
        System.out.println(imageJpg.toString());
    }
}
