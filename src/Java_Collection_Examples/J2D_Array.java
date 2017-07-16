package Java_Collection_Examples;

public class J2D_Array {
      public static void main(String args[]){
    	  int TowD_Array[][]=new int[4][5];
    	  int k=0;
    	  for(int i=0;i<4;i++){
    		  for(int j=0;j<5;j++){
    			  TowD_Array[i][j]=k;
    			  k++;
    		  }
    		  
    	  }
    	  for(int i=0;i<4;i++){
    		  for(int j=0;j<5;j++)
    			  System.out.print(TowD_Array[i][j]+" ");
    			  System.out.println();
    		  
    	  }
      }
}
