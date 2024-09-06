package Exercise1.Tree;

public interface IVisitor {
	Integer visitNumber(Number num);
	Integer visitSum(Sum sum);
	Integer visitMult(Mult mult);
	Integer visitMinus(Minus sub);
	String printNumber(Number num);
	String printSum(Sum sum);
	String printMult(Mult mult);
	String printMinus(Minus sub);
}
