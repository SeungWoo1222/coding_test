import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int total = n;
        String star = "*";
        String starForPlus = "*";

        while (n>0) {
            String result = String.format("%" + total + "s", star);
            bw.write(result+"\n");
            star += starForPlus;
            n--;
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
