public class try8 {



        public static void main(String[] args) {

            int arr[] = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
            for (int i = 0; i < arr.length; i++)
            {
                arr[i] = arr[i]+5;
                System.out.println("Element at index " + i + " : "+ arr[i]);
            }

        }
    }

