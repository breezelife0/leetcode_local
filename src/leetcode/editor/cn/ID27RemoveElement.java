package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;


//数组原地算法
//在计算机科学中，一个原地算法（in-place algorithm）是一种使用小的，【固定数量的额外之空间】来转换资料的算法。
// 当算法执行时，输入的资料通常会被要输出的部分【覆盖】掉 。 （交换？ ）
//【solution】: 快慢指针（ 相向双指针法）

public class ID27RemoveElement{
	public static void main(String[] args) {
		Solution solution = new ID27RemoveElement().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeElement(int[] nums, int val) {
		if (nums == null || nums.length == 0){
			return 0;
		}
		if (nums.length == 1 ){
			if(nums[0] == val){
				return 0;
			}else {
				return 1;
			}
		}
		int slow = 0;
		int fast = nums.length-1;
		int length = nums.length;
		while (slow <= fast) {
			if (nums[slow] == val){
				nums[slow] = nums[fast];
				fast --;
				length -- ;
			}else {
				slow ++;
			}
		}
		return length;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
