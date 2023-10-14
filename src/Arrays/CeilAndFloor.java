package Arrays;

public class CeilAndFloor {
    static int Ceil(int[] ar, int key){
        int l = 0;
        int h = ar.length-1;
        int mid = 0;
        while(l <= h){
            mid = (l+h)/2;
            if(key== ar[mid]){
                return ar[mid];
            } else if (key < ar[mid]) {
                h = mid - 1;
            }else{
                l = mid+1;
            }
        }
        if(l < ar.length){
            return ar[l];
        }else{
            return -1;
        }

    }

    static int Floor(int[] ar, int key){
        int l = 0, h = ar.length-1, mid = 0;
        while(l<=h){
            mid = (l+h)/2;
            if(key == ar[mid]){
                return ar[mid];
            } else if (key < ar[mid]) {
                h =  mid-1;
            }else{
                l = mid + 1;
            }
        }
        if(h>=0){
            return ar[h];
        }else {
            return -1;
        }
    }
    public static void main(String[] args) {
        int[] ar = {19, 23, 56, 61 ,72, 88, 92};
//        int key = 72;
        System.out.println(Ceil(ar,105));
        System.out.println(Floor(ar, 12));



    }
}
