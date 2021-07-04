import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph {

	private final Node startNode;

	public Graph(Node startNode) {
		this.startNode = startNode;
	}

	private static List<Path> createPathList(Path... paths) {
		return new ArrayList<>(Arrays.asList(paths));
	}

	public static Graph build() {

		// create the end node (node 9)
		Node n9 = new Node(null, false, true);
		// create path from n8 to n9
		Path p8 = new Path(n9, 6);
		// create node 8
		Node n8 = new Node(createPathList(p8),false, false, 5);
		// create path from n7 to n8
		Path p7 = new Path(n8, 8);
		// create node 7
		Node n7 = new Node(createPathList(p7), false, false, 7);
		// create node 5
		Node n5 = new Node(null, false, false, 12);
		// create node 6
		Node n6 = new Node(null, false, false, 10);
		// create path from n4 to n7
		Path p41 = new Path(n7, 4);
		// create path from n4 to n6
		Path p42 = new Path(n6, 3);
		// create path from n4 to n5
		Path p43 = new Path(n5, 1);
		// create node 4
		Node n4 = new Node(createPathList(p41, p42, p43), false, false, 12);
		// create path from n3 to n4
		Path p3 = new Path(n4, 12);
		// create node 3
		Node n3 = new Node(createPathList(p3), false, false, 16);
		// create node 2
		Node n2 = new Node(null, false, false, 25);
		// create path from n1 to n2
		Path p12 = new Path(n2, 1);
		// create path from n1 to n3
		Path p13 = new Path(n3, 2);
		// create path from n1 to n4
		Path p14 = new Path(n4, 8);
		// create node 1
		Node n1 = new Node(createPathList(p12, p13, p14), true, false, 18);

		return new Graph(n1);
	}
}
