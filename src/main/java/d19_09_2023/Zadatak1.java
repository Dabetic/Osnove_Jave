package d19_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Korpa korpa1 = new Korpa();
        SuperKartica superKartica1 = new SuperKartica(123,"Miki M",20);
        Ambalaza tp1 = new TetraPak("4567","Jogurt",200,300,true,120);
        Ambalaza tp2 = new TetraPak("7894","Mleko",900,1000,true,90);

        Ambalaza stakA1 = new StaklenaAmbalaza("1234","Pivo",450,500,100,true,150);


        korpa1.dodjaAmbalazuUNiz(tp1);
        korpa1.dodjaAmbalazuUNiz(tp2);
        korpa1.dodjaAmbalazuUNiz(stakA1);

        for (int i = 0; i < korpa1.getNizAmbalaza().size(); i++) {
            korpa1.getNizAmbalaza().get(i).stampanje();
        }

        korpa1.izbaciAmbalazuIzNiza("Mleko");
        System.out.println("************************");

        for (int i = 0; i < korpa1.getNizAmbalaza().size(); i++) {
            korpa1.getNizAmbalaza().get(i).stampanje();
        }

            System.out.println("Racun korpe sa popustom: " + korpa1.ukupnaCenaSaPopustomSuperKartice(superKartica1));
    }
}
