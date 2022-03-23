package ru.vsu.cs.course1;


import java.util.ArrayList;

public class Task {
    public static ArrayList<Integer> fromArrayToList(int [] array){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            result.add(array[i]);
        }
        return result;
    }
    public static  int[] fromListToArray(ArrayList<Integer> arrayList){
        int[] result = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }
    public static int[] process(int[] array ){
        ArrayList<Integer> input = fromArrayToList(array);
        ArrayList<Integer> result = permutation(input);
        int[] arr = fromListToArray(result);
        return arr;
    }

    public static ArrayList<Integer> permutation(ArrayList<Integer> initialList) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> pluses = new ArrayList<Integer>();
        ArrayList<Integer> minuses = new ArrayList<Integer>();
        ArrayList<Integer> zeros = new ArrayList<Integer>();
        for (int i = 0; i < initialList.size(); i++) {
            if (initialList.get(i) > 0) {
                pluses.add(initialList.get(i));
            }
            if (initialList.get(i) < 0) {
                minuses.add(initialList.get(i));
            }
            if (initialList.get(i) == 0) {
                zeros.add(initialList.get(i));
            }
            if (i == initialList.size() - 1) {
                for (Integer j : minuses) {
                    result.add(j);
                }
                for (Integer j : zeros) {
                    result.add(j);
                }
                for (Integer j : pluses) {
                    result.add(j);
                }
            }

        }
        return result;
    }
}
