public class Main {
    public static void main(String[] args) {
        buble();
        quick();
    }

    static void zamien(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int l, int h)
    {
        int pivot = arr[h];
        int i = (l - 1);
        for (int j = l; j <= h - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                zamien(arr, i, j);
            }
        }
        zamien(arr, i + 1, h);
        return (i + 1);
    }
    static void quickSort(int[] arr, int l, int h)
    {
        if (l < h) {
            int pi = partition(arr, l, h);

            quickSort(arr, l, pi - 1);
            quickSort(arr, pi + 1, h);
        }
    }

    private static void quick(){
        System.out.println("QUICK SORT");
        int[] array = {2, 10, 13, 50, 125, 3, 5, 25, 6, 36};
        System.out.print("Przed: \n[");
        for(int i=0; i<array.length; i++)
            System.out.print(array[i]+", ");
        System.out.print("]\nPo:\n[");
        quickSort(array, 0, array.length-1);
        for(int i=0; i<array.length; i++)
            System.out.print(array[i]+", ");
        System.out.println("]\n***********************************\n");
    }

    private static void buble() {
        System.out.println("BUBLE SORT");
        int[] array = {2, 10, 13, 50, 125, 3, 5, 25, 6, 36};
        int schowek;
        System.out.print("Przed: \n[");
        for(int i=0; i< array.length; i++)
            System.out.print(array[i]+", ");
        System.out.print("]\nPo:\n[");
        for(int i=0; i<array.length; i++){
            for (int j=0; j<array.length-1; j++) {
                if (array[i] < array[j]) {
                    schowek = array[i];
                    array[i] = array[j];
                    array[j] = schowek;
                }
            }
        }
        for(int i=0; i< array.length; i++)
            System.out.print(array[i]+", ");
        System.out.println("]\n***********************************\n");
    }
}