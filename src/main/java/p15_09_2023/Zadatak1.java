package p15_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Student mirko = new Student("Mirko Mirkovic", "75889137", 6718, 500 );
        Student marko = new Student("Marko Markovic", "788899920", 2564, 5000);
        Profesor branko = new Profesor("Branko Brankovic", "3555471", "Fizika",80000);
        Profesor stanko = new Profesor("Stanko Stankovic", "55588877", "Matematika", 70000);

        mirko.stampanje();
        System.out.println("**************");
        marko.stampanje();

        System.out.println("***********");

        branko.stampanje();

        branko.povecajPlatu(10);

        System.out.println("***********");
        branko.stampanje();

        System.out.println("***********");
        stanko.stampanje();

    }
}
