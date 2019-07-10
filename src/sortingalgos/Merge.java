package sortingalgos;

import java.util.ArrayList;
import java.util.List;

public class Merge {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(3);
        a.add(2);
        a.add(1);
        a.add(7);
        a.add(4);

        a = sort(a);

        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + ", ");
        }


    }

    public static List<Integer> sort(List<Integer> input) {
        // split array
        List<Integer> firstHalf = new ArrayList<>(input.subList(0, input.size() / 2));
        if (firstHalf.size() >= 2) firstHalf = sort(firstHalf);
        List<Integer> secondHalf = new ArrayList<>(input.subList(input.size() / 2, input.size()));
        if (secondHalf.size() >= 2) secondHalf = sort(secondHalf);

        List<Integer> result = merge(firstHalf, secondHalf);

        return result;

    }

    static List<Integer> merge(List<Integer> a, List<Integer> b) {
        List<Integer> combined = new ArrayList<>();
        int repeats = a.size() + b.size();
        for (int i = 0; i < repeats; i++) {
            if (a.size() == 0) {
                combined.add(b.get(0));
                b.remove(0);
                continue;
            }
            if (b.size() == 0) {
                combined.add(a.get(0));
                a.remove(0);
                continue;
            }
            if (a.get(0) <= b.get(0)) {
                combined.add(a.get(0));
                a.remove(0);
            } else if (b.get(0) < a.get(0)) {
                combined.add(b.get(0));
                b.remove(0);
            }
        }

        return combined;
    }
}
