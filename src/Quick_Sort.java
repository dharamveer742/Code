import java.sql.SQLOutput;

public class Quick_Sort {
    static void Swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int partition(int[] arr,int beg,int end){
        int pivot =arr[end];
        int i=beg-1;
        for(int j=beg;j<=end;j++){
            if(arr[j]<pivot){
                i++;
                Swap(arr,i,j);
            }

        }
        Swap(arr,i+1,end);
        return i+1;
    }
    public void quickSort(int[] arr,int beg,int end){
        if(beg<end){
            int split=partition(arr,beg,end);
            quickSort(arr,beg,split-1);
            quickSort(arr,split+1,end);
        }
    }
    public void printArray(int[] arr,int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Quick_Sort q = new Quick_Sort();
        int[] arr={44,22,33,66,77,88,11};
        int size=arr.length;
        q.quickSort(arr,0,size-1);
        q.printArray(arr,size);
    }
}

