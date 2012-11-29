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

	/*
	 * Empty Set is subset of any set
	 * @see mathlib.set.Set#isSubset(mathlib.set.Set)
	 */
	@Override
	public boolean isSubset(Set b) {
		return true;
	}

	@Override
	public Set getUnion(Set b) {
		return b;
	}

	@Override
	public Set getIntersection(Set b) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Set getDifference(Set b) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Set getPowerSet() {
		// TODO Auto-generated method stub
		return this;
	}
}
