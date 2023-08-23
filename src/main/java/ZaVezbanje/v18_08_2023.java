package ZaVezbanje;

public class v18_08_2023 {
    public static void main(String[] args) {
        for(int i=1; i<=50; i++) {

            if (i%2 == 0) {
                System.out.print("|");
            } else {
                System.out.print("_");

            }

            if(i%10 == 0 ) {
                System.out.println("");
            }
    }
} }

