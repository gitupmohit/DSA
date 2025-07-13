class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int n = players.length;
        int m = trainers.length;
        int i =n-1; int j = m-1;
        int count =0;
        while(i>=0 && j>=0){
            if(players[i] <= trainers[j]){
                i--;
                j--;
                count++;
            }else{
                i--;
            }
        }
        return count;
    }
}