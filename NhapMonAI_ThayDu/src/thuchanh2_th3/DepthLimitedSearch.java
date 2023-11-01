package thuchanh2_th3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthLimitedSearch {

	public Node execute(Node root, String goal, int limitedDepth) {
		Stack<Node> frontier = new Stack<Node>();
		frontier.add(root);
		List<Node> explored = new ArrayList<Node>();
		while (!frontier.isEmpty()) {
			Node current = frontier.pop();
			if (current.getDepth() < limitedDepth) {
				if (current.getLabel().equals(goal)) {
					return current;
				} else {
					List<Node> children = current.getChildrenNodes();
					for (Node child : children) {
						if (!frontier.contains(child) && !explored.contains(child)) {
							frontier.add(child);
							child.setParent(current);
							child.setDepth(current.getDepth() + 1);
						}
					}
				}
			}
		}
		return null;
	}

}
