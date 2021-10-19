package com.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Create Graph Using HashMap with datatype as Integer and Linkedlist<Integer>
 */
public class CreateGraph {
    int data;
    Map<Integer, LinkedList<Integer>> map;
    int flag =0;

    public CreateGraph(int vertex){
        map = new HashMap<Integer, LinkedList<Integer>>();
        for(int i=0;i<vertex;i++){
            map.put(i, new LinkedList<Integer>());
        }
    }

    public  void addEdge(int i, int j){
        this.map.get(i).add(j);
    }

    public static void main(String[] args) {
        CreateGraph graph = new CreateGraph(6);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(4,5);
        graph.addEdge(5,0);
        graph.addEdge(5,2);

        System.out.print(graph.map);
    }
}
