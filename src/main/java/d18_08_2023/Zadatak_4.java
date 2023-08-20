package d18_08_2023;

import java.util.Scanner;
//
//4.	Napisati program koji stampa 25 _ (donjih crta), pritom na svaku 5. iteraciju odstampa i novi red. Zadatak resiti pomocu FOR petlje.
//        Primer izvrsenja:
//        _ _ _ _ _
//        _ _ _ _ _
//        _ _ _ _ _
//        _ _ _ _ _
//        _ _ _ _ _

public class Zadatak_4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        for(int i=1; i<=25; i++) {
            System.out.print("_");
            if(i%5 == 0 ) {
                System.out.println("");
            }
        }
    }
}
