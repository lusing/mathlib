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
	
	public abstract Set getUnion(Set b);
	public abstract Set getIntersection(Set b);
	public abstract Set getDifference(Set b);
	public Set getSymmetricDifference(Set b){
		return difference(union(this,b),intersection(this,b));
	}
	
	public abstract Set getPowerSet();
	
	public static Set union(Set a, Set b){
		return a.getUnion(b);
	}
	
	public static Set intersection(Set a, Set b){
		return a.getIntersection(b);
	}
	
	public static Set difference(Set a, Set b){
		return a.getDifference(b);
	}
	
	/*
	 * A*B, Cartesian Product
	 */
	public Set getCartesianProduct(Set b){
		return null;
	}
}
