import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String A = br.readLine();
        String B = br.readLine();
        int C = Integer.parseInt(br.readLine());

        bw.write(Integer.parseInt(A) + Integer.valueOf(B) - C + "\n");
        bw.write(Integer.valueOf(A+B) - C + "");
//        for (int i=0; i<len; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//
//            int sum = a + b;
//            bw.write(sum + "\n");
//        }
        br.close();

        bw.flush();
        bw.close();
    }
}
