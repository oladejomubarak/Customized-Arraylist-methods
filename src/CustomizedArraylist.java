import java.util.ArrayList;
import java.util.List;

public class CustomizedArraylist {
    private static int[] array = new int[15];
   // List<Integer> arrayLists = new ArrayList<>();
    //private int arrayLength;
    private static int arrayIndex= 0;

//    public CustomizedArraylist(int lengthOfArray){
//        this.arrayLength = lengthOfArray;
//        array = new int[arrayLength];
//    }
    public int add(int [] array, int element){
        int i;
        for (i = arrayIndex; i < array.length; i++) {
            array[i] = element;

            //increaseIndex();
            break;
        }
        arrayIndex = arrayIndex + 1;
        return array[i];
    }
//    private static void increaseIndex(){
//        for (int i = 0; i < array.length; i++) {
//            arrayIndex = i;
//            arrayIndex++;
//        }
//    }

}
