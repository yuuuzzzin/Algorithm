import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    static int t, n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int index;

        while(t-- > 0) {
            n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            st = new StringTokenizer(br.readLine(), " ");
            index = 0;
            while(st.hasMoreTokens()) {
                arr[index] = Integer.parseInt(st.nextToken());
                index++;
            }

            Arrays.sort(arr);
            System.out.println(arr[0] + " " + arr[n - 1]);
        }
        
    }
}