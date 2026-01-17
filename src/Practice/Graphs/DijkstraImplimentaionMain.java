package Practice.Graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

public class DijkstraImplimentaionMain {

	public static Graph calculateShortestPathFromSource(Graph graph,Node source) {
		source.setDistance(0);
		Set<Node> settledNodes=new HashSet<>();
		Set<Node> unsettledNodes=new HashSet<>();
		unsettledNodes.add(source);
		while(unsettledNodes.size()!=0) {
			Node currentNode=getLowestDistanceNode(unsettledNodes);
			unsettledNodes.remove(currentNode);
			for(Entry<Node,Integer> adjecencyPair:currentNode.getAdjacentNodes().entrySet()) {
				Node adgencyNode=adjecencyPair.getKey();
				Integer edgeWeight=adjecencyPair.getValue();
				if(!settledNodes.contains(adgencyNode)) {
					CalculateMinimumDistance(adgencyNode, edgeWeight, currentNode);
					unsettledNodes.add(adgencyNode);
				}
			}
			settledNodes.add(currentNode);
		}
		return graph;
	}
	
	private static Node getLowestDistanceNode(Set<Node> unsetteled) {
		Node lowestDistanceNode = null;
		int lowestDistance=Integer.MAX_VALUE;
		for(Node node:unsetteled) {
			int nodeDistance=node.getDistance();
			if(nodeDistance<lowestDistance) {
				lowestDistance=nodeDistance;
				lowestDistanceNode=node;
			}
		}
		return lowestDistanceNode;
	}
	
	private static void CalculateMinimumDistance(Node evaluationNode,Integer edgeWeight,Node sorceNode) {
		Integer sourceDistance=sorceNode.getDistance();
		if(sourceDistance+edgeWeight<evaluationNode.getDistance()) {
			evaluationNode.setDistance(sourceDistance+edgeWeight);
			LinkedList<Node> shortestPath=new LinkedList<>(sorceNode.getShortestPath());
			shortestPath.add(sorceNode);
			evaluationNode.setShortestPath(shortestPath);
		}
	}
	
	
	public static void main(String[] args) {
		Node nodeA = new Node("A");
		Node nodeB = new Node("B");
		Node nodeC = new Node("C");
		Node nodeD = new Node("D"); 
		Node nodeE = new Node("E");
		Node nodeF = new Node("F");
		nodeA.addDestination(nodeB, 10);
		nodeA.addDestination(nodeC, 15);

		nodeB.addDestination(nodeD, 12);
		nodeB.addDestination(nodeF, 15);

		nodeC.addDestination(nodeE, 10);

		nodeD.addDestination(nodeE, 2);
		nodeD.addDestination(nodeF, 1);

		nodeF.addDestination(nodeE, 5);

		Graph graph = new Graph();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);
		graph.addNode(nodeE);
		graph.addNode(nodeF);

		graph = calculateShortestPathFromSource(graph, nodeA);
		for(Node node:graph.getNodes()) {
			System.out.println(node.getName());
			System.out.println(node.getDistance());
			
		}
		
		
	}
	
}
