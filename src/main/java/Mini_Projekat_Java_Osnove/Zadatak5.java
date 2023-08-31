package Mini_Projekat_Java_Osnove;

//5.	**Zadatak: Generisanje Random Passworda sa Specijalnim Karakterom**
//
//Kako biste saznali više o generisanju random brojeva u programiranju, preporučujemo da istražite sledeći link: random koristeci Random class. Ovaj resurs će vam pružiti detaljnije razumevanje kako programi generišu slučajne brojeve i kako ih možete koristiti u različitim situacijama.
//
//Napišite program koji simulira automatsko generisanje random passworda. Korisnik će uneti željenu dužinu passworda, a program će kreirati i ispisati password koji zadovoljava te parametre. Ovaj zadatak zahteva implementaciju različitih metoda za generisanje karaktera i passworda.
//●	generisiRandomKarakter: Ova metoda generiše i vraća random karakter. Metoda koristi niz stringova sa elementima koji predstavljaju mala slova, velika slova i brojeve (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
//●	generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter. Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.
//
//Napomena: Metode generisiRandomSpecijalanKarakter generisiRandomKarakter nemaju nikakvu stampu u sebi!
//
//Glavni program:
//   - Korisnik unosi dužinu passworda i informaciju da li treba sadržati specijalan karakter.
//   - Koristeći metodu `generisiPassword`, program generiše i ispisuje password.
//
//Primer izvršenja 1:
//Unesite dužinu passworda: 10
//Da li želite da sadrži specijalan karakter: true
//Generisan password: eD9Kx0e@
//
//Primer izvršenja 2:
//Unesite dužinu passworda: 10
//Da li želite da sadrži specijalan karakter: false
//Generisan password: eCxdwEeFEx

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Unesite N");
        int n = s.nextInt();

        System.out.println("Da li zelite specijalni karakter");
        boolean sk = s.nextBoolean();

        String randomPass = "";

        for (int i = 0; i < n; i++) {

            randomPass = randomPass + generisiRadnumKarakter();


        }

        if(sk) {

            randomPass = randomPass + generisiSpecijalniKarakter();
        }

        System.out.println("Generisan password: " + randomPass);

    }

    public static String generisiRadnumKarakter() {

        Random random = new Random();

        ArrayList<String> karakteri = new ArrayList<>();

        karakteri.add("a");
        karakteri.add("x");
        karakteri.add("N");
        karakteri.add("p");
        karakteri.add("Z");
        karakteri.add("7");
        karakteri.add("J");

        int najveciIndex = karakteri.size() - 1;

        int randomIndex = random.nextInt(najveciIndex);

        String randomKarakter = karakteri.get(randomIndex);


        return randomKarakter;

    }

    public static String generisiSpecijalniKarakter() {

        ArrayList<String> specijalniKarakter = new ArrayList<>();

        Random random = new Random();

        specijalniKarakter.add("@");
        specijalniKarakter.add("#");
        specijalniKarakter.add("!");
        specijalniKarakter.add("&");
        specijalniKarakter.add("*");

        int najveciMoguciIndex =  specijalniKarakter.size() - 1;
        int randomIndeks = random.nextInt(najveciMoguciIndex);

        String randomSpecKarak = specijalniKarakter.get(randomIndeks);

       return randomSpecKarak;
    }

}
