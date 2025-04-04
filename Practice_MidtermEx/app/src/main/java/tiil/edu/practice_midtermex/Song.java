package tiil.edu.practice_midtermex;

public class Song {
    private String name;
    private int imageResId;

    public Song(String name, int imageResId) {
        this.name = name;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }
}