import java.util.Scanner;

public class Solution {
    public int food(int r,int unit,int n,int[] arr){

        int max =r*unit;
        if(arr.length==0){
            return -1;
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){  //  2 8 3 5 7 4 1 2

            sum+=arr[i];
            if(sum>=max ){
                System.out.println(max);
                return i+1;
            }

        }
        return 0;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit=sc.nextInt();
        int r= sc.nextInt();
        int n= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Solution ob = new Solution();
      //  System.out.println(ob.food(r,unit,n,arr));
        System.out.println(3/2);


    }






}
