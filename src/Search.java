public class Search {
    public int Bina(int[] List,int key){
        int first=0;
        int last=List.length-1;
        int mid =(first+last)/2 ;
        while(List[mid]!=key && first<List.length-1){
            if(key>List[mid]){
                first=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        int index=-1;
        if(List[mid]==key){
            index=mid+1;
        }
        return index;
    }

    public static void main(String[] args) {

        int[] o = {1,3,5,7,9};
        Search object =new Search();
        System.out.println("Position is"+object.Bina(o,7));

    }



}
