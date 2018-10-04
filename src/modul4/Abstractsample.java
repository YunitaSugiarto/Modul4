
package modul4;

public class Abstractsample {

    public static void main(String[] args) {

        BangunDatar obyek1 = new bujurSangkar(10);

        System.out.println("Luas bujur sangkar dengan sisi 10 = " + obyek1.hitungLuas());
        System.out.println("Kelilingnya : " + obyek1.hitungKeliling());
        System.out.println("\n");

        BangunDatar obyek2 = new lingkaran(7);

        System.out.println("Luas lingkaran dengan jari-jari 7 = " + obyek2.hitungLuas());
        System.out.println("Kelilingnya = " + obyek2.hitungKeliling());
    }
}
