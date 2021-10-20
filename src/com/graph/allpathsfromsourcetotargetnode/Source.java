package com.graph.allpathsfromsourcetotargetnode;
import java.util.*;

public class Source {
    private int v;
    private static int totalPath = 0;
    private ArrayList<Integer>[] adjList;
    public Source(int vertices)
    {

        // initialise vertex count
        this.v = vertices;

        // initialise adjacency list
        initAdjList();
    }

    @SuppressWarnings("unchecked")
    private void initAdjList()
    {
        adjList = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int u, int v)
    {
        // Add v to u's list.
        adjList[u].add(v);
    }

    public void countAllPaths(int s, int d)
    {
        boolean[] isVisited = new boolean[v];
        ArrayList<Integer> pathList = new ArrayList<>();

        // add source to path[]
        pathList.add(s);

        // Call recursive utility
        countAllPathsUtil(s, d, isVisited, pathList);
    }

    private void countAllPathsUtil(Integer u, Integer d,
                                   boolean[] isVisited,
                                   List<Integer> localPathList)
    {

        if (u.equals(d)) {
            totalPath++;
            // if match found then no need to traverse more till depth
            return;
        }

        // Mark the current node
        isVisited[u] = true;

        // Recur for all the vertices
        // adjacent to current vertex
        for (Integer i : adjList[u]) {
            if (!isVisited[i]) {
                // store current node
                // in path[]
                localPathList.add(i);
                countAllPathsUtil(i, d, isVisited, localPathList);

                // remove current node
                // in path[]
                localPathList.remove(i);
            }
        }

        // Mark the current node
        isVisited[u] = false;
    }

    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        in.nextLine();
        Source g = new Source(n);
        for(int i=0;i<n;i++)
        {
            String edges = in.nextLine();
            String[] edges_to_vertices = edges.split(" ");
            int[] a = new int[edges_to_vertices.length];
            for(int j =0 ;j < a.length;j++){
                a[j]= Integer.parseInt(edges_to_vertices[j]);
            }
            if(a[0]!=-1) {
                for (String edge : edges_to_vertices) {
                    g.addEdge(i, Integer.parseInt(edge));
                }
            }
        }
        g.countAllPaths(0,n-1);
        System.out.println(totalPath);
    }
}
