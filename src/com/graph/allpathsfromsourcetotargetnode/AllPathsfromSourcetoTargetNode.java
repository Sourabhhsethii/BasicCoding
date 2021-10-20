package com.graph.allpathsfromsourcetotargetnode;

import java.util.*;

/**
 * All Paths from Source to Target Node
 * Description
 * Given a directed acyclic graph (DAG) of n nodes labelled from 0 to n - 1, count all possible paths from node 0 to node n - 1, and return the number of paths.
 *
 *
 *
 * The graph is given as follows: graph[i] is a list of all nodes you can visit from node i (i.e. , there is a directed edge from node i to node graph[i][j]).
 *
 *
 *
 * Example:
 *
 *
 *
 *
 *
 * Input:
 *
 * If graph = [[1,2],[3],[3],[]], the input can be taken as follows:
 *
 *
 *
 * first line: (number of nodes) 4
 *
 * second line: (nodes you can visit from first node) 1 2
 *
 * third line: (nodes you can visit from second node) 3
 *
 * fourth line: (nodes you can visit from third node) 3
 *
 * fifth line:( nodes you can visit from fourth node) -1
 *
 *
 *
 * Note: input -1 implies no node can be visited from the given node.
 *
 *
 *
 * Output: 2
 *
 * Explanation: There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
 */
public class AllPathsfromSourcetoTargetNode {
    int vertex;
    int matrix[][];

    public AllPathsfromSourcetoTargetNode(int vertex) {
        this.vertex = vertex;
        matrix = new int[vertex][vertex];
    }

    public void addEdge(int source, int destination) {
        //add edge
        matrix[source][destination]=1;
    }

    public void print() {
        //print
        System.out.print(allPathsSourceTarget(matrix));
    }

    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] vertex = sc.nextLine().split(" ");
        AllPathsfromSourcetoTargetNode graph = new AllPathsfromSourcetoTargetNode(Integer.parseInt(vertex[0]));
        for(int i=0;i<Integer.parseInt(vertex[0]);i++){
            String[] tokens = sc.nextLine().split(" ");

            for(int j=0;j<tokens.length;j++){

                if(Integer.parseInt(tokens[j]) >0){
                    graph.addEdge(i,Integer.parseInt(tokens[j]));
                }

            }

        }
        graph.print();
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph, 0, path, res);
        return res;
    }

    private void dfs(int[][] graph,int cur, List<Integer> path, List<List<Integer>> result) {
        if (cur == graph.length - 1) {
            // reached
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i : graph[cur]) {
            path.add(i);
            dfs(graph, i, path, result);
            path.remove(path.size() - 1);
        }
    }

}
