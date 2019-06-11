import java.util.Scanner;

class MinOfTwoArray
{
    private Scanner scan;

    MinOfTwoArray() {
        this.scan = new Scanner(System.in);
    }

    int getMin(int arr[], int size) {
        System.out.println("Searching the smallest element...");
        int small = arr[0];
        for(int i=0; i<size; i++)
        {
            if(small > arr[i])
            {
                small = arr[i];
            }
        }
        return small;
    }

    int[] getArray(int size) {
        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++)
        {
            arr[i] = this.scan.nextInt();
        }
        return arr;
    }

    int getMinFromArray() {
        int size, arr[];
        System.out.print("Enter the array size: ");
        size = this.scan.nextInt();
        arr = getArray(size);
        return getMin(arr, size);
    }

    public static void main(String[] args)
    {
        MinOfTwoArray main = new MinOfTwoArray();
        int min1, min2;

        min1 = main.getMinFromArray();
        System.out.println("Smallest Element: "+min1);
        min2 = main.getMinFromArray();
        System.out.println("Smallest Element: "+min2);

        System.out.println("Smallest among both the array is: " + (min1 < min2 ? min1 : min2));
    }
}