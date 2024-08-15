import java.util.*;
public class CoinChange {
    public static void main(String[] args) {
        Integer [] coins={1,2,5,10,20,50,100,200,500,1000};

        Arrays.sort(coins,Comparator.reverseOrder());

        int coinCount=0;
        int amount=790;

        ArrayList <Integer> coinsList=new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while (coins[i]<=amount){
                    coinCount++;
                    amount-=coins[i];
                    coinsList.add(coins[i]);
                }
            }
        }

        System.out.println("The minimum possible changes :"+coinCount);
        System.out.println(coinsList.toString());

    }
}
