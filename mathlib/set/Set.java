package mathlib.set;

public abstract class Set {
	public abstract CardinalNumber getCard();
	
	public static CardinalNumber card(Set a){
		return a.getCard();
	}
	
	public abstract boolean isIn(Element e);
	public abstract boolean isSubset(Set b);
}
