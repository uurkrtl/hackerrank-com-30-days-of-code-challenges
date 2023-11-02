package challenges;

public class Day10BinaryNumbers {
    public void binary(){
        String binary = Integer.toString(13,2);
        int maxLenght = 0;
        int maxLenghtNew = 0;
        for (char chr : binary.toCharArray()){
            if (chr=='1'){
                maxLenghtNew++;
                if(maxLenghtNew>maxLenght) maxLenght=maxLenghtNew;
            }else{
                maxLenghtNew = 0;
            }
        }
        System.out.println(maxLenght);
    }
}