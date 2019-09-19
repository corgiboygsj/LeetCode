package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(i);
        }

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 == 0){
                list.remove(i);
            }
        }

//        for(Integer i : list){
//            list.add(1);
//        }
    }
}
