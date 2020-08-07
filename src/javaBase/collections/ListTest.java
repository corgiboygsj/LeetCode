package javaBase.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guoshoujing
 * @create 2020-03-23 5:13 下午
 */
public class ListTest {
    /**
     * 双集合求交集
     * @param l1
     * @param l2
     * @return
     */
    public static List<Integer> intersection(List<Integer> l1, List<Integer> l2){
        l1 = integerListClone(l1);
        l1.retainAll(l2);
        return l1;
    }

    /**
     * 双集合求并集
     * @param l1
     * @param l2
     * @return
     */
    public static List<Integer> union(List<Integer> l1, List<Integer> l2){
        l1 = integerListClone(l1);
        l1.addAll(l2);
        return l1;
    }

    /**
     * 双集合求差集
     * @param l1
     * @param l2
     * @return
     */
    public static List<Integer> difference(List<Integer> l1, List<Integer> l2){
        List<Integer> union = union(l1, l2);
        List<Integer> intersection = intersection(l1, l2);
        union.removeAll(intersection);
        return union;
    }

    /**
     * 双集合求去重并集
     * @param l1
     * @param l2
     * @return
     */
    public static List<Integer> uniqueUnion(List<Integer> l1, List<Integer> l2){
        l1 = integerListClone(l1);
        l1.removeAll(l2);
        return union(l1, l2);
    }

    public static List<Integer> integerListClone(List<Integer> list){
        return new ArrayList<>(list);
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            l1.add(i);
        }
        for(int i = 7; i < 15; i++){
            l2.add(i);
        }

        System.out.println("l1:" + l1);
        System.out.println("l2:" + l2);
        System.out.println(intersection(l1, l2));
        System.out.println(union(l1, l2));
        System.out.println(difference(l1, l2));
        System.out.println(uniqueUnion(l1, l2));
    }
}
