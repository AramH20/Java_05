public class OddIndices {

    public static int[] oddIndices(int[] array) {
        if (array.length == 1) {
            return null;
        }
        int leng;
        if (array.length % 2 == 0) {
            leng = array.length / 2;
            // int[] array2 = new int[array.length/2];
        } else {
            leng = (array.length - 1) / 2;
            // int[] array2 = new int[(array.length-1)/2];
        }
        int[] array2 = new int[leng];
        for (int i = 1, j = 0; i < array.length; i += 2, j++) {
            array2[j] = array[i];
        }

        return array2;
    }

}
