package creational.factory;

public class ImageFactory implements Factory{
    @Override
    public Image createImage(String filename) {
        Image image = null;
        String extension = filename.substring(filename.lastIndexOf(".")+1);
        image = switch (extension.toLowerCase()){
            case "png" -> new ImagePng(filename);
            case "jpg" -> new ImageJpg(filename);
            case "gif" -> new ImageGif(filename);
            default -> {throw new RuntimeException("File extension not supported");}
        };
        image.loadImage();

        return image;
    }
}
