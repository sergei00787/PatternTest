package AdapterPattern;

public class RoundHole {
    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg peg){
        return peg.getRadius() <= this.radius;
    }
}
