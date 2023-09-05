import java.util.Scanner;
import java.util.*;
public class TwoSum {

    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }
        int target=17;
        HashMap<Integer,Integer> map=new HashMap<>();
        int resultarr[]=new int[2];
        for(int i=0;i<arr.length;i++){
            int secondnumber=target-arr[i];
            if(map.containsKey(secondnumber)){
                resultarr[0]=map.get(secondnumber);
                resultarr[1]=i;
            }
            else{
                map.put(arr[i],i);
            }
        }
        System.out.println(Arrays.toString(resultarr));
    }
}
