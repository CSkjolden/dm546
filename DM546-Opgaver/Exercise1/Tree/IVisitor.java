package Exercise1.Tree;

public interface IVisitor {
	Integer visitNumber(Number num);
	Integer visitSum(Sum sum);
	Integer visitMult(Mult mult);
}
