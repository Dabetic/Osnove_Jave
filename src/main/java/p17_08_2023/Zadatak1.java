package p17_08_2023;

import java.util.Scanner;

public class Zadatak1 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite ime ");
        String ime = s.next();

        System.out.print("Unesite prezime ");
        String prezime = s.next();

        System.out.println("Unesite JMBG ");
        String jmbg = s.next();

        System.out.println("Unesite broj telefona ");
        String brojTelefona = s.next();



        System.out.println("Unesite email ");
        String email = s.next();

        System.out.println("Ime i prezime " + ime + " " + prezime + " JMBG " + jmbg);
        System.out.println("Email " + email + " Broj telefona " + brojTelefona);
    }
}
