public class Solution1 {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        if(n==-1){
            return 1.0/x;
        }
        if(n%2==0){
            return myPow(x*x,n/2);
        }
        else{
            return x*myPow(x*x,(n-1)/2);
        }


        }



    public static void main(String[] args) {
        Solution1 ob = new Solution1();
        System.out.println(ob.myPow(2.0,-2));
    }





}
