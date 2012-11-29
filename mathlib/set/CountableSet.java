package mathlib.set;

public class CountableSet extends Set {
	private long count = 0;

	@Override
	public CardinalNumber getCard() {
		return new CardinalNumber(count);
	}

	/*
	 * We need to check the buffer to find whether the element is in the set or not
	 * @see mathlib.set.Set#isIn(mathlib.set.Element)
	 */
	@Override
	public boolean isIn(Element e) {
		return false;
	}

	@Override
	public boolean isSubset(Set b) {
		// TODO Auto-generated method stub
		return false;
	}
}
