package p17_08_2023;

import java.util.Scanner;

public class UvodGrananje2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if ( a < 0 ) {
            System.out.println("Broj nije validan ");
        }
    }
}
