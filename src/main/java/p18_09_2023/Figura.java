package p18_09_2023;

//Kreirati abstraktnu klasu Figura koja ima
//abstraktnu metodu povrsina
//abstraktnu metodu obim
//metodu koja stampa podatke u formatu:
//Povrsina je (povrsina)
//Obim je (obim)

public abstract class Figura {

    protected abstract double povrsina ();
    protected abstract double obim ();


    public Figura() {
    }

    public void stampanje() {
        System.out.println("Provrsina je: " + this.povrsina());
        System.out.println("Obim je: " + this.obim());
    }


}
