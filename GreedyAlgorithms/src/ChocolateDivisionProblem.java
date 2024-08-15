import java.util.*;
public class ChocolateDivisionProblem {
    public static void main(String[] args) {

        int n=4, m=6;
        Integer[] hor={2,1,3,1,4};
        Integer [] ver={4,1,2};
        int hp=1, vp=1;
        int h=0, v=0;
        int cost=0;

        Arrays.sort(hor,Collections.reverseOrder());
        Arrays.sort(ver,Collections.reverseOrder());


        while(h<hor.length && v< ver.length){
            if(ver[v]<=hor[h]){
                cost+=(hor[h]*vp);
                h++;
                hp++;

            }
            else{
                cost+=(ver[v]*hp);
                v++;
                vp++;
            }
        }


        while(h<hor.length){
            cost+=(hor[h]*vp);
            h++;
            hp++;
        }


        while(v<ver.length){
            cost+=(ver[v]*hp);
            v++;
            vp++;
        }

        System.out.println("Minimum cost to divide the chocolate: "+ cost);

    }
}
