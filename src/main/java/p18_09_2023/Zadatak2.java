package p18_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        StudentOsnovnih so1 =new StudentOsnovnih("Milos D",2844,2);
        StudentMaster sm1 = new StudentMaster("Milos M", 2877,3);


        so1.stampanje();
        System.out.println("******************");
        sm1.stampanje();

    }
}
