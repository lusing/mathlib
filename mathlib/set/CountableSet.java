package mathlib.set;

public class CountableSet extends Set {
	private long count = 0;

	@Override
	public CardinalNumber getCard() {
		return new CardinalNumber(count);
	}
}
