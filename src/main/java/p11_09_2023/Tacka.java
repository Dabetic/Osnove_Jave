package p11_09_2023;

public class Tacka {

    private int x;
    private int y;


    public void stampanje() {

        System.out.println("Kordinata x = " + x);
        System.out.println("Kordinata y = " + y);

    }

    public Tacka (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Tacka () {

    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
