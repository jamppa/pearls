import java.util.List;

public final class BinarySearch {

	private final List<Integer> sortedElements;
	
	public BinarySearch(List<Integer> sortedList) {
		this.sortedElements = sortedList;
	}

	public int search(final Integer target) {
		
		int posLower = 0;
		int posUpper = sortedElements.size() - 1;
		int posMid;
		
		while (posLower <= posUpper) {
			posMid = (posLower + posUpper) / 2;
			if (targetUpperThanMid(posMid, target)) {
				posLower = posMid + 1;
			}
			if (targetLowerThanMid(posMid, target)) {
				posUpper = posMid - 1;
			}
			if (targetIsMid(posMid, target)) {
				return posMid;
			}
		}
		return -1;
	}

	private boolean targetIsMid(final int posMid, final Integer target) {
		return sortedElements.get(posMid) == target;
	}

	private boolean targetUpperThanMid(final int posMid, final Integer target) {
		return sortedElements.get(posMid) < target;
	}

	private boolean targetLowerThanMid(final int posMid, final Integer target) {
		return sortedElements.get(posMid) > target;
	}
	
}
