package mapPrograms;
import java.util.*;

public class Meet {
	public static void main(String[] args) {
        int[] arr = {1,1,5,6,7,5,6,4};
        Map<Integer,Integer>freq=new HashMap<>();
        for (int num:arr) {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer,Integer>ele:freq.entrySet()) {
            if (ele.getValue() == 1) {
                System.out.println(ele.getKey());
            }
        }
    }

}
