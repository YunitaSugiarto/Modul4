package modul4;

public class Perempuan extends Manusia {

    public Perempuan(double TB) {
        super(TB);
    }

    @Override
    public double HtgBBI() {
        return (super.getTB() - 100) * 0.8;
    }
}
