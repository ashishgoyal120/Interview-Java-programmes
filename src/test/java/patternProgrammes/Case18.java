/*
           4  3  2  1 
           4  3  2 
           4  3 
           4 
 */

package Pattern_Programmes;

public class Case18 {

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }
    }

}
