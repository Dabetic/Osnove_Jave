package p11_09_2023;

public class Reziser {

    private String imeIPrezime;
    private int starost;


    public Reziser (){

    }

    public String getImeIPrezime () {
        return this.imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime){
        this.imeIPrezime = imeIPrezime;
    }

    public int getStarost(){
        return this.starost;
    }

    public void setStarost(int starost){
        this.starost = starost;
    }

    public Reziser (String imeIPrezime, int starost) {
        this.imeIPrezime = imeIPrezime;
        this.starost = starost;
    }

    public void stampanjeRez () {
        System.out.println("Puno ime rezisera: " + imeIPrezime);
        System.out.println("Godine starosti: " + starost);
    }
}
