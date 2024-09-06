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

	public String printNumber(Number num) {
		return num.value.toString();
	}

	public String printSum(Sum sum) {
		return sum.left.print(this) + " + " + sum.right.print(this);
	}

	public String printMult(Mult mult) {
		return "(" + mult.left.print(this) + " * " + mult.right.print(this) + ")";
	}

	public String printMinus(Minus sub) {
		return sub.left.print(this) + " - " + sub.right.print(this);
	}
}
