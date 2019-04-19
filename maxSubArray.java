public class maxSubArray {
    public static int maxSubArray(int[] a){
        int n=a.length;
        int ThisSum=0,MaxSum=0;
for(int i=0;i<n;i++) {
    //为什么这里可用我们的等于号？
    //这里表明我们的循环次数，并不是表示我们的数组长度的
    for (int j = i; j <=n; j++) {
        ThisSum = 0;
        for (int k = i; k < j; k++)
            ThisSum =ThisSum+a[k];
        if (ThisSum > MaxSum)
            MaxSum = ThisSum;
    }
}
return MaxSum;
    }
/*
* 重复利用我们的已经计算的子数组和
* */
public static int maxSubArray1(int[] a){
    int thisSub=0;
    int maxSub=0;
    for(int i=0;i<a.length;i++){
        thisSub=0;
        for(int j=i;j<a.length;j++){
            thisSub+=a[j];
            if(maxSub<thisSub)
                maxSub=thisSub;
        }
    }
    return maxSub;
}
/*动态规划法*/
    public static int maxSubArray2(int a[]){
        int n=a.length;
        int All[]=new int[n];
        int End[]=new int[n];
        All[0]=End[0]=a[0];
        All[n-1]=End[n-1]=a[n-1];
        //我们的最大数组可以包含我们的arr[n-1],即以我们的arr[n-1]结尾
        //arr[n-1]单独构成我们的最大子数组
        //最大子数组不包含我们的arr[n-1]，那么我们求arr[1.....n-1]的最大子数组可以转换为我们的a[1.....n-2]
        //我们根据上述来解决我们的问题。
        //我们开辟两个新的数组，一个All数组，一个End数组，我们的
        //我们的All[i]表示我们的从
        for(int i=1;i<a.length;i++){
            End[i]=Max(End[i-1]+a[i],a[i]);
            All[i]=Max(End[i],All[i-1]);
        }
        return All[n-1];
    }
    public static int maxSubArray3(int[] a){
        int nAll=a[0];//有n个数字数组的最大子数组和
        int nEnd=a[0];//有n个数字数组包含最后一个元素的子数组的最大和
        for(int i=1;i<a.length;i++){
            nEnd=Max(nEnd+a[i],a[i]);
            nAll=Max(nEnd,nAll);
        }
        return nAll;
    }
    /*
    * 在知道我们的呢最大子数组和之后，如何才能直到我们的最大子数组的位置呢？为了得到最大字数组的位置
    * 首先介绍另外一种计算最大字数的方法。在方法三中，我们通过对公式End[i]=max(End[i-1]+arr[i].arr[i])的分析可以看出，
    * 当我们的End[i-1]<0时，End[i]=array[i],其中我们的End[i]表示我们的arr[i]的子数组和，如果某一个值使得我们的
    * End[i-1]<0,那么我们就重新开始*/
    public static void subMaxArray4(int a[]){
        int maxSum=0;//记录我们的最大和
        int begin=0;//记录我们的开始位置
        int end=0;//记录我们的结束位置
        int nSum=0;//记录我们的子数组最后一位的最大值
        int nStart=0;//记录我们的开始
        for(int i=0;i<a.length;i++){
            if(nSum<0){
                nSum=a[i];
                nStart=i;
            }else{
             nSum+=a[i];
            }
            if(nSum>maxSum){
             maxSum=nSum;
             begin=nStart;
             end=i;
            }
        }
        System.out.println("begin: "+begin+" end: "+end);
    }
    public static int Max(int m,int n){
        return m>n? m:n;
    }
    public static void main(String[] args) {
        int[] a={2,3,-2,-4,7,3,4,-1};
        System.out.println(maxSubArray(a));
        System.out.println(maxSubArray1(a));
        System.out.println(maxSubArray2(a));
        System.out.println(maxSubArray3(a));
        subMaxArray4(a);
    }
}
