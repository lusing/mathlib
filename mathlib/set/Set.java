package mathlib.set;

public abstract class Set {
	public abstract CardinalNumber getCard();
	
	public static CardinalNumber card(Set a){
		return a.getCard();
	}
	
	public abstract boolean isIn(Element e);
	public abstract boolean isSubset(Set b);
	
	/*
	 * If A is in B and B is in A, then A=B
	 */
	public boolean isEqual(Set b){
		return (this.isSubset(b) && b.isSubset(this));
	}
	
	public static boolean isIn(Element e, Set a){
		return a.isIn(e);
	}
}
