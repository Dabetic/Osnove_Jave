package p18_09_2023;

public class StudentOsnovnih extends Student{



    public StudentOsnovnih(String imeIPrezime, int brojIndeksa, int godinaStudija) {
        super(imeIPrezime, brojIndeksa, godinaStudija);
    }

    @Override
    public int cenaSkolarine () {
        return 90000;
    }


    @Override
    boolean buzdetSmofinansiranje() {
     if(getGodinaStudija()<5) {
                return true;
            }
            return false;
        }
    }




