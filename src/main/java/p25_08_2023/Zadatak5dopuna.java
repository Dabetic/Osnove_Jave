package p25_08_2023;

public class Zadatak5dopuna {
    public static void main(String[] args) {

        int m = 10;

        for (int i = 1; i <= m ; i++) {
            zvezdice(i);
        }


    }

    public static void zvezdice(int z) {

        for (int i = 0; i < z; i++) {
            System.out.print("*");

        }

        System.out.println(" ");

    }

}


