
package modul4;

public class bujurSangkar extends BangunDatar {

    public double sisi;

    public bujurSangkar(double sisi) {
        this.sisi = sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }
}
