package creational.factory;

public class ImageJpg extends Image{
    public ImageJpg(String filename) {
        super(filename);
    }

    @Override
    public void loadImage() {
        System.out.println("Loading jpg image...");
    }

    @Override
    public void saveImage() {
        System.out.println("Saving jpg image...");
    }
}
