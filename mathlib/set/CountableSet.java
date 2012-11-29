package mathlib.set;

public class CountableSet extends Set {
	protected long count = 0;

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

	@Override
	public Set getUnion(Set b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set getIntersection(Set b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set getDifference(Set b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set getPowerSet() {
		// TODO Auto-generated method stub
		return null;
	}
}
