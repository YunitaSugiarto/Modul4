
package modul4;

public class InterfaceSegitiga implements InterfaceBangunDatar {
    private double alas;
    private double tinggi;
    
    public InterfaceSegitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return ((alas * tinggi)/2);
    }

    @Override
    public double hitungKeliling() {
        return 2 * alas + tinggi;
    }
    
}
