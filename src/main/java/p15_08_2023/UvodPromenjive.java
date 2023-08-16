package p15_08_2023;

public class UvodPromenjive {
    public static void main(String[] args) {
//        String firstName; //dekleracija
//        firstName = "Milos" // inicijalizacija
//
//        String lastName = "Dabetic" //dekleracija + inicijalizacija

        String firstName = "Milos";
        String lastName = "Dabetic";
        int age = 33;
        float avg = 5.8f; //obavezno malo slovo f
        double Avg = 5.7;
        boolean active = true; //moze sadrzati true ili flase vrednosti

//        age = 34; //naknadna promena vrednosti za varijablu age
        //moze biti i 33 + 1 dokle god iznos biva ceo broj

        int yearOfBirth = 1990;
        int currentYear = 2023;

        int age1 = currentYear - yearOfBirth;

        System.out.println("First name" + firstName );
        System.out.println("Last name" + lastName);

    }
}
