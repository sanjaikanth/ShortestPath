package com.ut.swe.spring2019.algorithms.shortestpath.data;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import org.junit.jupiter.api.Test;
import java.util.Iterator;

public class MinHeap {

    private static final int INITIAL_QUEUE_CAPACITY = 25;
    private PriorityQueue<Route> pQueue;

    /*public MinHeap(int capacity) {
        pQueue = new PriorityQueue<RouteClass>(capacity,new RouteDistanceComparator());
    }*/
    public MinHeap(){
        pQueue = new PriorityQueue<Route>(INITIAL_QUEUE_CAPACITY,new DistanceComparator());
        //MinHeap(INITIAL_QUEUE_CAPACITY);
    }

    public boolean add(Route r){
        return pQueue.add(r);
    }

    public Route head(){
        return (Route)pQueue.peek();
    }
    public Route extractHead(){
        return (Route)pQueue.poll();
    }
    public int size(){
        return pQueue.size();
    }
    public boolean isEmpty(){
        return pQueue.isEmpty();
    }

    public Route poll(){
        return pQueue.poll();
    }
    public PriorityQueue<Route> getMinHeap(){
        return pQueue;
    }

    public Iterator<Route> iterator(){
        return pQueue.iterator();
    }

    @Override
    public String toString() {

        Iterator<Route> i = pQueue.iterator();
        StringBuilder sb = new StringBuilder();
        sb.append("Min Heap { \n");
        sb.append("Size = "+ pQueue.size() +"\n");
        while(i.hasNext()){
            sb.append(i.next().toString());
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

//    @Test
//    public void testQueue(){
//        MinHeap heap=new MinHeap();
//
//        Vertex v= new Vertex();
//        Vertex w= new Vertex();
//        heap.add(new Route(200,"MAA","B7LR"));
//        heap.add(new Route(100,"BL6R","EWR"));
//        heap.add(new Route(5,"BLR5","SV"));
//        heap.add(new Route(300,"DEF","ASDC"));
//        heap.add(new Route(600,"TGH","ABgC"));
//        heap.add(new Route(400,"DER","ABgC"));
//        heap.add(new Route(3,"TYe","ERv"));
//
//
//        System.out.println(heap.toString());
//        System.out.println("Peak record extract= " + heap.extractHead().toString());
//        System.out.println("Peak record after extract= " + heap.head().toString());
//        System.out.println(heap.toString());
//
//    }
}