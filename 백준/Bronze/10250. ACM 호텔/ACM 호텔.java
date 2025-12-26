import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int len = Integer.parseInt(br.readLine());

        for (int i=0; i<len; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int floor = n % h;
//            System.out.println("floor :" + floor);
            int room = n / h +1;
//            System.out.println("room :" + room);

            if (floor == 0) {
                floor = h;
                room = n / h;
                if (room <10) {
                    bw.write(floor + "0" + room + "\n");
                } else {
                    bw.write(String.valueOf(floor) + room + "\n");
                }
            } else if (room < 10) {
//                String roomStr = "0" + room;
//                System.out.println("roomStr :" + floor);
//                room = Integer.parseInt(roomStr);
                bw.write(floor + "0" + room + "\n");
            } else {
                bw.write(String.valueOf(floor) + room + "\n");
            }
        }
        br.close();

        bw.flush();
        bw.close();
    }
//    public static int curRoom(int room) {
//        if (room <10) {
//            String rtn = "0" + String.valueOf(room);
//            return
//        }
//    }
}
