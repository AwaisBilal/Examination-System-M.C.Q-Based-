import java.net.InetAddress;
import java.sql.Time;

public class result implements java.io.Serializable{

	
	private static final long serialVersionUID = 1L;
	private int marks,attempQuestion,totalQuestion,marksPq;
	private InetAddress usedIp;
	private Time sTime,conTime;
	private String Pname,sname;
	
	public result(int marks,int attmpQ,Time sT,Time cT,InetAddress ip){
		this.marks=marks;
		this.attempQuestion=attmpQ;
		this.sTime=sT;
		this.conTime=cT;
		this.usedIp=ip;
	}
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public InetAddress getUsedIp() {
		return usedIp;
	}
	public void setUsedIp(InetAddress usedIp) {
		this.usedIp = usedIp;
	}
	public int getAttempQuestion() {
		return attempQuestion;
	}
	public void setAttempQuestion(int attempQuestion) {
		this.attempQuestion = attempQuestion;
	}
	public Time getConTime() {
		return conTime;
	}
	public void setConTime(Time conTime) {
		this.conTime = conTime;
	}
	public Time getsTime() {
		return sTime;
	}
	public void setsTime(Time sTime) {
		this.sTime = sTime;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public int getTotalQuestion() {
		return totalQuestion;
	}

	public void setTotalQuestion(int totalQuestion) {
		this.totalQuestion = totalQuestion;
	}

	public int getMarksPq() {
		return marksPq;
	}

	public void setMarksPq(int marksPq) {
		this.marksPq = marksPq;
	}

	public String getsname() {
		return sname;
	}

	public void setSname(String s) {
		this.sname = s;
	}
}
