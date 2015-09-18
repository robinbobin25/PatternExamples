package patterns.Builder;

import java.util.List;

/**
 * Created by Antonina_Mykhailenko on 16.09.2015.
 */
public class Picture {

    private String paper = null;
    private String frame = null;
    private String tool = null;

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

}
