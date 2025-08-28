
import java.util.Arrays;

public class App {
  
  public static void main(String[] args) {
    int arr[] = {23,45,78,34,98};
   // System.out.println(lotteryums[2]);
   // lotteryums[2]=67;
    //System.out.println(lotteryums[2]);
    for(int i=0;i<arr.length;i++)
    {
    System.out.println(arr[i]);
    }
    System.out.println();

    for(int i=arr.length-1;i>=0;i--)
    {
      System.out.println(arr[i]);
    }
    System.out.println();
    for(int item:arr)
    {
      System.out.println(item);
    }
    System.out.println();
    Arrays.stream(arr).forEach(System.out::println);

    
  }
}