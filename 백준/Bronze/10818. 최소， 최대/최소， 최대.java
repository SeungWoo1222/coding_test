import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int len = Integer.parseInt(br.readLine());

        List<Integer> arr = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<len; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr.add(num);
        }

        int min = Collections.min(arr);
        int max = Collections.max(arr);

        bw.write(min + " ");
        bw.write(String.valueOf(max));
        br.close();

        bw.flush();
        bw.close();
    }
}
