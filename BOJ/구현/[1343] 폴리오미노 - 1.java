import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();

        char arr[] = str.toCharArray();

        str = str.replace("XXXX", "AAAA");
        str = str.replace("XX", "BB");

        System.out.println(str.contains("X") ? -1 : str);
    }
}