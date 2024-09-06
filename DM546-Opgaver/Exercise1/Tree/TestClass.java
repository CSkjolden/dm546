package Exercise1.Tree;

public class TestClass {
	public static void main(String[] args) {
		IExpr e = new Minus(new Sum(new Number(1), new Mult(new Number(2), new Number(3))), new Number(4));
		IVisitor v = new EvalVisitor();
		System.out.println(e.accept(v));
	}
}
