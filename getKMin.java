/*这是我们的找出数组中第K个最小的数的代码*/
public class getKMin {
    /*采用剪枝法来判断我们的数组中的最小的第K个数*/
    public static int quickSort(int a[],int begin,int end){
        if(begin>end)
            return Integer.MAX_VALUE;
        int i=begin+1;
        int j=end;
        int temp=a[i];
        while(i<j){
            while(i<j&&a[j]>temp){

            }
        }
    }
}
//我们找到第K个最小的数
//挺实用的
