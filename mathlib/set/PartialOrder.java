package mathlib.set;

public class PartialOrder extends BinaryRelation {
	public boolean isReflexivity(){
		return true;
	}
	public boolean isSymmetry(){
		return false;
	}
	public boolean isTransitivity(){
		return true;
	}
	@Override
	public boolean isAntiSymmetry() {
		return true;
	}
}
