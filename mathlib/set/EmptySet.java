package mathlib.set;

public class EmptySet extends Set {

	/*
	 * The Cardinal number of empty set is 0. 
	 */
	@Override
	public CardinalNumber getCard() {
		return new CardinalNumber(0l);
	}

	/*
	 * No Element can be in an empty set so we directly return false.
	 */
	@Override
	public boolean isIn(Element e) {
		return false;
	}
}
