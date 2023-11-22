package main;

public class CsoHenger extends TomorHenger {

    private double falvastagsag;

    public CsoHenger(double falvastagsag, double fajsuly, double sugar, double magassag) {
        super(fajsuly, sugar, magassag);
        this.falvastagsag = falvastagsag;
    }

    public CsoHenger(double fajsuly, double sugar, double magassag) {
        super(fajsuly, sugar, magassag);
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    public double terfogat() {

        return 0;
    }

    @Override
    public String toString() {
        return "CsoHenger{" + "falvastagsag=" + falvastagsag + '}';
    }

}
