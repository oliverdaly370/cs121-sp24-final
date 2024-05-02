/**
 * Description: Prints numbers 0 - 99 (inclusive) but if the number
 * is multiple of 3 it prints "Pop", if the number is a multiple of 8
 * it prints "Sickle", and if the number is a multiple of both it prints
 * "PopSickke".
 * 
 * @author oliverdaly370
 */

public class PopSickle {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print("Pop ");
            } else if (i % 8 == 0) {
                System.out.print("Sickle ");
            } else if (i % 3 == 0 && i % 8 == 0) {
                System.out.print("PopSickle ");
            } else {
                System.out.print(i + " ");
            }
        }

    }

}
