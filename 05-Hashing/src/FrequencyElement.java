import java.util.HashMap;
import java.util.Map;

public class FrequencyElement {
    public static void main(String[] args){
        int [] arr = {1,2,1,3,2,4,2,4,2,3,6,7};
        Map<Integer,Integer>freq =new HashMap<>();
        for(int i:arr){
            if(!freq.containsKey(i)){
                freq.put(i,1);
            }else {
                freq.put(i,freq.get(i) +1);
            }
        }
        System.out.println(freq.entrySet());
        int maxFreq=0;int anskey =0;
        for (var key :freq.keySet()){
            if(freq.get(key)>maxFreq){
                maxFreq = freq.get(key);
                anskey =key;

            }
        }
        System.out.println( anskey + " has maximum frequency and it occur " + maxFreq + " times" );
    }

}
