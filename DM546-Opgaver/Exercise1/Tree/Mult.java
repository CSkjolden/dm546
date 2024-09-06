package Exercise1.Tree;

public class Mult implements IExpr{
	IExpr left;
	IExpr right;

	public Mult(IExpr left, IExpr right) {
		this.left = left;
		this.right = right;
	}
	public Integer accept(IVisitor v) {
		return v.visitMult(this);
	}

	public String print(IVisitor v) {
		return v.printMult(this);
	}
}
