public class Benzinbil extends Bil{

    private int oktantal;
    private int kmPrL;

    public Benzinbil(int regNr, String mærke, String model, int årgang, int antalDøre, int oktantal, int kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktantal = oktantal;
        this.kmPrL = kmPrL;
    }

    public int getOktantal() {
        return oktantal;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    double grønEjerafgift() {

        if (kmPrL >= 20 && kmPrL <= 50) {
            return 330;
        } else if (kmPrL >= 15 && kmPrL <= 20) {
            return 1050;
        } else if (kmPrL >= 10 && kmPrL <= 15) {
            return 2340;
        } else if (kmPrL >= 5 && kmPrL <= 10) {
            return 5500;
        } else if (kmPrL <= 5) {
            return 10470;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Benzinbil{ " +
                "oktantal=" + oktantal +
                ", kmPrL=" + kmPrL +
                ", " + super.toString();
    }
}
