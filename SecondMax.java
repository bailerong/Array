public class SecondMax {
    public static int FindSecond(int arr[]){
        int Max=arr[0];
        int Sed=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max){
                Sed=Max;
                Max=arr[i];
            }
            else{
                if(arr[i]>Sed)
                    Sed=arr[i];
            }
        }
        return Sed;
    }

    public static void main(String[] args) {
        int a[]={3,4,7,8,9};
        System.out.println(FindSecond(a));
    }
}
