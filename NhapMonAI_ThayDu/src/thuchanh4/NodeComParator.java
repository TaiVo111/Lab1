package thuchanh4;

import java.util.Comparator;

public class NodeComParator implements Comparator<Node> {

	@Override
	public int compare(Node o1, Node o2) {
		Double h1 = o1.getG() + o1.getH();
		Double h2 = o2.getG() + o2.getH();
		int res = h1.compareTo(h2);
		if (res == 0) {
			return o1.getLabel().compareTo(o2.getLabel());
		} else {

			return res;
		}
	}

}
