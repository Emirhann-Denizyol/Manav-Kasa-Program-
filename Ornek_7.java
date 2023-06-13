import java.util.Scanner;

public class Ornek_7 {
    public static void main(String[] args) {
        final double armut = 2.14;
        final double elma = 3.67;
        final double domates = 1.11;
        final double muz = 0.95;
        final double patlıcan = 5.00;
        double kg, toplam =0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç kg armut : ");
        kg = scanner.nextDouble();
        toplam += kg * armut;
        System.out.println("kaç kg elma : ");
        kg = scanner.nextDouble();
        toplam += kg * elma;
        System.out.println("kaç kg domates : ");
        kg = scanner.nextDouble();
        toplam += kg * domates;
        System.out.println("kaç kg muz : ");
        kg = scanner.nextDouble();
        toplam += kg * muz;
        System.out.println("kaç kg patlıcan : ");
        kg = scanner.nextDouble();
        toplam += kg * patlıcan;
        System.out.println("Toplam tutar : " + toplam);
    }
}
