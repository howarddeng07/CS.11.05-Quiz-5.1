public class Main {

    public static int[] combine(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            result[i + array1.length] = array2[i];
        }
        return result;
    }

    public static int[] zip(int[] array1, int[] array2) {
        int[] result = new int[array1.length * 2];
        for (int i = 0; i < array1.length; i++) {
            result[i * 2] = array1[i];
            result[i * 2 + 1] = array2[i];
        }
        return result;
    }

    public static int[] product(int[] array1, int[] array2) {
        int[] product = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            product[i] = array1[i] * array2[i];
        }
        return product;
    }

    public static int[] capitalCount(String[] words) {
        int[] nums = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            nums[i] = countCapitalLetters(words[i]);
        }
        return nums;
    }

    public static int countCapitalLetters(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c >= 65 && c <= 90) {
                count++;
            }
        }
        return count;
    }

}