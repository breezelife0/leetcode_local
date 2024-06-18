package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID59SpiralMatrixIi {
    public static void main(String[] args) {
        Solution solution = new ID59SpiralMatrixIi().new Solution();
        StringBuilder sb = new StringBuilder();
        int[][] ints = solution.generateMatrix(4);

        //执行测试

        System.out.println(ints);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

//        public int[][] generateMatrix(int n) {
//            if (n == 1) {
//                return new int[][]{{1}};
//            }
//            int[][] res = new int[n][n];
//            int mid = n / 2;
//            int row = 0, col = 0;
//            int i = 1;
        
//
//
//            int FIX_S = 0;
//            int FIX_E = n - 1;
//            while (FIX_S < FIX_E) {
//
//                while (col < FIX_E) {
//                    res[FIX_S][col] = i++;
//                    col++;
//                }
//
//
//                while (row < FIX_E) {
//                    res[row][FIX_E] = i++;
//                    row++;
//
//                }
//
//
//                while (col > FIX_S) {
//                    res[FIX_E][col] = i++;
//                    col--;
//                }
//
//
//                while (row > FIX_S) {
//                    res[row][FIX_S] = i++;
//                    row--;
//                }
//
//                FIX_S++;
//                FIX_E--;
//            }
//            if (n % 2 == 1) {
//                res[mid][mid] = i;
//            }
//            return res;
//        }


        public int[][] generateMatrix(int n) {
            if (n == 1) {
                return new int[][]{{1}};
            }
            int[][] res = new int[n][n];
            int num = 1;
            int target = n * n;
            int l = 0, r = n - 1, t = 0, b = n - 1;
            while (num <= target) {
                for (int i = l; i <= r; i++) {
                    res[t][i] = num++;
                }
                t++;
                for (int i = t; i <= b; i++) {
                    res[i][r] = num++;
                }
                r--;
                for (int i = r; i >= l; i--) {
                    res[b][i] = num++;
                }
                b--;
                for (int i = b; i >= t; i--) {
                    res[i][l] = num++;
                }
                l++;
            }

            return res;
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}
