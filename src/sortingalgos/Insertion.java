package sortingalgos;

import java.util.ArrayList;

public class Insertion {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(2);
        a.add(3);
        ArrayList<Integer> arr = sort(a);

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + ", ");
        }
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> arr) {
        ArrayList<Integer> sortedArr = new ArrayList<>();
        sortedArr.add(arr.get(0));
        arr.remove(0);
        while (arr.size() > 0) {
            System.out.println(arr.size());
            int currentNumToSort = arr.get(0);
            for (int i = 0; i < sortedArr.size(); i++) {
                if (sortedArr.get(i) > currentNumToSort) {
                    sortedArr.add(i, currentNumToSort);
                    arr.remove(0);
                    break;
                } else if (i == sortedArr.size() -1) {
                    sortedArr.add(currentNumToSort);
                    arr.remove(0);
                    break;
                }
            }
        }

        return sortedArr;
    }


}

