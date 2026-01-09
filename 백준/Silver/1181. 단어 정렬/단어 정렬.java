import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int len = Integer.parseInt(br.readLine());
//        HashMap<String, Integer> hashmap = new HashMap<>();
        HashSet<String> hashSet = new HashSet<>();

        ArrayList<Word> arr = new ArrayList<>();
        ArrayList<String> hasharr = new ArrayList<>();

        for (int i=0; i<len; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String x = st.nextToken();
            hashSet.add(x);
        }

        hashSet.forEach((x) ->
                hasharr.add(x)
                );

        for (int k=0; k<hasharr.size(); k++) {
            String x = hasharr.get(k);
            Word word = new Word(x, x.length());
            arr.add(word);
//            hashmap.put(word, word.length());
        }

        arr.sort(
                Comparator.comparingInt((Word w) -> w.leng)   // 1차: 길이 오름차순
                        .thenComparing(w -> w.string)      // 2차: (길이가 같을 때) 문자열 사전순 오름차순
        );

        for (int j=0; j<arr.size(); j++) {
            bw.write(arr.get(j).string + "\n");
        }



//        for (int j=0; j<50; j++) {
//            System.out.println(hashmap.);
//        }

        br.close();

        bw.flush();
        bw.close();
    }
}

class Word {
    String string;
    int leng;

    Word(String string, int leng) {
        this.string = string;
        this.leng = leng;
    }
}