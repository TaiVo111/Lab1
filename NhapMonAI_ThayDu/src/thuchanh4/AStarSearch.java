package thuchanh4;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import thuchanh2_th3.NodeComparator;

public class AStarSearch implements IInformedSearchAIgo{

	@Override
	public Node execute(Node root, String goal) {
		PriorityQueue<Node> frontier = new PriorityQueue<Node>(new NodeComParator());
		List<Node> explored = new ArrayList<>();
		frontier.add(root);
		while(!frontier.isEmpty()) {
			Node current = frontier.poll();
			if(current.getLabel().equals(goal)) {
				return current;
			}else {
				explored.add(current);
				List<Edge> children = current.getChildren();
				for(Edge child : children) {
					Node n = child.getEnd();
					if(!frontier.contains(n) && !explored.contains(n)) {
						n.setG(current.getG()+child.getWeight());
						n.setParent(current);
						frontier.add(n);
						
					}else if(frontier.contains(n) && n.getG()> current.getG()+child.getWeight()) {
						frontier.remove(n);
						n.setParent(current);
						n.setG(current.getG()+child.getWeight());
						frontier.add(current);
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
	//sbcdfg
	

}
