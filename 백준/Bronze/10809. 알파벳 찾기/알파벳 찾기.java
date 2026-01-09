import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        HashMap<Character, Integer> hsmap = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        hsmap.put('a', -1);
        hsmap.put('b', -1);
        hsmap.put('c', -1);
        hsmap.put('d', -1);
        hsmap.put('e', -1);
        hsmap.put('f', -1);
        hsmap.put('g', -1);
        hsmap.put('h', -1);
        hsmap.put('i', -1);
        hsmap.put('j', -1);
        hsmap.put('k', -1);
        hsmap.put('l', -1);
        hsmap.put('m', -1);
        hsmap.put('n', -1);
        hsmap.put('o', -1);
        hsmap.put('p', -1);
        hsmap.put('q', -1);
        hsmap.put('r', -1);
        hsmap.put('s', -1);
        hsmap.put('t', -1);
        hsmap.put('u', -1);
        hsmap.put('v', -1);
        hsmap.put('w', -1);
        hsmap.put('x', -1);
        hsmap.put('y', -1);
        hsmap.put('z', -1);

        for (int i=0; i<word.length(); i++) {
            char x = word.charAt(i);
            if (hsmap.get(x) == -1) {
                hsmap.replace(x, i);
            }
        }

//        System.out.println(hsmap);

        hsmap.forEach((key, value) ->
                arr.add(value)
                );

//        System.out.println("arr : "+arr);

//        arr.forEach((x) ->
//                bw.write(x + " ")
//                );

        for (int j =0; j<arr.size(); j++) {
            bw.write(arr.get(j) + " ");
//            if (j == arr.size()-1) {
//                bw.write(arr.get(j)+"");
//            }
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
