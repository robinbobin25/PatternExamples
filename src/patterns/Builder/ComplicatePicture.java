package patterns.Builder;

/**
 * Created by Antonina_Mykhailenko on 16.09.2015.
 */
public class ComplicatePicture extends PictureBuilder {

    public void buildPictureWithPaper(){
        picture.setPaper("--expensive japan paper--");
    }

    public void buildPictureWithFrame() {
        picture.setFrame("---expensive gold frame---");
    }

    public void buildPicturePaintedByTool() {
        picture.setTool("---painted by oil brushes---");
    }
}