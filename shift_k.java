/*这是我们的一个关于如何将我们的代数向右移动K个单位的代码
* */

public class shift_k {
    /*这是我们的一个逆置数组*/
    public static void reserve(int a[],int begin,int end){
        for(;begin<end;begin++,end--){
            int temp=a[begin];
            a[begin]=a[end];
            a[end]=temp;
        }
    }
    public static void shift_k(int a[],int k){
        int n=a.length;
        k=k%n;
        //为了防止我们的K>n,因为在我们的k>n的情况下，
        // 右移k个单位和右移k%n个单位的结果是一样的
        reserve(a,n-k,n-1);//先逆置我们的78，将我们的78变成87
        reserve(a,0,n-k-1);//逆置我们的123456
        reserve(a,0,n-1);//全部逆置
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        shift_k(a,2);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
