package thuchanh2_th3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearchAIgo implements ISearchAIgo {
	@Override
	public Node execute(Node root, String goal) {
		// TODO Auto-generated method stub
		Queue<Node> frontier = new LinkedList<Node>();
		frontier.add(root);
		List<Node> explored = new ArrayList<>();
		while (!frontier.isEmpty()) {
			Node current = frontier.poll();
			if (current.getLabel().equals(goal)) {
				return current;
			} else {
				explored.add(current);
				List<Node> children = current.getChildrenNodes();
				for (Node child : children) {
					if (!frontier.contains(child) && !explored.contains(child)) {
						frontier.add(child);
						child.setParent(current);
					}
				}
			}
		}

		return null;
	}

	@Override
	public Node execute(Node root, String start, String goal) {
		// TODO Auto-generated method stub
		
		Queue<Node> frontier = new LinkedList<Node>();
		boolean started = false;
		frontier.add(root);
		List<Node> explored = new ArrayList<>();
		while (!frontier.isEmpty()) {
			Node current = frontier.poll();
			if(current.getLabel().equals(start)) {
				started=true;
				frontier.clear();
				explored.clear();
				current.setParent(null);
			}
			if (current.getLabel().equals(goal)) {
				return current;
			} else {
				explored.add(current);
				List<Node> children = current.getChildrenNodes();
				for (Node child : children) {
					if (!frontier.contains(child) && !explored.contains(child)) {
						frontier.add(child);
					}
					child.setParent(current);
				}
			}
		}

		return null;
	}

}
