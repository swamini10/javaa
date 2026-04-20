public class movezero {
    /* 
   public static void main(String args[]) {
        int arr[] = {2,0,9,0,8,0,7,6,0,5,6,3};
        int num = arr.length;

        for (int i = 0; i < num; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i]);
            }
        }

        for (int i = 0; i < num; i++) {
            if (arr[i] == 0) {
                System.out.print(arr[i]);
            }
        }
    }*/
    public static void main(String args[]) {
        int arr[] = { 2, 0, 9, 0, 8, 0, 7, 6, 0, 5, 6, 3 };
        int num = arr.length;
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i]);
            } else {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(0);

        }
    }
}