import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.BufferedReader;

/**
 * This is a comment by Pawan
 */
class DDIMMST {
    static class Edge {
        int U;
        int V;
        long weight;
        
        Edge(int from, int to, long weight) {
          this.U = from;
          this.V = to;
          this.weight = weight;
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nd[] = br.readLine().split(" ");
		
		int n = Integer.parseInt(nd[0]);
		int d = Integer.parseInt(nd[1]);
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
		    String str[] = br.readLine().split(" ");
		    ArrayList<Integer> values = new ArrayList<>();
		    
		    for(int k = 0; k < str.length; k++) {
		        values.add(Integer.parseInt(str[k]));
		    }
		    list.add(values);
		}
		ArrayList<Edge> edges = new ArrayList<>();
		for(int i = 0; i < n; i++) {
		    for(int j = i+1; j < n; j++) {
		        long weight = (diff(list.get(i), list.get(j)));
		        Edge curr = new Edge(i, j, weight);
		        edges.add(curr);
    		}
		}
		
		long graph[][] = new long[n][n];
		
		for(int i = 0; i < edges.size(); i++) {
		    graph[edges.get(i).U][edges.get(i).V] = edges.get(i).weight;
		    graph[edges.get(i).V][edges.get(i).U] = edges.get(i).weight;
		}
		
		primMST(graph);
	}
	
	private static long diff(ArrayList<Integer> x, ArrayList<Integer> y) {
	    long diff = 0;
	    
	    for(int i = 0; i < x.size(); i++) {
	        diff += Math.abs(x.get(i) - y.get(i));
	    }
	    
	    return diff;
	}
	
	static void primMST(long graph[][]) {
	    int v = graph.length;
	    
	    int parent[] = new int[v];
	    long key[] = new long[v];
	    boolean mstSet[] = new boolean[v];
	    
	    for(int i = 0; i < v; i++) {
	        key[i] = Integer.MIN_VALUE;
	        mstSet[i] = false;
	    }
	    
	    key[0] = 0;
	    parent[0] = -1;
	    
	    for(int count = 0; count < v - 1; count++) {
	        long u = keyMax(key, mstSet, v);
	        mstSet[(int) u] = true;
	        
	        for(int j = 0; j < v; j++) {
	            if(graph[(int) u][j] != 0 && mstSet[j] == false && graph[(int) u][j] > key[j]) {
	                parent[j] = (int) u;
	                key[j] = graph[(int) u][j];
	            }
	        }
	    }
	    
	    printMST(parent, graph, v);
	}
	
	private static void printMST(int[] parent, long[][] graph, int v) {
	    long sum = 0;
	    for(int i = 1; i < v; i++) {
	        sum += graph[parent[i]][i];
	    }
	    
	    System.out.println(sum);
	}
	
	private static long keyMax(long[] key, boolean[] mstSet, int v) {
	    long max = Integer.MIN_VALUE;
	    int index = -1;
	    
	    for(int i = 0; i < v; i++) {
	        if(mstSet[i] == false && key[i] > max) {
	            max = key[i];
	            index = i;
	        }
	    }
	    return index;
	}
}
