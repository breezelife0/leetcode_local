package leetcode.editor.cn;

public class ID35SearchInsertPosition{
	public static void main(String[] args) {
		Solution solution = new ID35SearchInsertPosition().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int searchInsert(int[] nums, int target) {
		if (nums == null ){
			return 0;
		}
		int L = 0;
		int R = nums.length -1;
		while (L<=R ){
			int mid = L + (R-L)/2;
			if(nums[mid] == target){
				return mid;
			}else if (nums[mid] < target){
				L = mid + 1;
			}else if (nums[mid] > target){
				R = mid - 1;
			}
		}
		/**
		 * 边界硬编码
		 */
		if (R >= nums.length){
			return R;
		}
		if (L <= 0) {
			return 0;
		}
		if (nums[R] < target){
			return R+1;
		}else {
			return R;
		}


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
