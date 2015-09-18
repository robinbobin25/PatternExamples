package patterns.Builder;

/**
 * Created by Antonina_Mykhailenko on 16.09.2015.
 */
abstract class PictureBuilder {
    public Picture picture;

    public Picture getPicture(){
        return picture;
    }

    public void paintNewPicture(){
        picture = new Picture();
    }

    public abstract void buildPictureWithPaper();
    public abstract void buildPictureWithFrame();
    public abstract void buildPicturePaintedByTool();
}
