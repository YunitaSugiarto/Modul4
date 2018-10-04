
package modul4;

public class Singa extends Hewan {

    @Override
    void setNama() {
        String singa = "Diablo";
        System.out.println("Nama Singa : " + singa);
    }

    @Override
    void setSuara() {
        String suara = "Roaaarrrr";
        System.out.println("Suara singa : " + suara);
    }

    @Override
    void setBerat() {
        double berat = 10.0;
        System.out.println("Berat singa : " + berat + "kg");
    }

}
