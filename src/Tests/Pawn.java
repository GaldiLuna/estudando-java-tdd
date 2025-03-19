package Tests;

public class Pawn {
    private String color;
    public static final String WHITE = "White";
    public static final String BLACK = "Black";

    public Pawn(String color) {
        this.color = color;
    }

    public Pawn() {
        this.color = "white";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
