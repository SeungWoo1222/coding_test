import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        int len = Integer.parseInt(br.readLine());

        List<Integer> arr = new ArrayList<>();

        for (int i=0; i<9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), "\n");
            int num = Integer.parseInt(st.nextToken());
            arr.add(num);
        }

        int max = Collections.max(arr);
        int idx = arr.indexOf(max);

        bw.write(max + "\n");
        bw.write(String.valueOf(idx+1));
//        bw.write(String.valueOf(max));
        br.close();

        bw.flush();
        bw.close();
    }
}
