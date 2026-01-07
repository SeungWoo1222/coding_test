import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int len = Integer.parseInt(br.readLine());
        for(int i=0; i<len; i++) {
//            System.out.println("word readLine");
            String word = br.readLine(); // OOOXO

            int cnt = 0;
            int sum = 0; // 0
            int currentIndex = 0; // 0

            // word의 길이만큼 진행하는 while문
            while (currentIndex < word.length()) { // 0 < 5, 3 < 5, 4 < 5, 5 < 5가 false이므로 반복문 종료
//                System.out.println("1번 while문 currentIndex : " + currentIndex);
                cnt = 0; // 0, while문을 만나면서 3에서 다시 0으로 초기화
//                System.out.println("cnt초기화: " + cnt);
                char currentWord = word.charAt(currentIndex); // O, X, O
                int nextIndex = currentIndex + 1; // 1, 4, 5
//                System.out.println("nextIndex는 : " + nextIndex);

                if (currentWord == 'O') {
                    cnt++; // 1, 1
//                    System.out.println("O찾아서 cnt++ : " + cnt);
                    sum += cnt; // 1, 1
//                    System.out.println("sum += cnt = : " + sum);
                    // O인 문자를 발견하면 연속적으로 O가 있는지 확인
                    // 단, currnetIndex가 마지막 인덱스라면 nextIndex가 없으므로 if문 생성
                    if (currentIndex < word.length()-1) {  // 7 < 9
                        while (word.charAt(nextIndex) == 'O') {
//                            System.out.println("2번 while문");
                            cnt++; // 2, 3
//                            System.out.println("연속 cnt : " + cnt);
                            sum += cnt; // 1+2=3, 1+2+3 = 6
//                            System.out.println("연속 sum : " + sum);
                            if(nextIndex < word.length()-1) {  //
                                nextIndex++;
                            } else {
                                break;
                            }
                        }
                        if (nextIndex < word.length()-1) {
                            currentIndex = nextIndex; // 0 = 3 이제 다시 위에 맨위의 while로
//                            System.out.println("nextIndex에게 받은 currentIndex: "+currentIndex);
                        } else {
                            break;
                        }
                    } else { // 마지막 index이므로 break;
                        break;
                    }
                } else { // X이므로 여기가 실행, if문 필터링에 의해서 실행
                    if (currentIndex == word.length()-1) { // currentIndex가 word의 마지막을 가리키고 있다면 ++할 필요없으므로 break
                        break;
                    } else {
                        currentIndex++;// 4, 5
                    }

//                    System.out.println("currentIndex++ 실행: "+currentIndex);
                }
            }
            // 최종 sum 값을 bw.write함 = 7
            bw.write(sum+"\n");
        }

//        for (int i=0; i<len; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//
//            int sum = a + b;
//            bw.write(sum + "\n");
//        }
        br.close();

        bw.flush();
        bw.close();
    }
}
