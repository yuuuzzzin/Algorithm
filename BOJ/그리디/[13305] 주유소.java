import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 도시의 개수
        long[] dist = new long[n - 1]; // 거리
        long[] cost = new long[n]; // 비용
        long sum = 0;

        // 거리 입력
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < dist.length; i++) {
            dist[i] = Integer.parseInt(st.nextToken());
        }

        // 기름값 입력
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < cost.length; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }

        // 현재보다 이전 도시의 기름값이 더 싸면 이전 도시의 기름값으로 갱신
        long min = cost[0];
        for(int i = 1; i < cost.length; i++) {
            if(min < cost[i]) cost[i] = min;
            else min = cost[i];
        }

        // 각각의 거리와 기름값을 더해 총합 구하기
        for(int i = 0; i < dist.length; i++) {
            sum += dist[i] * cost[i];
        }

        System.out.print(sum);
        br.close();
    }
}