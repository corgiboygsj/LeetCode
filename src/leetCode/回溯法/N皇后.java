package leetCode.回溯法;

import java.util.*;

/**
 * 设计一种算法，打印 N 皇后在 N × N 棋盘上的各种摆法，其中每个皇后都不同行、不同列，也不在对角线上。这里的“对角线”指的是所有的对角线，不只是平分整个棋盘的那两条对角线。
 *
 * 注意：本题相对原题做了扩展
 *
 * 示例:
 *
 *  输入：4
 *  输出：[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
 *  解释: 4 皇后问题存在如下两个不同的解法。
 * [
 *  [".Q..",  // 解法 1
 *   "...Q",
 *   "Q...",
 *   "..Q."],
 *
 *  ["..Q.",  // 解法 2
 *   "Q...",
 *   "...Q",
 *   ".Q.."]
 * ]
 */
public class N皇后 {
    public static List<List<String>> solveNQueens(int n) {
        LinkedList<List<String>> result = new LinkedList<>();

        LinkedList<String> track = new LinkedList<>();
        solveNQueens(n, track, result);

        return result;
    }

    private static void solveNQueens(int n, LinkedList<String> track, LinkedList<List<String>> result){
        if(track.size() == n){
            result.add(new LinkedList<>(track));
            return;
        }

        for(int i = 0; i < n; i++){
            if(!canChoose(i, track)){
                continue;
            }
            track.add(createTrackItem(i, n));
            solveNQueens(n, track, result);
            track.removeLast();
        }
    }

    private static boolean canChoose(int chooseIndex, LinkedList<String> track){
        if(track.size() == 0){
            return true;
        }

        int trackSize = track.size();
        Set<Integer> cannotChooseIndex = new HashSet<>();
        for(int i = 0; i < trackSize; i++){
            int qIndex = track.get(i).indexOf('Q');
            cannotChooseIndex.add(qIndex);
            cannotChooseIndex.add(qIndex - (trackSize - i));
            cannotChooseIndex.add(qIndex + (trackSize - i));
        }
        return !cannotChooseIndex.contains(chooseIndex);
    }

    private static String createTrackItem(int index, int n){

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < n; i++){
            stringBuilder.append(".");
        }
        stringBuilder.setCharAt(index, 'Q');
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(solveNQueens(8).size());
    }
}
