package d08_09_2023;

public class FacebookPost {

    String imeOsobeObjavljivac;
    String imeOsobeNaCijemProfilu;
    String tekstObajve;
    int brojLajkova;
    int brojDeljenja;

    public int like (String likePlusjedan) {

        this.brojLajkova++;

        return brojLajkova;
    }

    public int dislike (String dislikePlusjedan) {

        this.brojLajkova--;

        if(this.brojLajkova <= 0) {

            return 0;
        }

        return brojLajkova;
    }

public int share(String sharePlusJedan) {

        brojDeljenja++;

        return brojDeljenja;
}

public void srampanje() {

    System.out.println("*************************");

    System.out.println(this.imeOsobeObjavljivac + " >>> " + this.imeOsobeNaCijemProfilu);
    System.out.println(this.tekstObajve);
    System.out.println(this.brojLajkova + " || " + brojDeljenja);

    System.out.println("*************************");

}




}
