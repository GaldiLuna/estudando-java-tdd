package Tests;

public class Pawn {
    private String color;
    public static final String WHITE = "White";
    public static final String BLACK = "Black";
    //public static final String BLANK = "";

    public Pawn(String color) {
        this.color = color;
    }

    public Pawn() {
        this(WHITE);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
