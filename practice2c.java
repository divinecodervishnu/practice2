import java.util.ArrayList;
import java.util.Scanner;
public class PartA{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<3;i++){
            System.out.print("Enter the value of the index "+i);
            System.out.println();
            int num=sc.nextInt();
            list.add(num);
        }
        sc.close();
        int sum=0;
        for(int nums:list){
            sum+=nums;
        }
        System.out.println("Sum is:"+sum);
    }
}