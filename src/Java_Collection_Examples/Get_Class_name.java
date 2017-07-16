package Java_Collection_Examples;

public class Get_Class_name {
      public static void main(String args[]){
    	  int arr[]={1,2,3,4};
    	  Class c=arr.getClass();
    	  String name=c.getName();
    	  System.out.println(name);
      }
}
