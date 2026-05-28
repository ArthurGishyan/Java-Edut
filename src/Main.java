public class Main {
    public static void main(String[] args) {
        //arrays and loops.
        int[] arr1 = {1,2,3,4,5};

        int[] arr2 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i;
//            System.out.println(arr2[i]);
        }

        //ex
        int[] arr3 = {1,0,-6,4,-12,6,8};

        int sum = 0;

        int count = 0;

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] > 0) {
//                sum += arr3[i];
//                count += 1;
            }
        }
//        System.out.println(Math.pow((sum / count), 2));

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 0) {
//                sum += arr3[i];
//                count ++;
            }
        }
//        System.out.println(Math.pow((sum / count), 2));

        for (int i = 0; i < arr3.length; i++) {
            if (i % 2 == 0) {
//                sum += arr3[i];
            }
        }
//        System.out.println(sum);
        for (int i = 0; i < arr3.length; i++) {
            if (i % 2 == 1) {
//                sum *= (int)Math.pow(arr3[i], 2);
            }
        }
        System.out.println(sum);
    }
}