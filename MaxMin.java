import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={10,2,3,4,5,7,6};
        printArray(a,a.length);
        int max = findMax(a,a.length);
        int min = findMin(a, a.length);
        System.out.println("\nMax is: "+max+"\t Min is: "+min);
        sc.close();
    }
    public static void printArray(int[] a, int n){
        System.out.print("Elements are : ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static int findMax(int[] a,int n){
        int max=a[0];
        for(int i=0;i<n;i++){
            //max=a[i];
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
    public static int findMin(int[] a,int n){
        int min=a[0];
        for(int i=0;i<n;i++){
            //min=a[i];
            if(min>a[i]){
                min=a[i];
            }
        }
        return min;
    }
}
