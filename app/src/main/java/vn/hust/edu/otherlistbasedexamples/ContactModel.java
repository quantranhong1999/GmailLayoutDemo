package vn.hust.edu.otherlistbasedexamples;

public class ContactModel {
    String fullname;
    String time;
    String title;
    String Des;
    int color;
    int avatarResource;
    boolean isSelected;


    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public ContactModel(String fullname, String time, String title, String des, int color, int avatarResource, boolean isSelected) {
        this.fullname = fullname;
        this.time = time;
        this.title = title;
        Des = des;
        this.color = color;
        this.avatarResource = avatarResource;
        this.isSelected = isSelected;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return Des;
    }

    public void setDes(String des) {
        Des = des;
    }

    public int getAvatarResource() {
        return avatarResource;
    }

    public void setAvatarResource(int avatarResource) {
        this.avatarResource = avatarResource;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }


}
