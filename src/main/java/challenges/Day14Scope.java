package challenges;

import java.util.Scanner;

public class Day14Scope {
}

class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    int max = 0;
    public Difference(int[] elements){
        this.elements = elements;
    }

    public void computeDifference(){
        for (int i = 0; i<elements.length-1;i++){
            for (int j = i+1; j<elements.length;j++){
                max = elements[i]-elements[j];
                if (max<0) max*=-1;
                if(max>maximumDifference) maximumDifference = max;
            }
        }
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}