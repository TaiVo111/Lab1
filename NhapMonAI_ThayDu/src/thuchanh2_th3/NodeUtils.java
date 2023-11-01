package thuchanh2_th3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NodeUtils {
	public static List<String> printPath(Node node) {
		if (node != null) {
			List<String> result = new ArrayList<String>();
			result.add(node.getLabel());
			Node tmp;
			while ((tmp = node.getParent()) != null) {

				result.add(tmp.getLabel());
				node = tmp;
			}
			Collections.reverse(result);
			return result;
		} else
			return new ArrayList<String>();
	}

	public static void main(String[] args) {
		Node nodeS = new Node("S");
		Node nodeA = new Node("A");
		Node nodeB = new Node("B");
		Node nodeC = new Node("C");
		Node nodeD = new Node("D");
		Node nodeE = new Node("E");
		Node nodeF = new Node("F");
		Node nodeG = new Node("G");
		Node nodeH = new Node("H");

		nodeS.addEdge(nodeB, 2);
		nodeS.addEdge(nodeC, 4);
		nodeS.addEdge(nodeA, 5);
		nodeA.addEdge(nodeD, 9);
		nodeC.addEdge(nodeF, 2);
		nodeF.addEdge(nodeG, 1);
		nodeE.addEdge(nodeG, 6);
		nodeD.addEdge(nodeH, 7);
		nodeA.addEdge(nodeE, 4);
		nodeB.addEdge(nodeG, 6);

		ISearchAIgo algo1 = new BreadthFirstSearchAIgo();
		Node result = algo1.execute(nodeS,"A","G");
		System.out.println(printPath(result));
		ISearchAIgo algo2 = new BreadthFirstSearchAIgo();
		Node result1 = algo2.execute(nodeS, "G");
		System.out.println(printPath(result1));
		
		ISearchAIgo al = new DepthFirstSearchAIgo();
		Node result2 = al.execute(nodeS, "G");
		System.out.println(printPath(result2));
		ISearchAIgo al1 = new DepthFirstSearchAIgo();
		Node result3 = al1.execute(nodeS, "A", "G");
		System.out.println(printPath(result3));
		
		ISearchAIgo a3 = new UniformCostSearchAlgo();
		Node res = a3.execute(nodeS, "G");
		System.out.println(printPath(res));
	}
}
