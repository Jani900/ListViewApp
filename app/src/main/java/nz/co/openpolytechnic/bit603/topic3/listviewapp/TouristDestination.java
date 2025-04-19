package nz.co.openpolytechnic.bit603.topic3.listviewapp;

import java.io.Serializable;

public class TouristDestination implements Serializable {
    private int imageSource;
    private String title;
    private String description;

    public TouristDestination(int imageSource, String title, String description) {
        this.imageSource = imageSource;
        this.title = title;
        this.description = description;
    }

    public int getImageSource() {
        return imageSource;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setImageSource(int imageSource) {
        this.imageSource = imageSource;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
