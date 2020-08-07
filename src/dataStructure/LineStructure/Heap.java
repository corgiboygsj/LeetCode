package dataStructure.LineStructure;

import java.util.ArrayList;

/**
 * @author guoshoujing
 * @create 2020-08-01 12:43 下午
 */
public class Heap {
    private ArrayList<Integer> list;

    public Heap(ArrayList<Integer> list){
        initHeap(list);
        this.list = list;
    }

    //小顶堆
    public void initHeap(ArrayList<Integer> arr){
        if(arr == null || arr.size() <= 1){
            return;
        }
        int left, right;
        for(int notLeafNodeIndex = arr.size() / 2 - 1; notLeafNodeIndex >= 0; notLeafNodeIndex--){
            boolean adjusted = true;
            int now = notLeafNodeIndex;
            while (adjusted) {
                left = now * 2 + 1;
                right = now * 2 + 2;
                int min = getMin(left, right, arr);
                if(getMin(now, min, arr) == min){
                    swap(now, min, arr);
                    now = min;
                    adjusted = true;
                } else {
                    adjusted = false;
                }
            }
        }
    }

    private void swap(int i, int j, ArrayList<Integer> arr){
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    private int getMin(int i, int j, ArrayList<Integer> arr){
        if(i >= arr.size() || j >= arr.size()){
            return Math.min(i, j);
        }
        if(arr.get(i) < arr.get(j)){
            return i;
        } else {
            return j;
        }
    }

    private void insert(int num){
        int index = list.size();
        list.add(num);
        boolean adjusted = true;

        while (adjusted){
            int parentIndex = (index - 1) / 2;

        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(49);
        list.add(38);
        list.add(65);
        list.add(97);
        list.add(76);
        list.add(13);
        list.add(27);
        list.add(50);

        Heap heap = new Heap(list);

    }
}
