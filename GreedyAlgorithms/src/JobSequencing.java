import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class JobSequencing {
    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int id,int deadline,int profit){
            this.id=id;
            this.deadline=deadline;
            this.profit=profit;
        }
    }

    public static void main(String[] args) {
        int [] [] jobsInfo={{1,10},{1,30},{1,40},{4,20}};

        ArrayList<Job> jobsList=new ArrayList<>();

        for(int i=0;i<jobsInfo.length;i++){
            jobsList.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }

        Collections.sort(jobsList,(obj1,obj2)->obj2.profit-obj1.profit);

        ArrayList <Integer> seq=new ArrayList<>();
        int time=0;

        for(int i=0;i<jobsList.size();i++){
            Job curr=jobsList.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Maximum Job Completion:" +seq.size());

        System.out.println("Selected Jobs ID: ");
        for(int j=0;j<seq.size();j++){
            System.out.print(seq.get(j)+" ");
        }


    }
}
