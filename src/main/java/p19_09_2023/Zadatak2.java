package p19_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        Discipline skokUDalj = new Discipline("Skok u dalj" , "Skakanje");
        Discipline trkajnje = new Discipline("Trkanje na 100m sa prepornama", "Trka");

        Atleticar s1 = new Skakac("Milos M",7.8);
        Atleticar s2 = new Skakac("Milan B",9.7);
        Atleticar s3 = new Skakac("Branko D",5.6);

        Atleticar t1 = new Trkac("Janko J",1);
        Atleticar t2 = new Trkac("Marko S",3);


        skokUDalj.dodajAtleticara(s1);
        skokUDalj.dodajAtleticara(s2);
        skokUDalj.dodajAtleticara(s3);

        trkajnje.dodajAtleticara(t1);
        trkajnje.dodajAtleticara(t2);

        for (int i = 0; i < skokUDalj.nizAtleticaraUDiciplini.size(); i++) {
            System.out.println(skokUDalj.nizAtleticaraUDiciplini.get(i).imeIprezime);
        }
        System.out.println("****************");

        skokUDalj.diskvalifikujAtleticara("Branko D");

        for (int i = 0; i < skokUDalj.nizAtleticaraUDiciplini.size(); i++) {
            System.out.println(skokUDalj.nizAtleticaraUDiciplini.get(i).imeIprezime);
        }

        System.out.println("****************");

        boolean prviJeBolji = s1.kojiJeBolji(s2);


        if(prviJeBolji) {
            System.out.println("Bolji je skakac: ");
            s1.stampanje();
            System.out.println("Od ");
            s2.stampanje();
        } else {
            System.out.println("Bolji je skakac: ");
            s2.stampanje();
            System.out.println("Od ");
            s1.stampanje();
        }

    }
}
