import java.util.*;

public class MaxLenChainPairs {
    public static void main(String[] args) {
        int [] [] arr={{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(arr, Comparator.comparing(o->o[1]));

        int chainLen=1;

        int lastEnd=arr[0][1];

        for(int i=1;i<arr.length;i++){
            if(arr[i][0]>=lastEnd){
                chainLen++;
                System.out.println(lastEnd+" ==> ");
                lastEnd=arr[i][1];
                System.out.println(lastEnd);
            }
        }

        System.out.println("Maximum Pair Possible "+ chainLen);
    }
}
