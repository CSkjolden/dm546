package Exercise1.Tree;

public class Minus implements IExpr{
	IExpr left;
	IExpr right;

	public Minus(IExpr left, IExpr right) {
		this.left = left;
		this.right = right;
	}
	public Integer accept(IVisitor v) {
		return v.visitMinus(this);
	}

	public String print(IVisitor v) {
		return v.printMinus(this);
	}
}
