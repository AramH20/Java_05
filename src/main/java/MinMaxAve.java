public class MinMaxAve {

    public int[] minMaxAve(int[] array, int index1, int index2){
        if(index1 > array.length || index2 > array.length){
            return null;
        }
        if(index1 > index2){
            int m = index2;
            index2 = index1;
            index1 = m;
        }
        int min, max;
        min = max = array[index1];
        int sum = 0;

        for(int i = index1; i <= index2; i++){
            sum += array[i];
            if(array[i] < min){
                min = array[i];
            }
            if(array[i] > max){
                max = array[i];
            }
        }
        int[] arr = {min, max, sum/(index2-index1+1)};
        return arr;
    }

}
