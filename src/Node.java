import java.util.ArrayList;
import java.util.List;

public class Node {

	private final boolean isStart;
	private final boolean isEnd;
	private final List<Path> paths = new ArrayList<>();

	// This is an underestimate; this should never overestimate for the heuristics to work
	// This is also known as the heuristic measure
	private int costToGoalState;

	public boolean visited = false;

	public Node(
		List<Path> paths,
		boolean isStart,
		boolean isEnd
	) {

		this.isStart = isStart;
		this.isEnd = isEnd;

		if (paths != null)
			this.paths.addAll(paths);
	}

	public Node(
		List<Path> paths,
		boolean isStart,
		boolean isEnd,
		int costToGoalState
	) {
		this(paths, isStart, isEnd);
		this.costToGoalState = costToGoalState;
	}

	private int getAScore(Path path) {
		// there is a problem here, what is it?
		return this.costToGoalState + path.weight();
	}

	public Path getBestPath() {

		if (this.paths.isEmpty())
			return null;

		Path bestPath = this.paths.get(0);

		for (Path path : this.paths)
			if (this.getAScore(path) < this.getAScore(bestPath))
				bestPath = path;

		return bestPath;
	}
}
