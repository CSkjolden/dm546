package Exercise1.Tree;

public class Sum implements IExpr{
	IExpr left;
	IExpr right;

	public Sum(IExpr left, IExpr right) {
		this.left = left;
		this.right = right;
	}
	public Integer accept(IVisitor v) {
		return v.visitSum(this);
	}

}
