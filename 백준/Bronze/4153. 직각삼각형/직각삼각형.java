import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> arr = new ArrayList<>();

//        int len = Integer.parseInt(br.readLine());

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            if (x == 0|| y == 0 || z == 0) {
                break;
            } else {
                arr.add(x);
                arr.add(y);
                arr.add(z);

                arr.sort(Comparator.naturalOrder());

//                System.out.println("sorted arr : " + arr);

                if (Math.pow(arr.get(0), 2) + Math.pow(arr.get(1), 2) == Math.pow(arr.get(2), 2)) {
                    bw.write("right" + "\n");
                    arr.clear();
                } else {
                    bw.write("wrong" + "\n");
                    arr.clear();
                }
            }

        }

        br.close();

        bw.flush();
        bw.close();
    }
}
