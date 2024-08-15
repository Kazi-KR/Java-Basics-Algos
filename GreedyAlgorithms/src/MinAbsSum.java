import java.util.Arrays;

public class MinAbsSum {
    public static void main(String[] args) {
        int [] arr1={3,4,1,2,7};
        int [] arr2={3,5,7,8,6};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int miniSum=0;

        for(int i=0;i<arr1.length;i++){
           miniSum+=Math.abs(arr1[i]-arr2[3]);
        }

        System.out.println(miniSum);
    }
}
