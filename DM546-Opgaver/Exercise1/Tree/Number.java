package Exercise1.Tree;

public class Number implements IExpr {

	Integer value;

	public Number(Integer value) {
		this.value = value;
	}
	public Integer accept(IVisitor v) {
		return v.visitNumber(this);
	}

	public String print(IVisitor v) {
		return v.printNumber(this);
	}
}
