import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a>b) {
            bw.write(">");
        } else if (a<b) {
            bw.write("<");
        } else {
            bw.write("==");
        }

//        int len = Integer.parseInt(br.readLine());
//
//        for (int i=0; i<len; i++) {
//
//
//            int sum = a + b;
//            bw.write(sum+"\n");
//        }
        br.close();

        bw.flush();
        bw.close();
    }
}
