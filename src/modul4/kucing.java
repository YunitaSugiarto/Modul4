
package modul4;

public class kucing extends Hewan {

    @Override
    void setNama() {
        String kucing = "Carberus";
        System.out.println("Nama Kucing : " + kucing);
    }

    @Override
    void setSuara() {
        String suara = "Miaw Meow Meong";
        System.out.println("Suara kucing : " + suara);
    }

    @Override
    void setBerat() {
        double berat = 2.0;
        System.out.println("Berat kucing : " + berat + "kg");
    }
}
