import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int len = 10;
        HashSet<Integer> arrSet = new HashSet<>();

        for (int i=0; i<len; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());

            int exChange = a % 42;
            arrSet.add(exChange);
        }
        bw.write(arrSet.size()+ "");
        br.close();

        bw.flush();
        bw.close();
    }
}