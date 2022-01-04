package Programs2.KickBox;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter ("Harry Potter",7,120,85,1);
        Fighter f2 = new Fighter ("Legolas",20,70,80,18);
        Fighter f3 = new Fighter ("Obi-Wan Kenobi",13,100,78,40);

        Match match = new Match(f2,f3,70,90);
        match.run();

    }
}
