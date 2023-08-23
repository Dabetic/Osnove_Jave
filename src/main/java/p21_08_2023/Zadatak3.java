package p21_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {

        String broj = "...";
        for (int i = 1; i <=10 ; i++) {

            if (i % 2 == 0) {
                broj = broj + i;

            } else {
                broj = i + broj ;
            }
        }

        System.out.println(broj);
    }
}
