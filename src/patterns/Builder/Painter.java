package patterns.Builder;

/**
 * Created by Antonina_Mykhailenko on 16.09.2015.
 */
public class Painter {
    private PictureBuilder pictureBuilder;

    public void setPictureBuilder(PictureBuilder pictureBuilder){
        this.pictureBuilder = pictureBuilder;
    }

    public Picture getPicture(){
        return pictureBuilder.getPicture();
    }

    public void  paintPicture(){
        pictureBuilder.paintNewPicture();
        pictureBuilder.buildPictureWithPaper();
        pictureBuilder.buildPictureWithFrame();
        pictureBuilder.buildPicturePaintedByTool();
    }
}
