/**
 * Created by derianescobar on 2/14/18.
 */
import java.util.HashMap;
import java.util.Scanner;

public class Maps {

    public static void main(String []argh){
        HashMap <String,Integer> map = new HashMap <String,Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            map.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(map.get(s) == null){
                System.out.println("Not found");
            }
            else{
                System.out.println(s + "=" + map.get(s));
            }
        }
        in.close();
    }
}
