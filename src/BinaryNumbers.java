/**
 * Created by derianescobar on 2/14/18.
 */
import java.util.Scanner;

public class BinaryNumbers {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //scanner reads next int
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] ones = Integer.toBinaryString(n).split("0");
        scan.close();
        int lengthA = ones[0].length();
        for(int i = 1; i < ones.length; i++){

            if(lengthA < ones[i].length()){
                lengthA = ones[i].length();
            }
        }
        System.out.println(lengthA);
    }
}
