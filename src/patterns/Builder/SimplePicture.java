package patterns.Builder;

/**
 * Created by Antonina_Mykhailenko on 16.09.2015.
 */
public class SimplePicture extends PictureBuilder {

    public void buildPictureWithPaper(){
        picture.setPaper("--simple A4 paper--");
    }

    public void buildPictureWithFrame() {
        picture.setFrame("---no frame---");
    }

    public void buildPicturePaintedByTool() {
        picture.setTool("---painted by grey pencil---");
    }
}
