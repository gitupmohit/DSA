class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left = 0;
        int right = n-1;
        int max = 0;

        while(left < right){
            int mini = Math.min(height[left] , height[right]);
            int val = right - left;
            max = Math.max(max , mini*val);
            if(height[left] > height[right]){
                right--;
            }else left++;
        }
        return max;
    }
}