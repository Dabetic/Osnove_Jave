package d19_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        RekreativniPlaninar rp1 = new RekreativniPlaninar(11 , "Veljko V",50,"Valjevo" ,
                4000, 1000);
        RekreativniPlaninar rp2 = new RekreativniPlaninar(22 , "Petar V",70,"Nis" ,
                4000, 1000);
        Alpinista alp1 = new Alpinista(33, "Milan N",10);

        PlaninarskiDom pd1 = new PlaninarskiDom("Dom Planinara Nis", 1949);

        pd1.uclaniPlaninara(rp1);
        pd1.uclaniPlaninara(rp2);
        pd1.uclaniPlaninara(alp1);

        pd1.stampanjeDom();

        System.out.println("Ukopna clanarina na mesecnom nivou: " + pd1.mesecniPrihod() + " din");

        pd1.izbaciPlaninara(22);

        System.out.println("*******************");

        pd1.stampanjeDom();

        double clanarinaAlpiniste = alp1.clanarinaPlaninara();

        System.out.println("Clanarina alpinisite: " + clanarinaAlpiniste  + " din");

    }
}
