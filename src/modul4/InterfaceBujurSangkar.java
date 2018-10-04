
package modul4;

public class InterfaceBujurSangkar implements InterfaceBangunDatar {

    private double sisi;

    public InterfaceBujurSangkar(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return sisi * 4;
    }
}
