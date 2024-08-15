import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int [] weights={10,20,30};
        int [] val={60,100,120};
        int W=50;
//        int[] ratio=new int[weights.length];
//
//        for(int i=0;i<weights.length;i++){
//            ratio[i]=val[i]/weights[i];
//        }

        double [] [] ratio=new double[weights.length][2];
        for(int i=0;i<weights.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weights[i];
        }
        //System.out.println(Arrays.deepToString(ratio));

        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

//        System.out.println(Arrays.deepToString(ratio));

        int filled=0;
        int profitValue=0;
        ArrayList<Integer> selectedItems=new ArrayList<Integer>();

        for(int j=weights.length-1;j>=0;j--){
            int index=(int)(ratio[j][0]);

            if(filled+weights[index]<=W){
                selectedItems.add(index);
                filled+=weights[index];
                profitValue+=val[index];
                //System.out.println(profitValue);
            }
            else{
                // System.out.println(ratio[j][0]);
                selectedItems.add(index);
                profitValue+=ratio[j][1]*(W-filled);
                filled+=(W-filled);
                break;
            }
        }

        System.out.println(profitValue);
        System.out.println(selectedItems.toString());
    }
}
