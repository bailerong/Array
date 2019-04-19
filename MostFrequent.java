import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*找出我们的数组中重复最多的元素
* */
/*
* 我们的类集对于我们来说是一个非常非常使用的工具，我们一定要能够熟练的应用它*/
public class MostFrequent {
public static int findMostFrequentIntArray(int[] a){
    int result=0;
    int size=a.length;
    if(size==0)
        return Integer.MAX_VALUE;
    //记录每个元素出现的次数
    Map<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<size;i++){
        if(map.containsKey(a[i])){
            map.put(a[i],map.get(a[i])+1);
        }else{
            map.put(a[i],1);
        }
    }
    //找出出现次数最多的元素
    int most=0;
    Iterator iter= map.entrySet().iterator();
    while(iter.hasNext()){
        Map.Entry entry=(Map.Entry)iter.next();
        int key=(Integer) entry.getKey();
        int value=(Integer) entry.getValue();
        if(value>most){
            result=key;
            most=value;
        }

    }
    return result;
}

    public static void main(String[] args) {
        int array[]={2,3,4,4,5,5,5,5,5,6,7};
        System.out.println(findMostFrequentIntArray(array));
    }
}
