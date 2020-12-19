package byExample;

public enum Color {

    RED(123),
    BLUE(566);

    private int rgb;

    public int getRgb() {
        return rgb;
    }

    Color(int rgb) {
        this.rgb = rgb;
    }
}

