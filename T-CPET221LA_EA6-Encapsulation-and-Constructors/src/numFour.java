// Modifying problem #3, use a constructor as a setter.

public class numFour {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5};
        ArrayTwo arrOne = new ArrayTwo(arr1);

        for(int i =0; i < arrOne.getArr().length; i++){
            System.out.println(arrOne.getArr()[i]);
        }

        System.out.println();

        int[] arr2 = {6, 7, 8, 9, 10};
        arrOne.setArr(arr2);

        for(int i = 0; i < arrOne.getArr().length; i++){
            System.out.println(arrOne.getArr()[i]);
        }

    }
}
