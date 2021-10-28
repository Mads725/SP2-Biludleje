public class Main {

    public static void main(String[] args) {

        Garage g = new Garage("Nørregade 10001");

        Bil bil1 = new Benzinbil(198374, "Audi", "R6", 2019, 4, 95,11);
        Bil bil2 = new Dieselbil(6178416, "Ford", "Focus", 2020,4, true, 13);
        Bil bil3 = new Elbil(858745, "Tesla", "X", 2021, 4,100,547,200);

        g.tilføjBil(bil1);
        g.tilføjBil(bil2);
        g.tilføjBil(bil3);

        System.out.println(g.toString());

        System.out.println(g.beregnGrønAfgiftForBilpark());

    }
}
