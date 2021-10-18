package AdapterPattern;

public class Main {

    public static void main(String[] args) {
        RoundPeg roundPeg1 = new RoundPeg(5);
        RoundPeg roundPeg2 = new RoundPeg(7);

        RoundHole roundHole = new RoundHole(6);

        System.out.println(roundHole.fits(roundPeg1));
        System.out.println(roundHole.fits(roundPeg2));

        SquarePeg squarePeg = new SquarePeg(6);
        //roundHole.fits(squarePeg); // NOT COMPILE

        SquerePegAdapter squerePegAdapter = new SquerePegAdapter(squarePeg);
        System.out.println(roundHole.fits(squerePegAdapter));

    }
}
