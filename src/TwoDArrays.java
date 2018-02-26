/**
 * Created by derianescobar on 2/26/18.
 */
import java.util.Scanner;
public class TwoDArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int length = arr.length - 2;
        int tempMax = Integer.MIN_VALUE;;
        int max = 0;

        for(int i = 0; i < length; i++){

            for(int j = 0; j < length; j++){

                tempMax = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                        + arr[i+1][j+1]
                        + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                if(tempMax > max){

                    max = tempMax;
                }
            }

        }
        System.out.println(max);


    }
}
