package Arrays;

public class BitonicArraySearch {

    static int ascendingBinarySearch(int[] ar, int key, int range){
        int l = 0, h = range, mid = 0;
        while(l<=h){
            mid = (l+h)/2;
            if(key == ar[mid]){
                return mid;
            } else if (key < ar[mid]) {
                h =  mid-1;
            }else{
                l = mid + 1;
            }
        }return -1;

    }

    static int descendingBinarySearch(int[] ar, int key, int range){
        int l = range, h = ar.length-1, mid = 0;
        while(l<=h){
            mid = (l+h)/2;
            if(key == ar[mid]){
                return mid;
            } else if (key < ar[mid]) {
                l =  mid+1;
            }else{
                h = mid - 1;
            }
        }
        return -1;
    }

    static int findBitonicPoints(int[] ar){
        int l=0;
        int r= ar.length;
        int mid = 0;
        while(l<=r){
            mid = (l+r)/2;
            if(ar[mid] > ar[mid-1] && ar[mid] >ar[mid+1]){
                return mid;
            }else if(ar[mid]>ar[mid-1] && ar[mid] < ar[mid+1]){
                l=mid;
            }else{
                r=mid;
            }
        }return -1;
    }

    static int searchBitonic(int[] ar, int key, int bIndex){
        if(key == ar[bIndex]){
            return bIndex;
        }if(key > ar[bIndex]){
            return -1;
        }
        int res1 = ascendingBinarySearch(ar, key, bIndex-1);
        if(res1 != -1){
            return res1;
        }
        int res2 = descendingBinarySearch(ar, key, bIndex+1);
        if(res2 != -1){
            return res2;
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] ar = {5,6,7,8,9,10,3,2,1};
        int b = 10;
        int bIndex = findBitonicPoints(ar);
        System.out.println(searchBitonic(ar, b, bIndex));
    }
}
