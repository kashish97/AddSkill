package Week2;

import java.util.*;

public class FilterRestaurants {

    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {

        Arrays.sort(restaurants, (a, b) -> b[1] - a[1]);

        for(int i = 0;i<restaurants.length-1;i++){
            if(restaurants[i][1]==restaurants[i+1][1]){

                if(restaurants[i+1][0]>restaurants[i][0]){
                    int[] temp = restaurants[i+1];
                    restaurants[i+1] = restaurants[i];
                    restaurants[i] = temp;
                }

            }

        }

        List<Integer> list = new ArrayList<>();

        for(int i = 0;i<restaurants.length;i++){
            if(veganFriendly==1){
                if(restaurants[i][2]==veganFriendly && restaurants[i][3]<=maxPrice && restaurants[i][4]<=maxDistance){
                    list.add(restaurants[i][0]);
                }
            }

            else{
                if(restaurants[i][3]<=maxPrice && restaurants[i][4]<=maxDistance){
                    list.add(restaurants[i][0]);

                }
            }
        }

        return list;
    }
}