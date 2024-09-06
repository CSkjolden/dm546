package Exercise1.Tree;

public interface IExpr {
	public Integer accept(IVisitor v);
	public String print(IVisitor v);
}
