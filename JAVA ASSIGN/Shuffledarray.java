//Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Shuffledarray {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7};
        ArrayList<Integer> shuffledarray=new ArrayList<>();
        for(int ele:array) {
        	 shuffledarray.add(ele);
        }
        Collections.shuffle(shuffledarray);
        System.out.println("The Original Array is "+Arrays.toString(array));
        System.out.println("The Shuffled Array is "+shuffledarray);
        }

}
