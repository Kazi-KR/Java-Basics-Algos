import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        //in this program we are going to solve unsorted(by task ending) tasks

        int [] start={0,1,3,5,5,8};
        int [] end={6,2,4,7,9,9};

        //int [] start={1, 3, 0, 5, 8, 5};
        //int [] end={2, 4, 6, 7, 9, 9};

        int [] [] activities= new int[end.length][3];

        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }

        //before sorting the matrix looks like
        System.out.println("============Before Sorting============");
        System.out.println(Arrays.deepToString(activities));

        Arrays.sort(activities, Comparator.comparingDouble(o->o[2]));

        //after sorting the matrix looks like
        System.out.println("============After Sorting============");
        System.out.println(Arrays.deepToString(activities));


        int lastEnd=0;
        int activityCount=0;
        activityCount++;
        lastEnd=activities[0][2];

        ArrayList<Integer> array=new ArrayList<Integer>();
        array.add(activities[0][0]);

        for(int i=0;i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                activityCount++;
                lastEnd=activities[i][2];
                array.add(activities[i][0]);
            }
        }

        System.out.println("================================");
        System.out.println("Selected Activities: ");

        for(int j=0;j<array.size();j++){

            System.out.print("A"+ array.get(j)+" ");

        }
        System.out.println(" ");

    }
}
