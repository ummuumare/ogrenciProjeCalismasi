public class Ogrenci {
    private String isim;
    private String cinsiyet;
    private double boy;
    private double kilo;

    public Ogrenci(String isim, String cinsiyet, double boy, double kilo) {
        this.isim = isim;
        this.cinsiyet = cinsiyet;
        this.boy = boy;
        this.kilo = kilo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }


    @Override
    public String toString() {
        return "Ogrenci{" +
                "isim='" + isim + '\'' +
                ", cinsiyet='" + cinsiyet + '\'' +
                ", boy=" + boy +
                ", kilo=" + kilo +
                '}';
    }


}
