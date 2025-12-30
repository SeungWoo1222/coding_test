import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int mul = A * B * C;
        String mulStr = String.valueOf(mul);

        Map<Character, Integer> map1 = new HashMap<>() {{
            put('0', 0);
            put('1', 0);
            put('2', 0);
            put('3', 0);
            put('4', 0);
            put('5', 0);
            put('6', 0);
            put('7', 0);
            put('8', 0);
            put('9', 0);
        }};

        for (int i=0; i<mulStr.length(); i++) {
            char x = mulStr.charAt(i);
            map1.put(x, map1.get(x)+1);
        }

        for (Integer val : map1.values()) {
            bw.write(val + "\n");
        }

        // 1. if문 2. isequal? 3.


        br.close();

        bw.flush();
        bw.close();
    }
}
