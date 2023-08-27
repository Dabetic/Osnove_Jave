package d24_08_2023;

//6.	Napisati program koji vrsi proveru linkova sa stranice. Program cuva 3 niza:
//●	niz linkova
//●	niz ocekivanih status kodova za linkove iz prvog niza (expected status codes)
//●	niz status kodova koje vracaju linkovi iz prvog niza (actual status codes)
//
//	Nizovi potrebni za ovaj primer:
//●	linkovi
//○	https://cms.demo.katalon.com/cart/
//○	https://cms.demo.katalon.com/shop/
//○	https://cms.demo.katalon.com/account/
//○	https://cms.demo.katalon.com/cart/
//○	https://cms.demo.katalon.com/test/
//●	expected status codes
//○	200
//○	200
//○	404
//○	204
//○	200
//●	actual status codes
//○	200
//○	200
//○	400
//○	200
//○	404
//Program za svaki link vrsi proveru ocekivane i dobijene vrednosti za status kod. Ukoliko se actual i expected vrednosti ne poklapaju ispisati gresku u formatu:
//Assertion Error: Link <link> expected status code <expected code> but got <actual code>
//Primer izvrsenja:
//Assertion Error: https://cms.demo.katalon.com/account/ expected 404 but got 400
//Assertion Error: https://cms.demo.katalon.com/cart/ expected 204 but got 200
//Assertion Error: https://cms.demo.katalon.com/test/ expected 200 but got 404

import java.util.ArrayList;

public class Zadatak6 {
    public static void main(String[] args) {
        ArrayList<String>linkovi = new ArrayList<>();




            linkovi.add("https://cms.demo.katalon.com/cart/");
            linkovi.add("https://cms.demo.katalon.com/shop/");
            linkovi.add("https://cms.demo.katalon.com/account/");
            linkovi.add("https://cms.demo.katalon.com/cart/");
            linkovi.add("https://cms.demo.katalon.com/test/");


            ArrayList<Integer> expectedCodes = new ArrayList<>();

            expectedCodes.add(200);
            expectedCodes.add(200);
            expectedCodes.add(404);
            expectedCodes.add(204);
            expectedCodes.add(200);

            ArrayList<Integer> actualCodes = new ArrayList<>();

            actualCodes.add(200);
            actualCodes.add(200);
            actualCodes.add(400);
            actualCodes.add(200);
            actualCodes.add(204);

        for (int i = 0; i < 5; i++) {


            if(!expectedCodes.get(i).equals(actualCodes.get(i))) {

                System.out.println("Assertion Error: " + linkovi.get(i) + "expected " + expectedCodes.get(i) +
                " but got " + actualCodes.get(i));            }


        }

    }
}
