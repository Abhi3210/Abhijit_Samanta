package Java_Collection_Examples;

public class J2D_pattern {
       public static void main(String args[]){
    	   int twoD_pattern[][]=new int[4][];
    	   twoD_pattern[0] = new int[1];
    	   twoD_pattern[1] = new int[2];
    	   twoD_pattern[2] = new int[3];
    	   twoD_pattern[3] = new int[4];
    	   int k=0;
    	   for(int i=0;i<4;i++){
    		   for(int j=0;j<i+1;j++){
    			   twoD_pattern[i][j]=k;
    			   k++;
    		   }
    	   }
    	   for (int i=0;i<4;i++){
    		   for(int j=0;j<i+1;j++)
    			   
    		   System.out.print(twoD_pattern[i][j]+" ");
    		   System.out.println();
    	   }
       }
}
