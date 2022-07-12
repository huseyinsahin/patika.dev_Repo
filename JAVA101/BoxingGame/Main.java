import javax.print.attribute.standard.Fidelity;

public class Main {
    public static void main(String[] args) {
        Fighter muhAli = new Fighter("Muhammed Ali", 20, 120, 85, 50);
        Fighter geoFor = new Fighter("George Foreman", 10, 100, 90, 50);

        Match match = new Match(muhAli, geoFor, 80, 100);
        match.start();
    }
}
