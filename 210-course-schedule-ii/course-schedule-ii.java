class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        // int v = numCourses;
        // int n = prerequisites.length;
        // for(int i=0; i<v; i++){
        //     adj.add(new ArrayList<>());
        // }

        // for(int i =0; i<n; i++){
        //     adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        // }

        // int[] indegree = new int[v];

        // for(int i=0; i<v; i++){
        //     for(int it : adj.get(i)){
        //         indegree[it]++;
        //     }
        // }
        // Queue<Integer> q = new LinkedList<>();

        // for(int i=0; i<v; i++){
        //     if(indegree[i] == 0){
        //         q.offer(i);
        //     }
        // }

        // int[] topo = new int[v];
        // int i=0; 
        // while(!q.isEmpty()){
        //     int node = q.poll();
        //     topo[i] = node;
        //     i++;

        //     for(int it : adj.get(node)){
        //         indegree[it]--;
        //         if(indegree[it] == 0){
        //             q.offer(it);
        //         }
        //     }
        // }
        // if (i < v) return new int[0];

        // return topo;

         int v = numCourses;
        ArrayList<ArrayList<Integer>> adjls = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();

        for(int i=0; i<v; i++){
            adjls.add(new ArrayList<>());
        }
        int n = prerequisites.length;

        for(int[] it : prerequisites){
            adjls.get(it[1]).add(it[0]);
        }

        int[] indegree = new int[v];
        for(int i=0; i<v; i++){
            for(int it : adjls.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<v;i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }
        int i =0;
        int[] topo = new int[v];

        while(!q.isEmpty()){
            int node = q.poll();
            topo[i++] = node;

            for(int it : adjls.get(node)){
                indegree[it]--;
                if(indegree[it] == 0){
                    q.offer(it);
                }
            }
        }
        if (i < v) return new int[0];
        return topo;
    }
}