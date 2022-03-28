class c1{
    void sort(int arr[]){
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    void print(int arr[]){
        int m=arr.length;
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
public class bsort {
    public static void main(String[] args) {
        c1 c=new c1();
        int arr[]={1,3,-1,2,4,5,3,9,8,5};
        c.sort(arr);
        c.print(arr);
    }





}
