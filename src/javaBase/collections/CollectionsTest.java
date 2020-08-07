package javaBase.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author guoshoujing
 * @create 2020-03-23 11:26 上午
 */
public class CollectionsTest {
    public static void main(String[] args) {
        List<Integer> list = init();
        //排序
        Collections.sort(list);
        //二分查找
        int index = Collections.binarySearch(list, 7);
    }

    public static List<Integer> init(){
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(1);
        list.add(0);
        return list;
    }
}
