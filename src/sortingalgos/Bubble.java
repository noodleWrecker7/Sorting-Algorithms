package sortingalgos;

public class Bubble {

    public static int[] sort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if(list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] newArr = sort(new int[]{5,4,3,2,1});
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
