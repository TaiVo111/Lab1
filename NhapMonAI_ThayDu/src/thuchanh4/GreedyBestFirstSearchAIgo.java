package thuchanh4;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

//Chiến lược tìm kiếm tham lam
public class GreedyBestFirstSearchAIgo implements IInformedSearchAIgo {
//g thay đổi h ko thay đổi
	@Override
	public Node execute(Node root, String goal) {
		// TODO Auto-generated method stub
		PriorityQueue<Node> frontier = new PriorityQueue<Node>(new NodeComparatorByGn());
		List<Node> explored = new ArrayList<>();
		frontier.add(root);
		while (!frontier.isEmpty()) {
			Node current = frontier.poll();
			if (current.getLabel().equals(goal)) {
				return current;
			} else {
				explored.add(current);
				List<Edge> children = current.getChildren();
				for (Edge child : children) {
					Node n = child.getEnd();
					if (!frontier.contains(n) && !explored.contains(n)) {
						n.setParent(current);
						frontier.add(n);
					} else if (frontier.contains(n) && n.getH() > current.getH()) {
						n.setParent(current);
					}
				}
			}
		}
		return null;
	}

	@Override
	public Node execute(Node root, String start, String goal) {
		// TODO Auto-generated method stub
		return null;
	}

}
