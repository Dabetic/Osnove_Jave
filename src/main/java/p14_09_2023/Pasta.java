package p14_09_2023;

//Kreirati klasu Pasta koja ima:
//niz sastojaka
//metodu za dodavanje sastojka
//defaultni konstruktor
//metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//metodu za stampu koja stampa podatke u formatu:
//Pasta je sa sastojcima:
//naziv - cena.din
//naziv - cena.din
//naziv - cena.din
//Cena paste je cena.din
//
//U glavnom programu kreirati objekte i testirati funkcionalnosti

import java.util.ArrayList;

public class Pasta {

private ArrayList <Sastojak>nizSastojaka = new ArrayList<>();

    public Pasta() {
        this.nizSastojaka = nizSastojaka;
    }
    public Pasta(ArrayList nizSastojaka) {
        this.nizSastojaka = nizSastojaka;
    }


    public void dodavanjeSastojaka (Sastojak sastojak) {
        nizSastojaka.add(sastojak);
    }

    public int metodaRacunanjeCene () {

        int suma = 0;

        for (int i = 0; i < this.nizSastojaka.size(); i++) {
            ;
            suma = suma + this.nizSastojaka.get(i).getCena();
        }
        return suma;
    }

//    public void brisanje () {
//        for (int i = 0; i < this.nizSastojaka.size() ; i++) {
//            nizSastojaka.remove()
//        }
//    }

    public void stampanje() {
        for (int i = 0; i < this.nizSastojaka.size(); i++) {
            System.out.println("Naziv paste: " + this.nizSastojaka.get(i).getSastojak() + " Cena: " + this.nizSastojaka.get(i).getCena());
        }
    }




}
