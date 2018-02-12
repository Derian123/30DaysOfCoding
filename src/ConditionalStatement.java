import java.util.Scanner;
/**
 * Created by derianescobar on 10/30/17.
 *
 *
 */
 public class ConditionalStatement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1){
            System.out.println("Weird");
        }
        else if (6 <= n && n <= 20){
            // Complete the code
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }

    }
}
