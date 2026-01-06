import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        int len = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        boolean asc = false;
        boolean des = false;
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i=0; i<7; i++) {
//            System.out.println("a : "+ a);
//            System.out.println("b : "+ b);

            if (asc == true) {
//                System.out.println("asc가 true인 경우 실행");
                if (!(a+1 == b)) {
                    asc = false;
                    break;
                } else {
                    a = b;
                    if (st.hasMoreTokens()) {
                        b = Integer.parseInt(st.nextToken());
                    }
                }
            } else if (des == true) {
//                System.out.println("des가 true인 경우 실행");
                if (!(a-1 == b)) {
                    des = false;
                    break;
                } else {
                    a = b;
                    if (st.hasMoreTokens()) {
                        b = Integer.parseInt(st.nextToken());
                    }
                }
            } else {
//                System.out.println("첫 실행");
                if (a+1 == b) {
//                    System.out.println("첫 실행 후 asc = true");
                    asc = true;
                    a = b;
                    b = Integer.parseInt(st.nextToken());
                } else if (a-1 == b) {
//                    System.out.println("첫 실행 후 des = true");
                    a = b;
                    b = Integer.parseInt(st.nextToken());
                    des = true;
                } else {
//                    System.out.println("첫 실행 후 mixed 출력");
                    break;
                }
            }
        }

        if (asc == true) {
//            System.out.println("모든 순환 후 ascending 출력");
            bw.write("ascending");
        } else if (des == true) {
//            System.out.println("모든 순환 후 descending 출력");
            bw.write("descending");
        } else {
//            System.out.println("mixed 출력");
            bw.write("mixed");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
