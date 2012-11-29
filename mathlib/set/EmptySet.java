package mathlib.set;

public class EmptySet extends Set {

	@Override
	public CardinalNumber getCard() {
		return new CardinalNumber(0l);
	}
}
