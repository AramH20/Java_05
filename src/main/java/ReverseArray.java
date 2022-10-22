public class ReverseArray {

    public static int[] reverseArray(int [] array){
        int[] arrayrev = new int[array.length];
        for(int i = 0, j = array.length-1; i < array.length; i++, j--){
            arrayrev[i] = array[j];
        }
        return arrayrev;
    }

}
