import java.lang.reflect.Array;

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
public int remove(int index){
    for (index = 0; index < array.length; index++) {
        array[index] = 0;
        break;
    }
    arrayIndex--;
    return array[index];
}
}
