package modul4;

public class LakiLaki extends Manusia {

    public LakiLaki(double TB) {
        super(TB);
    }

    @Override
    public double HtgBBI() {
        return (super.getTB() - 100) * 0.9;
    }
}
