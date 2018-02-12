/**
 * Created by derianescobar on 2/12/18.
 */
import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] words = new String[n];
        for(int i = 0; i < n; i++){
            words[i] = scan.next();
        }
        for(int i = 0; i < words.length; i++){

            String even = "";
            String odd = "";

            char[] c = words[i].toCharArray();

            for(int j = 0; j < c.length; j++){

                if(j % 2 == 0){

                    even += c[j];
                }
                else{
                    odd += c[j];
                }

            }

            System.out.println(even + " " + odd);

        }
    }
}
