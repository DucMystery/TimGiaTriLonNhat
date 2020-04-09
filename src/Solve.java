import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int myArray[] = {1,2,6,8,3,9,99,23};
        checkMax(myArray);


    }

    public static void checkMax(int arr[]){
        int max =arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max= arr[i];
            }
        }
        System.out.println("Gia tri lon nhat cua mang la :"+max);
    }
}
