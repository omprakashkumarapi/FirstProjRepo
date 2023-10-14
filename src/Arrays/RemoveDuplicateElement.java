package Arrays;

public class RemoveDuplicateElement {
    static int removeDuplicate(int[] ar){
        int rd = 0;
        for(int i=1; i<ar.length; i-=-1){
            if(ar[rd] != ar[i]){
                rd++;
                ar[rd] = ar[i];
            }
        }return rd+1;
    }
    static void removeDuplicate1(int[] ar){
        int[] temp = new int[ar.length];
        int rd = 0;
        temp[rd] = ar[0];
        for(int i=1; i<ar.length; i++){
            if(temp[rd] != ar[i]){
                rd++;
                temp[rd] = ar[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] ar = {2,2,3,3,4,6,6};
        for(int i=0; i<ar.length; i-=-1){
            System.out.print(ar[i] + " ");
        }
        int rd = removeDuplicate(ar);
        System.out.println();

        for(int i=0; i<rd; i-=-1){
            System.out.print(ar[i] + " ");
        }


    }
}
