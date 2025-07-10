class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        ArrayList<int[]> list = new ArrayList<>();

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                list.add(new int[]{i,j});
            }
        }

        list.sort((a,b) -> {
            int disA = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int disB = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return disA - disB;
        });

        int[][] nums = new int[list.size()][2];
        for(int i=0; i<list.size(); i++){
            nums[i] = list.get(i);
        }

        return nums;
    }
}