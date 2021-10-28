import java.util.ArrayList;

public class Garage {

    private String garageNavn;
    private ArrayList<Bil> parkBil = new ArrayList<Bil>();

    public Garage(String garageNavn) {
        this.garageNavn = garageNavn;
    }

    public String getGarageNavn() {
        return garageNavn;
    }

    public void setGarageNavn(String garageNavn) {
        this.garageNavn = garageNavn;
    }

    public void tilføjBil(Bil bil) {
        parkBil.add(bil);
    }

    public double beregnGrønAfgiftForBilpark() {

        double totalAfgift = 0;
        for (Bil b : parkBil) {
            totalAfgift += b.grønEjerafgift();
        }
        return totalAfgift;
    }

    @Override
    public String toString() {

        String s = "" + garageNavn + ": ";
        for (Bil b : parkBil) {
            s += "\n";
            s += b.toString();
        }
        return s;

    }
}
