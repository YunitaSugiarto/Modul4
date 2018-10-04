
package modul4;

import java.util.Scanner;

class Utama {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        operasi o;
        o = new operasi();

        System.out.println("Masukkan bil pertama : ");
        double a = input.nextDouble();
        System.out.println("Masukkan bil kedua : ");
        double b = input.nextDouble();

        o = new operasi(a, b);

        System.out.println(" ");

        System.out.println("Hasil penjumlahan : ");
        o.penjumlahan();

        System.out.println("Hasil pengurangan");
        o.pengurangan();

        System.out.println("Hasil perkalian : " + o.perkalian());

        System.out.println("Hasil pembagian : " + o.pembagian());
    }
}
