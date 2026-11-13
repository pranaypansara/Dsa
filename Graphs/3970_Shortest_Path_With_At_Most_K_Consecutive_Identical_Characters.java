/*
 * Problem: Shortest Path With At Most K Consecutive Identical Characters
 * LeetCode: 3970
 * URL: https://leetcode.com/problems/shortest-path-with-at-most-k-consecutive-identical-characters/
 * Difficulty: Medium
 * Topic: Graphs
 */

import java.util.*;

class Solution {

    class State {
        int node;
        int cnt;
        long cost;

        State(int node, int cnt, long cost) {
            this.node = node;
            this.cnt = cnt;
            this.cost = cost;
        }
    }

    public int shortestPath(int n, int[][] edges, String labels, int k) {

        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            graph[edge[0]].add(new int[]{edge[1], edge[2]});
        }

        long[][] dist = new long[n][k + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Long.MAX_VALUE);
        }

        PriorityQueue<State> pq = new PriorityQueue<>(
                (a, b) -> Long.compare(a.cost, b.cost));

        dist[0][1] = 0;
        pq.offer(new State(0, 1, 0));

        while (!pq.isEmpty()) {
            State curr = pq.poll();

            int u = curr.node;
            int cnt = curr.cnt;
            long cost = curr.cost;

            if (cost > dist[u][cnt]) continue;

            for (int[] next : graph[u]) {
                int v = next[0];
                int w = next[1];

                int newCnt;

                if (labels.charAt(u) == labels.charAt(v)) {
                    newCnt = cnt + 1;
                } else {
                    newCnt = 1;
                }

                if (newCnt > k) continue;

                long newCost = cost + w;

                if (newCost < dist[v][newCnt]) {
                    dist[v][newCnt] = newCost;
                    pq.offer(new State(v, newCnt, newCost));
                }
            }
        }

        long ans = Long.MAX_VALUE;

        for (int i = 1; i <= k; i++) {
            ans = Math.min(ans, dist[n - 1][i]);
        }

        return ans == Long.MAX_VALUE ? -1 : (int) ans;
    }
}
