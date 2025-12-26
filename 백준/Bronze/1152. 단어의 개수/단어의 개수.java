import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        int len = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cnt = 0;
        String stStr = String.valueOf(st);

        if (stStr.startsWith(" ")) {
            cnt -= 1;
        } else if (stStr.endsWith(" ")) {
            cnt -= 1;
        }

        cnt += st.countTokens();

        bw.write(String.valueOf(cnt));
        br.close();

        bw.flush();
        bw.close();
    }
}
