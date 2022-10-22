import project_utils.Utils;

public class Intersection {

    public int[] intersection(int[] array1, int[] array2) {

        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j] == array1[i]) {
                    count++;
                }
            }

        }

        int[] arr2 = new int[count];
        count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j] == array1[i]) {
                    arr2[count] = array2[j];
                    count++;
                }
            }
        }

        return arr2;
    }

}
