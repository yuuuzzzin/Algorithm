import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static StringBuilder sb = new StringBuilder();

    static public void fill(int cnt) {
        int length = cnt / 4;

        for(int i = 0; i < length; i++) {
            sb.append("AAAA");
        }

        length = cnt % 4;

        if(length != 0) sb.append("BB");

    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();

        int cnt = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '.') {
                if(cnt % 2 == 0) {
                    fill(cnt);
                    cnt = 0;
                } else {
                    System.out.println(-1);
			        return;
                }
                
                sb.append(".");
            }
            else cnt++;
        }

        if(cnt % 2 == 0) fill(cnt);
        else {
            System.out.println(-1);
			return;
        }

        System.out.println(sb);
    }
}