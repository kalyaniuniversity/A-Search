import java.util.List;

public class Main {

	public static void main(String[] args) {

		Graph graph = Graph.build();
		AStar astar = new AStar(graph);
		List<Node> searchPath = astar.getSearchPath();
	}
}
