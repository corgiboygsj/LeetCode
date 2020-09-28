package leetCode.回溯法;

import java.util.LinkedList;
import java.util.List;

/**
 * @author guoshoujing
 * @create 2020-09-22 5:35 下午
 */
public class 全排列 {
    public static LinkedList<List<Integer>> all(int[] arr){
        LinkedList<List<Integer>> result = new LinkedList<>();

        all(arr, new LinkedList<>(), result);

        return result;
    }

    private static void all(int[] arr, LinkedList<Integer> track, LinkedList<List<Integer>> result){
        if(track.size() == arr.length){
            result.add(new LinkedList<>(track));
            return;
        }

        for(int i = 0; i < arr.length; i++){
            if(track.contains(arr[i])){
                continue;
            }
            track.add(arr[i]);
            all(arr, track, result);
            track.removeLast();
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        LinkedList<List<Integer>> all = all(arr);

        all.forEach(System.out::println);
    }
}
