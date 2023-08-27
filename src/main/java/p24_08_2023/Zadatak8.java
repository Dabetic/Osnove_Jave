package p24_08_2023;
import java.util.ArrayList;

public class Zadatak8 {
    public static void main(String[] args) {
    ArrayList<String> inputs = new ArrayList<>();

    inputs.add("First name");
    inputs.add("Last name");
    inputs.add("Email");
    inputs.add("Password");
    inputs.add("Phone");
    inputs.add("Address");

    ArrayList<Boolean> required = new ArrayList<>();

    required.add (true);
    required.add (true);
    required.add (true);
    required.add (true);
    required.add (false);
    required.add (false);

        for (int i = 0; i < inputs.size() ; i++) {

            if (required.get(i)) {
                System.out.println(inputs.get(i) + " * ________ ");
            }

            else {
                System.out.println(inputs.get(i) + " ________");
            }

        }

        }








    }

