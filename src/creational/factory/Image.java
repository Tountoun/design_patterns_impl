package creational.factory;

public abstract class Image {
    private String filename;
    public Image(String filename){
        this.filename = filename;
    }
    public abstract void loadImage();
    public abstract  void saveImage();

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
