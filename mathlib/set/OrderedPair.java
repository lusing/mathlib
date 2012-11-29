package mathlib.set;

public class OrderedPair extends CountableSet {
	private Element x;
	private Element y;
	public OrderedPair(Element x, Element y){
		this.x = x;
		this.y = y;
		this.count = 2;
	}
}
