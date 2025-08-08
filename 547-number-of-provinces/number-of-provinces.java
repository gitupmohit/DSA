class Solution {
    public int findCircleNum(int[][] isConnected) {
        //      int n = isConnected.length;
        //     boolean[] visited = new boolean[n];
        //     int provinces = 0;

        //     for (int i = 0; i < n; i++) {
        //         if (!visited[i]) {
        //             dfs(isConnected, visited, i);
        //             provinces++; // A new province is found
        //         }
        //     }
        //     return provinces;
        // }

        // private void dfs(int[][] isConnected, boolean[] visited, int city) {
        //     visited[city] = true;

        //     for (int neighbor = 1; neighbor < isConnected.length; neighbor++) {
        //         if (isConnected[city][neighbor] == 1 && !visited[neighbor]) {
        //             dfs(isConnected, visited, neighbor);
        //         }
        //     }

        int provinces = 0;
        int v = isConnected.length;
        ArrayList<ArrayList<Integer>> adjls = new ArrayList<>();
        int[] vis = new int[v];

        for (int i = 0; i < v; i++) {
            adjls.add(new ArrayList<>());
        }

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    adjls.get(i).add(j);
                    adjls.get(j).add(i);
                }
            }
        }

        for (int i = 0; i < v; i++) {
            if (vis[i] == 0) {
                provinces++;
                dfs(i, adjls, vis);
            }
        }

        return provinces;
    }

    public void dfs(int node, ArrayList<ArrayList<Integer>> adjls, int[] vis) {
        vis[node] = 1;

        for (Integer it : adjls.get(node)) {
            if (vis[it] == 0) {
                dfs(it, adjls, vis);
            }
        }
    }
}