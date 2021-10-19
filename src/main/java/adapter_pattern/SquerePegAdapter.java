package adapter_pattern;

public class SquerePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    public SquerePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        return  Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2);
    }
}
