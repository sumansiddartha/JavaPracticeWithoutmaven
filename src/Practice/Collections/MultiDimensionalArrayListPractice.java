package Practice.Collections;

import java.util.ArrayList;

public class MultiDimensionalArrayListPractice {
public static void main(String[] args) {
	int vertexCount=3;
	ArrayList<ArrayList<Integer>> graph=new ArrayList<>(vertexCount);
	for(int i=0;i<vertexCount;i++) {
		graph.add(new ArrayList<>());
		
	}
	graph.get(0).add(1);
	graph.get(1).add(2);
	graph.get(2).add(0);
	graph.get(2).add(3);
	System.out.println(graph);
	vertexCount = graph.size();
	for (int i = 0; i < vertexCount; i++) {
	    int edgeCount = graph.get(i).size();
	    for (int j = 0; j < edgeCount; j++) {
	        Integer startVertex = i;
	        Integer endVertex = graph.get(i).get(j);
	        System.out.printf("Vertex %d is connected to vertex %d%n", startVertex, endVertex);
	    }
	}
	
	///From here 3 dimensional ArrayList
	int x_axis_length=2;
	int y_axis_length=2;
	int z_axis_length=2;
	
	ArrayList<ArrayList<ArrayList<String>>> space = new ArrayList<>(x_axis_length);
	
	for(int i=0;i<x_axis_length;i++) {
		space.add(new ArrayList<ArrayList<String>>(y_axis_length));
		for (int j = 0; j < y_axis_length; j++) {
	        space.get(i).add(new ArrayList<String>(z_axis_length));
	    }
	}
	space.get(0).get(0).add(0,"Red");
	space.get(0).get(0).add(1,"Red");
	
	space.get(0).get(1).add(0,"Blue");
	space.get(0).get(1).add(1,"Blue");
	space.get(1).get(0).add(0,"Yellow");
	space.get(1).get(0).add(1,"Orange");
	space.get(1).get(1).add(0,"Green");
	space.get(1).get(1).add(1,"Green");
	System.out.println(space);

	
	
	
	
	
}
}
