class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        ArrayList<Boolean> list = new ArrayList<>();
        for(int it : candies){
            max = Math.max(max , it);
        }

        for(int it : candies){
            if((it + extraCandies) >= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}