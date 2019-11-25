package leetCode.栈;

import java.util.*;

/**
 * 给定一个嵌套的整型列表。设计一个迭代器，使其能够遍历这个整型列表中的所有整数。
 * <p>
 * 列表中的项或者为一个整数，或者是另一个列表。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [[1,1],2,[1,1]]
 * 输出: [1,1,2,1,1]
 * 解释: 通过重复调用 next 直到 hasNext 返回false，next 返回的元素的顺序应该是: [1,1,2,1,1]。
 * 示例 2:
 * <p>
 * 输入: [1,[4,[6]]]
 * 输出: [1,4,6]
 * 解释: 通过重复调用 next 直到 hasNext 返回false，next 返回的元素的顺序应该是: [1,4,6]。
 */
public class Question341 {

    public interface NestedInteger {

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger();

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger();

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return null if this NestedInteger holds a single integer
        public List<NestedInteger> getList();
    }

    public class NestedIterator implements Iterator<Integer> {
        private Iterator<Integer> iterator;

        /**
         * 因为不确定嵌套有多深，所以需要采用递归或者栈来处理。
         * 首先其中每个元素都是一个NestedInteger，这个可能是个list也可能是一个integer，而且要保证数字顺序，所以将list反序列push进栈。
         * 之后对每一个栈中元素处理，如果是integer就记录，否则就重复步骤2继续保持顺序，直到栈空为止。
         */
        public NestedIterator(List<NestedInteger> nestedList) {
            List<Integer> list = new ArrayList<>();
            Stack<NestedInteger> stack = new Stack<>();
            reversePushStack(nestedList, stack);

            while(!stack.isEmpty()){
                NestedInteger nestedInteger = stack.pop();
                if(nestedInteger.isInteger()){
                    list.add(nestedInteger.getInteger());
                } else {
                    reversePushStack(nestedInteger.getList(), stack);
                }
            }

            iterator = list.iterator();
        }

        private void reversePushStack(List<NestedInteger> nestedList, Stack<NestedInteger> stack){
            Collections.reverse(nestedList);
            for (NestedInteger nestedInteger : nestedList) {
                stack.push(nestedInteger);
            }
        }

        @Override
        public Integer next() {
            return iterator.next();
        }

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }
    }
}
