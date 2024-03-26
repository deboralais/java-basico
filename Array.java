import java.util.Scanner;

/** * array */

public class array {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] elementos = new int [10];
        int [] inverso = new int [10];

        for (int i = 0; i <10; i++) {
            elementos [i] = s.nextInt();
        }

        int j = 0;
        for (int=9; i>=0; i--){
            inverso[i] = elemento [j];
            j++;
        }

        System.out.println (elementos[i] + "" + inverso[j]);