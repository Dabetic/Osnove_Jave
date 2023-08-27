package d25_08_2023;

//7.	Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3. U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
//
//        Ako se proslede brojevi 4,6,1 u poziv metode, metoda vraca 1
//        Ako se proslede brojevi 4,6,33 u poziv metode, metoda vraca 4


public class Zadatak7 {
    public static void main(String[] args) {
        System.out.println(najmanjiBroj(4,6,1));
    }

    public static int najmanjiBroj(int x, int y, int z) {
        if(x<y) {
            if(x<z) {
                return x;
            }
            else {
                return z;
            }
        }
        else {
            if(y<z) {
                return y;
            }
            else {
                return z;
            }
        }
    }
}
