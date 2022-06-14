package ss6_Ke_thua.Bai_tap.Triangle;

public class Triangle {
    private double slide1=1d;
    private double slide2=1d;
    private double slide3=1d;

    public Triangle() {
    }

    public Triangle(double slide1, double slide2, double slide3) {
        this.slide1 = slide1;
        this.slide2 = slide2;
        this.slide3 = slide3;
    }

    public double getSlide1() {
        return slide1;
    }

    public void setSlide1(double slide1) {
        this.slide1 = slide1;
    }

    public double getSlide2() {
        return slide2;
    }

    public void setSlide2(double slide2) {
        this.slide2 = slide2;
    }

    public double getSlide3() {
        return slide3;
    }



    @Override
    public String toString() {
        return "Triangle{" +
                "slide1=" + slide1 +
                ", slide2=" + slide2 +
                ", slide3=" + slide3 +
                '}';
    }

    public void setSlide3(double slide3) {
        this.slide3 = slide3;
    }
}
