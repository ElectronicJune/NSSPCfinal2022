import java.util.Scanner;

public class ReorderingArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i=0;i<length;i++){
            arr[i] = scanner.nextInt();
        }
        String min = "";
        String middle = "";
        String max = "";
        for (int i : arr){
            if (i==min(arr)){
                min += String.valueOf(i)+" ";
            }else if (i== max(arr)){
                max+= String.valueOf(i)+" ";
            }else{
                middle += String.valueOf(i)+" ";
            }
        }
        System.out.println((min+middle+max).trim());

    }
    static int max(int[] arr){
        int ans = arr[0];
        for (int i : arr){
            ans = i>ans ? i : ans;
        }
        return ans;
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i : arr){
            ans = i<ans ? i : ans;
        }
        return ans;
    }
}
