// Create a program that will apply principle of encapsulation on private array of 5 integers.

public class numThree {
    public static void main(String[] args){
        int[] numArray1 = {1, 2, 3, 4, 5};
        ArrayOne arr = new ArrayOne(numArray1);

        for(int i = 0; i < arr.getArr().length; i++){
            System.out.println(arr.getArr()[i]);
        }

        System.out.println();

        int[] numArray2 = {6, 7, 8, 9, 10};
            arr.setArr(numArray2);
            for(int i = 0; i < arr.getArr().length; i++){
                System.out.println(arr.getArr()[i]);
            }


    }
}
