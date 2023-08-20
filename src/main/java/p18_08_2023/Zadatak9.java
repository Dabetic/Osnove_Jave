package p18_08_2023;

public class Zadatak9 {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;


        for (int i = 1; i < 11; i++) {

            if(i != a && i!=b) {
                System.out.print(i + ", ");
            } else {
                System.out.print("_ ");
            }
        }
    }


    }



