package ss15_Exception.BaiTap.SuDungLopIIIelagalTriangleException;

public class Triagle {
    private double a;
    private double b;
    private double c;

    public Triagle() {
    }

    public Triagle(double a, double b, double c) throws TriangleEdegesException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new TriangleEdegesException("Tam giác lỗi \n Mời nhập lại");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triagle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
