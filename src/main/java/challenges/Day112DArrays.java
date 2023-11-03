package challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class Day112DArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        int sum = Integer.MIN_VALUE;
        for(int r = 0; r<4 ; r++){
            for(int c = 0; c<4; c++){
                int currentSum = arr.get(r).get(c)+arr.get(r).get(c+1)+arr.get(r).get(c+2)+
                        arr.get(r+1).get(c+1)+
                        arr.get(r+2).get(c)+arr.get(r+2).get(c+1)+arr.get(r+2).get(c+2);
                sum = Math.max(sum, currentSum);
            }
        }
        System.out.println(sum);
    }
}