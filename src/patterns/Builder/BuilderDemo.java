package patterns.Builder;

/**
 * Created by Antonina_Mykhailenko on 18.09.2015.
 */
public class BuilderDemo {
    public static void main(String[] args) {
        Painter painter = new Painter();
        PictureBuilder simplePictureBuilder = new SimplePicture();

        painter.setPictureBuilder(simplePictureBuilder);
        painter.paintPicture();

        Picture picture = painter.getPicture();
    }
}
