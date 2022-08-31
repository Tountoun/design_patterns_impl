package creational.factory;

public class ImagePng extends Image{
    public ImagePng(String filename) {
        super(filename);
    }

    @Override
    public void loadImage() {
        System.out.println("Loading png image...");
    }

    @Override
    public void saveImage() {
        System.out.println("Saving png image...");
    }
}
