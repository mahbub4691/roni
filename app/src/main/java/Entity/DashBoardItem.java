package Entity;

import android.media.Image;

/**
 * Created by Tanvir on 5/22/2015.
 */
public class DashBoardItem {

    int dashBoardimage;
    String dashBoardTitle;

    public DashBoardItem(int dashBoardimage, String dashBoardTitle) {
        this.dashBoardimage = dashBoardimage;
        this.dashBoardTitle = dashBoardTitle;
    }

    public int getDashBoardimage() {
        return dashBoardimage;
    }

    public void setDashBoardimage(int dashBoardimage) {
        this.dashBoardimage = dashBoardimage;
    }

    public String getDashBoardTitle() {
        return dashBoardTitle;
    }

    public void setDashBoardTitle(String dashBoardTitle) {
        this.dashBoardTitle = dashBoardTitle;
    }
}
