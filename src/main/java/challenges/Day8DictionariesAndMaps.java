package challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8DictionariesAndMaps {
    public static void main(String []argh){
        Map<String, Integer> hash = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            hash.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (hash.containsKey(s)) {
                int phone = hash.get(s);
                System.out.println(s + "=" + phone);
            } else System.out.println("Not found");
        }
        in.close();
    }
}