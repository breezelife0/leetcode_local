package leetcode.editor.cn;

public class ID704BinarySearch{
	public static void main(String[] args) {
		Solution solution = new ID704BinarySearch().new Solution();
		StringBuilder sb = new StringBuilder();
//
		int[] nums  = new int[1];
		nums[0] = 5;
		int search = solution.search(nums, 5);

//		int[] nums  = new int[6];
//		nums[0] = -1;
//		nums[1] = 0;
//		nums[2] = 3;
//		nums[3] = 5;
//		nums[4] = 9;
//		nums[5] = 12;
//		int search = solution.search(nums, 2);

		//执行测试

		System.out.println(search);
	}

	/**
	 * 1.区间！！
	 * 写二分法，区间的定义一般为两种，左闭右闭即[left, right]，或者左闭右开即[left, right)。
	 */
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
		if (nums == null || (nums.length == 1 && nums[0] != target)){
			return -1;
		}


		int L = 0;
		int R = nums.length -1;
//		int mid = (L+R) >> 1; //错！ 溢出

		while (L<=R){
			int mid = L + ((R - L) / 2);// 防止溢出 等同于(left + right)/2

			if(nums[mid] == target){
				return mid;
			}else if(nums[mid] > target){
				R = mid -1; //左闭区间
			}else if(nums[mid] < target){
				L = mid+1; //右闭区间
			}

		}
		return -1;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
