package main;

public abstract class TomorHenger extends Henger {

    private double fajsuly;

    public TomorHenger(double sugar, double magassag) {
        this(sugar, magassag, 1);
    }

    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public double suly() {

        return terfogat() * this.fajsuly;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + "\n\tTomorHenger{" + "fajsuly=" + fajsuly + '}';
    }

}
