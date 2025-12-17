import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int input1 = Integer.parseInt(st.nextToken());
        int input2 = Integer.parseInt(st.nextToken());

        int minute = 0;
        int hour = 0;

        if (input2 < 45) {
            minute = 60 - (45 - input2);
            if (input1 - 1 == -1) {
                hour = 23;
            } else {
                hour = input1 - 1;
            }
            bw.write(hour + " ");
            bw.write(String.valueOf(minute));
        } else if (input2 == 45) {
            hour = input1;
            bw.write(hour + " ");
            bw.write(String.valueOf(minute));
        } else {
            hour = input1;
            minute = input2 - 45;
            bw.write(hour + " ");
            bw.write(String.valueOf(minute));
        }
        br.close();

        bw.flush();
        bw.close();
    }
}