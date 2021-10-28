public class Dieselbil extends Bil{

    private boolean harPartikelfilter;
    private int kmPrL;

    public Dieselbil(int regNr, String mærke, String model, int årgang, int antalDøre, boolean harPartikelfilter, int kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrL = kmPrL;
    }

    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    double grønEjerafgift() {
        int afgift=0;
            if (harPartikelfilter == true) {
                afgift = 1000;
            }

        if (kmPrL >= 20 && kmPrL <= 50) {
            return 330+130+afgift;
        } else if (kmPrL >= 15 && kmPrL <= 20) {
            return 1050+1390+afgift;
        } else if (kmPrL >= 10 && kmPrL <= 15) {
            return 2340+1850+afgift;
        } else if (kmPrL >= 5 && kmPrL <= 10) {
            return 5500+2770+afgift;
        } else if (kmPrL <= 5) {
            return 10470+15260+afgift;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Dieselbil{ " +
                "harPartikelfilter=" + harPartikelfilter +
                ", kmPrL=" + kmPrL +
                ", " + super.toString();
    }
}
