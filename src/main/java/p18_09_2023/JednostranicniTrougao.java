package p18_09_2023;

public class JednostranicniTrougao extends Figura{


    public double a;

    public JednostranicniTrougao(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    protected double povrsina() {
        return (a * a) * 1.73205 / 4;
    }

    @Override
    protected double obim() {
        return a + a + a;
    }
}
