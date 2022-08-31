package creational.factory;

public class ImageGif extends Image{
    public ImageGif(String filename) {
        super(filename);
    }

    @Override
    public void loadImage() {
        System.out.println("Loading gif image...");
    }

    @Override
    public void saveImage() {
        System.out.println("Saving gif image...");
    }
}
