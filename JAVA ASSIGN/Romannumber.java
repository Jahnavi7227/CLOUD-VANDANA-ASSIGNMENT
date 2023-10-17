import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)

public class Romannumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<Character,Integer> hm=new HashMap<>();
       hm.put('I', 1);
       hm.put('V',5);
       hm.put('X', 10);
       hm.put('L', 50);
       hm.put('C', 100);
       hm.put('D', 500);
       hm.put('M', 1000);
       System.out.println("Enter the Roman Number\n");
       Scanner sc=new Scanner(System.in);
       String roman=sc.next();
       int number=0;
       for(int i=0;i<roman.length();i++) {
    	     int first=hm.get(roman.charAt(i));
    	     int last=(i+1<roman.length())?hm.get(roman.charAt(i+1)):0;
    	     if(first<last) {
    	    	 number-=first;
    	    		 }
    	     else {
    	    	 number+=first;
    	     }
       }
       System.out.println("The Number of the roman value is "+number); 
       sc.close();
	}

}
