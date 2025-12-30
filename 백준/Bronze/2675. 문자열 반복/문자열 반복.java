import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int len = Integer.parseInt(br.readLine());

        for (int i=0; i<len; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());
            String word = st.nextToken();

            for (int j = 0; j<word.length(); j++) {
                char x = word.charAt(j);
                for (int k=0; k<num; k++) {
                    bw.write(x+"");
                }
            }
            bw.write("\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
