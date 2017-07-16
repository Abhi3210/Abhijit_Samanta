package Java_Collection_Examples;

public class Copy_Array {
      public static void main(String args[]){
    	  char copy_from[]={'@','a','b','h','i','j','i','t','s','a','m','n','t','a'};
    	  char copy_to[]=new char[10];
    	  System.arraycopy(copy_from, 1, copy_to, 0, 7);
    	  System.out.println(new String(copy_to));
      }
}
