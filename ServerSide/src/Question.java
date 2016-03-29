
public class Question implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private String statement;
	private String op1,level;
	private String op2;
	private String op3;
	private String op4;
	private int ans;
	
	public Question(String s,String o1,String o2,String o3,String o4,int a,String l){
		this.statement=s;
		this.op1=o1;
		this.op2=o2;
		this.op3=o3;
		this.op4=o4;
		this.ans=a;
		this.level=l;
	}
	
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	public String getOp1() {
		return op1;
	}
	public void setOp1(String op1) {
		this.op1 = op1;
	}
	public String getOp2() {
		return op2;
	}
	public void setOp2(String op2) {
		this.op2 = op2;
	}
	public String getOp4() {
		return op4;
	}
	public void setOp4(String op4) {
		this.op4 = op4;
	}
	public String getOp3() {
		return op3;
	}
	public void setOp3(String op3) {
		this.op3 = op3;
	}
	public int getAns() {
		return ans;
	}
	public void setAns(int ans) {
		this.ans = ans;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
}