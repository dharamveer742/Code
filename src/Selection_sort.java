public class Selection_sort {
    public void Selection(int[] arr){

        for(int i=0;i<arr.length;i++){
            int min =arr[i];
            for(int j=i+1;j< arr.length;j++){
              if(arr[i]<arr[j]){

              }
              else{


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
    public static void main(String[] args) {
        Selection_sort c=new Selection_sort();
        int arr[]={1,3,-1,2,4,5,3,9,8,5};
        c.Selection(arr);
        c.print(arr);

    }





}
