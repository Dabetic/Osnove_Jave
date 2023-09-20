package p18_09_2023;

public class StudentMaster extends Student {


    public StudentMaster(String imeIPrezime, int brojIndeksa, int godinaStudija) {
        super(imeIPrezime, brojIndeksa, godinaStudija);
    }
    @Override
    int cenaSkolarine() {
        return 10000;
    }

    @Override
    boolean buzdetSmofinansiranje() {
      return this.godinaStudija < 2;
    }
}
