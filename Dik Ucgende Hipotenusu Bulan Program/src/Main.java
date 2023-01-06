import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b;
        System.out.print("Kısa Kenarı Giriniz : " );
        a = input.nextDouble();
        System.out.print("Uzun Kenarı Giriniz : " );
        b = input.nextDouble();
        double c = Math.sqrt((b * b) + (a * a));
        System.out.println("Hipotenüs : " + c);
        double u = (a + b + c)/2;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı : " + alan);
    }

}