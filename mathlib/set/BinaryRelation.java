package mathlib.set;

public abstract class BinaryRelation extends CartesianProduct {
	public abstract boolean isReflexivity();
	public abstract boolean isSymmetry();
	public abstract boolean isAntiSymmetry();
	public abstract boolean isTransitivity();
}
