import java.util.Arrays;

//arr= {23, 33, 45, 0, 7, 8, 13};

class ArrayP{
    static int getSecLargest(int[] arr){
        int n = arr.length;

        Arrays.sort(arr);//sorted array using Arrays.sort
        //sorted arr={0, 7, 8, 13, 23, 33, 45};

        for(int i=n-2; i>=0; i--){
            //System.out.println("Array length :"+ arr.length);
            if(arr[i]!=arr[n-1]){//i= n-2 = 7-2= 5 (i+1= n-2+1= n-1)
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr= {23, 33, 45, 0, 7, 8, 13};
        System.out.println(getSecLargest(arr));
    }
}

//rotate an array with d time