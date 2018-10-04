package modul4;

import java.util.Scanner;

class ManusiaUtama {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Manusia[] m = new Manusia[2];
        int x = 0;

        do {
            System.out.println("User " + (x + 1));
            System.out.print("Masukkan tinggi badan anda (cm) = ");
            double t = input.nextDouble();
            System.out.print("Masukkan jenis kelamin anda (L/P = ");
            String jk = input.next();

            if (jk.toUpperCase().equals("L")) {
                m[x] = new LakiLaki(t);
                System.out.println("Berat badan ideal Laki-Laki ini adalah" + m[x].HtgBBI());
                System.out.println();
            } else {
                m[x] = new Perempuan(t);
                System.out.println("Berat badan Perempuan ini adalah" + m[x].HtgBBI());
                System.out.println();
            }
            x++;
        } while (x < 2);

    }
}
