package Java_Collection_Examples;

public class Avarage_calculation {
    public static void main(String args[]){
    	double numbers[]={10.5,80.9,40.5,93.5};
    	double result=0;
    	double avg;
    	for(int i=0;i<numbers.length;i++){
    		result=result+numbers[i];
    	}
    	avg=result/5;
    	System.out.println("Avg value is :"+avg);
    }
}
