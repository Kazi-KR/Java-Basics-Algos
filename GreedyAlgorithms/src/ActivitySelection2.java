import java.util.ArrayList;

public class ActivitySelection2 {
    public static void main(String[] args) {
        //in this program we are going to solve already sorted(by task ending) tasks

        int [] start={1, 3, 0, 5, 8, 5};
        int [] end={2, 4, 6, 7, 9, 9};

        int lastEnd=0;
        int activityCount=0;
        activityCount++;
        lastEnd=end[0];

        ArrayList<Integer> array=new ArrayList<Integer>();
        array.add(0);

        for(int i=0;i<end.length;i++){
            if(start[i]>=lastEnd){
                activityCount++;
                lastEnd=end[i];
                array.add(i);
            }
        }

        System.out.println("Selected Activities: ");

        for(int j=0;j<array.size();j++){

            System.out.print("A"+ array.get(j)+" ");

        }
        System.out.println(" ");

    }
}
