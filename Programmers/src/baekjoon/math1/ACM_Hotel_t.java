package baekjoon.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class ACM_Hotel_t{
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            int H = Integer.parseInt(st.nextToken());
            st.nextToken();   // W는 버린다
            
            int N = Integer.parseInt(st.nextToken());
            
            if(N % H == 0) {
                sb.append((H * 100) + (N / H)).append('\n');
            }else {
                sb.append(((N % H) * 100) + ((N / H) + 1)).append('\n');
            }
        }
        
        System.out.print(sb);
        String str = br.readLine();
        System.out.println(str);
    }
}
