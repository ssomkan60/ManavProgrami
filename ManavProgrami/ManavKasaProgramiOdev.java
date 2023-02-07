import java.util.Scanner;
public class ManavKasaProgramiOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan = 5;
        double fiyat;

        System.out.print("Armut Kaç Kilo ?");
        double kilo1 = input.nextDouble();
        System.out.println("Elma Kaç Kilo ?");
        double kilo2 = input.nextDouble();
        System.out.println("Domates Kaç Kilo ?");
        double kilo3 = input.nextDouble();
        System.out.println("Muz Kaç Kilo ?");
        double kilo4 = input.nextDouble();
        System.out.println("Patlıcan Kaç Kilo ?");
        double kilo5 = input.nextDouble();

        double tutar = armut*kilo1 + elma*kilo2 + domates*kilo3 + muz*kilo4 + patlıcan*kilo5;
        System.out.println("Toplam Tutar:" + tutar);


    }
}
