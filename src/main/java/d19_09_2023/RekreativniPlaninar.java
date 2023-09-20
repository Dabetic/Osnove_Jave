package d19_09_2023;

public class RekreativniPlaninar extends Planinar {


    public RekreativniPlaninar(int idInt, String imeIPrezime, int tezinaOpreme, String okrugOdakleJeRekreativniPlaninar, int maxUsponKojiPlanSavladaBezOpreme, int clanarinaZaRekreativce) {
        super(idInt, imeIPrezime);
        this.tezinaOpreme = tezinaOpreme;
        this.okrugOdakleJeRekreativniPlaninar = okrugOdakleJeRekreativniPlaninar;
        this.maxUsponKojiPlanSavladaBezOpreme = maxUsponKojiPlanSavladaBezOpreme;
        this.clanarinaZaRekreativce = clanarinaZaRekreativce;
    }

    private int tezinaOpreme;
    private String okrugOdakleJeRekreativniPlaninar;

    private int maxUsponKojiPlanSavladaBezOpreme;


//    jos jedan atribut


    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getOkrugOdakleJeRekreativniPlaninar() {
        return okrugOdakleJeRekreativniPlaninar;
    }

    public int getMaxUsponKojiPlanSavladaBezOpreme() {
        return maxUsponKojiPlanSavladaBezOpreme;
    }

    public int getClanarinaZaRekreativce() {
        return clanarinaZaRekreativce;
    }

    private int clanarinaZaRekreativce;


    @Override
    public double clanarinaPlaninara() {
        return 1000;
    }

    @Override
    public boolean daLiJeUspesanUspon(Planina unesiPlaninu) {
        return unesiPlaninu.getVisina() < maxUsponKojiPlanSavladaBezOpreme;
    }

    @Override
    public void stampanje() {
        System.out.println("ID rekreativca: " + this.idInt);
        System.out.println("Ime i prezime: " + this.imeIPrezime);
        System.out.println("Okrug: " + this.okrugOdakleJeRekreativniPlaninar);
    }


}
