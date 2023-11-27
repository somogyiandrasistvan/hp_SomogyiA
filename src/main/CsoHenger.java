package main;

public class CsoHenger extends TomorHenger {

    private double falvastagsag;

    public CsoHenger(double sugar, double magassag, double falvastagsag) {
        super(sugar, magassag);
        this.falvastagsag = falvastagsag;
    }

    public CsoHenger(double sugar, double magassag, double fajSuly, double falvastagsag) {
        super(sugar, magassag, fajSuly);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    public double terfogat() {
        double sugar = this.getSugar();
        double belsoatmero = sugar - this.falvastagsag;
        double magassag = this.getMagassag();

        return ((Math.PI * (sugar * sugar)) * this.getMagassag()) - ((Math.PI * (belsoatmero * belsoatmero)) * magassag);
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + "\n\tCsoHenger{" + "falvastagsag=" + falvastagsag + '}';
    }

}
