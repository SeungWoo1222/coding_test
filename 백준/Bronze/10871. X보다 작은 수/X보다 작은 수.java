import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int len = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<len; i++) {
            int cprnum = Integer.parseInt(st2.nextToken());
            if (cprnum < num) {
                bw.write(cprnum + " ");
            }
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
