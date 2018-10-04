
package modul4;

public class operasi implements Kalkulator {

    private double Bil1, Bil2;

    public double getBil1;
    public double getBil2;

    operasi(double a, double b) {
    }

    operasi() {
    }

    @Override
    public double penjumlahan() {
        return Bil1 + Bil2;
    }

    @Override
    public double pengurangan() {
        return Bil1 - Bil2;
    }

    @Override
    public double perkalian() {
        return Bil1 * Bil2;
    }

    @Override
    public double pembagian() {
        return Bil1 / Bil2;
    }

}
