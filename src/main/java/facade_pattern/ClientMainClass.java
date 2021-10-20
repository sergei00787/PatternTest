package facade_pattern;

public class ClientMainClass {
    public static void main(String[] args) {
        VideoConversionFacade videoConversionFacade = new VideoConversionFacade();
        videoConversionFacade.convertVideo("file1.ogg", "mp4");
    }
}
