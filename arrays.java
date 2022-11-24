
import java.util.*;
public class Median {
	    public static void main(String[] args) {
	      Scanner ab=new Scanner(System.in);
	      
	      
	      int n=ab.nextInt();
	      
	      int arr[]=new int[n];
	      for(int i=0;i<n;i++){
	          arr[i]=ab.nextInt();
	      }
	      
	      
	      
	      int n1=ab.nextInt();
	      
	      int arr1[]=new int[n];
	      for(int i=0;i<n1;i++){
	          arr1[i]=ab.nextInt();
	      }
	      
	      //concating of two numbers;using arraycopy
	     int num=n+n1;
	     int arr3[]=new int[num];
	     System.arraycopy(arr,0,arr3,0,n);
	     System.arraycopy(arr1,0,arr3,n,n1);
	     
	     //before sorting ;
	     System.out.println(Arrays.toString(arr3));
	     
	     //sorting method;
	     Arrays.sort(arr3);
	     
	     //after sorting:
	     System.out.println(Arrays.toString(arr3));
	     
	     //checking condition for median;
	     if(num%2==0){
	         int c=num/2;
	         int d=arr3[c-1]+arr3[c];
	         float d1=(float)d/2;
	         System.out.println(d1);
	     }
	     else{
	         int c=num/2;
	         System.out.println(arr3[c]);
	     }
	    }

}
