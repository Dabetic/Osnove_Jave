package d08_09_2023;

public class Proizvod {

    String nazivP;
    double cenaP;
    double tezinaP;



    public void stampanje() {

        System.out.println("******************************");

        System.out.print("Naziv proizvoda: " + this.nazivP);
        System.out.print(" Cena: " + this.cenaP + " din ");
        System.out.println(" Tezina: " + this.tezinaP + " gr ");

        System.out.println("******************************");

    }

    public void povecajCenu(double novaVrednost) {

        this.cenaP = novaVrednost;

    }

    public void racunajPostarinu () {

        if(this.tezinaP <= 100 ) {
            System.out.println("Postarina iznosi 200 din");
        }
        if(this.tezinaP >= 101 && this.tezinaP <= 500 ) {

            System.out.println("Postarina iznosi 400 din");
        }
        if(this.tezinaP > 500) {

            System.out.println("Postarina iznosi 1000 din");
        }

    }

}
