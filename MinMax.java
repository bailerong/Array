/*
如何寻找我们的数组中的最小值和最大值
* */
public class MinMax {
    static int Max;
    static int Min;
    public static void GetMaxAndMin(int arr[]){
        Max=arr[0];
        Min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(Max<arr[i]){
                Max=arr[i];
            }
            if(Min>arr[i]){
                Min=arr[i];
            }
        }

    }

    public static void main(String[] args) {
        int[] arr={1,7,9,0,11,3};
        GetMaxAndMin(arr);
        System.out.println("max: "+Max);
        System.out.println("min: "+Min);
    }
}
