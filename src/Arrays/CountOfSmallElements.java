package Arrays;

public class CountOfSmallElements {
    static int countEqualAndSmallElements(int[] ar, int key){
        int l=0, h=ar.length-1, mid = 0;
        while(l<=h){
           mid = (l+h)/2;
           if(key == ar[mid]){
               while(mid+1<ar.length && ar[mid+1] == key){
                   mid++;
               }
               break;
           }else if(key<ar[mid]){
               h = mid-1;
           }else{
               l = mid+1;
           }
        }
        if(ar[mid] > key){
            return mid;
        }
        else{
            return mid+1;
        }

    }

    public static void main(String[] args) {
//        int[] ar = {2,6,12,18,21,26,33,42};
        int[] ar = {2,6,12,18,21,26,26,28,26};
        int key = 25;
        System.out.println(countEqualAndSmallElements(ar,key));
    }
}
