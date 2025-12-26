import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int len = Integer.parseInt(br.readLine());
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), "");
        String str = st.nextToken();

        for (int i=0; i<len; i++) {
            int num = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum += num;
        }

        bw.write(sum + "");
        br.close();

        bw.flush();
        bw.close();
    }
}
