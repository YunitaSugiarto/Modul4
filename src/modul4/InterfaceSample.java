
package modul4;

public class InterfaceSample {
    
    public static void main(String[] args){
        
        InterfaceBujurSangkar obyek1 = new InterfaceBujurSangkar(10){};
        System.out.println("Luas bujur sangkar dengan sisi 10 = " + obyek1.hitungLuas());
        System.out.println("Kelilingnya = " + obyek1.hitungKeliling());
        System.out.println("\n");
        
        InterfaceBangunDatar obyek2 = new InterfaceSegitiga(6,8){};
        System.out.println("Luas segitiga dengan alas 6, dan tinggi 8 = " + obyek2.hitungLuas());
        System.out.println("Kelilingnya = " + obyek2.hitungKeliling());
    }
}