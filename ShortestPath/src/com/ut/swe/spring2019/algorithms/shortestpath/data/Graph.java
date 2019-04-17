package com.ut.swe.spring2019.algorithms.shortestpath.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Adjacency list representation of undirected graph
public class Graph {

    private Map<Vertex, List<Vertex>> adjVertices;

    public int size(){
        return adjVertices.size();
    }

    public Graph() {
        this.adjVertices = new HashMap<Vertex,List<Vertex>>();
    }

    public void addUndirectNodes(Vertex v, Vertex w){
        this.addVertex(v);
        this.addVertex(w);
        this.addEdge(v,w);
    }

    public void addVertex(Vertex v){
        if(!this.adjVertices.containsKey(v)){
            this.adjVertices.putIfAbsent(v, new ArrayList<Vertex>());
        }
    }

    public void addEdge(Vertex v, Vertex w){
        if(!adjVertices.get(v).contains(w)) {
            adjVertices.get(v).add(w);
        }
        if(!adjVertices.get(w).contains(v)) {
            adjVertices.get(w).add(v);
        }
    }
    public List<Vertex> getEdges(Vertex v){
        return adjVertices.get(v);
    }

    @Override
    public String toString() {

        StringBuilder sb=new StringBuilder();
        sb.append("Graph {\n");
        sb.append("size = " + this.size() + " \n");
        for(Vertex key : adjVertices.keySet()){
            sb.append(key.getCode());
            sb.append(" -> ");
            sb.append("[");
            for(Vertex edge : adjVertices.get(key)){
                sb.append(edge.getCode() + ",");
            }
            if(sb.lastIndexOf(",")!=-1){
                sb.deleteCharAt(sb.lastIndexOf(","));
            }
            sb.append("]\n");
        }
        sb.append("}");

        return sb.toString();
    }
}
