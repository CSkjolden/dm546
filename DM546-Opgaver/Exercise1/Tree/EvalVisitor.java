package Exercise1.Tree;

public class EvalVisitor implements IVisitor{

	public Integer visitNumber(Number num) {
		return num.value;
	}

	public Integer visitSum(Sum sum) {
		return sum.left.accept(this) + sum.right.accept(this);
	}

	public Integer visitMult(Mult mult) {
		return mult.left.accept(this) * mult.right.accept(this);
	}

	public Integer visitMinus(Minus sub) {
		return sub.left.accept(this) - sub.right.accept(this);
	}
}
