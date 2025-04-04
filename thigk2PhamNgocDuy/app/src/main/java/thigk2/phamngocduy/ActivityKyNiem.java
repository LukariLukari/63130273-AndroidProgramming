package thigk2.phamngocduy;

public class ActivityKyNiem {
    private String name;
    private int imageResId;

    public ActivityKyNiem(String name, int imageResId) {
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