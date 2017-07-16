package Java_Collection_Examples;

public class J1D_Array_RuntimeValue {
   public static void main(String args[]){
	   int No_of_months[]=new int[12];
	   int i,k=1;
	   for(i=0;i<No_of_months.length;i++){
		   No_of_months[i]=k;
		   k++;
	   }
	   for(i=0;i<12;i++){
		   System.out.println(No_of_months[i]+" ");
	   }
   }
}
