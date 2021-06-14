import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int cnt = 0;
        
        while(n > 0) {
            if(n % 5 == 0) {
                cnt += n / 5;
                break;
            }

            n -= 2;
            cnt ++;
        }

        if(n < 0) System.out.println(-1);
        else System.out.println(cnt);
        
    }
}