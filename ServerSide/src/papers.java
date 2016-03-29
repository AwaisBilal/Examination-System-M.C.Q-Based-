import java.sql.Date;
import java.sql.Time;
import java.util.Random;

public class papers implements java.io.Serializable{


	private static final long serialVersionUID = 1L;
	private String Subject,p_name,instruction;
	private int grades;
	private int question_per_paper;
	private int marks_per_question;
	private int n_marking;
	private Time timeOfPaper;
	private Date p_date;
	private Time time;
	private String pCode;
	
	public papers(String sbj,String name,int grd,int qpp,int mpq,int nmark,Time tOfp,Date date,Time sTime){
		this.Subject=sbj;
		this.p_name=name;
		this.grades=grd;
		this.question_per_paper=qpp;
		this.marks_per_question=mpq;
		this.n_marking=nmark;
		this.timeOfPaper=tOfp;
		this.p_date=date;
		this.time=sTime;
		
	}
	
	public papers() {
		// TODO Auto-generated constructor stub
	}

	public static String generateCode(){
		String code="";
		Random rand=new Random();
		do{
		int i=rand.nextInt(99999);
		code=Integer.toString(i);
		}
		while(code.length()<5);
			
		return code;
	}
	
	
	
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getGrades() {
		return grades;
	}
	public void setGrades(int grades) {
		this.grades = grades;
	}
	public int getQuestion_per_paper() {
		return question_per_paper;
	}
	public void setQuestion_per_paper(int no_per_paper) {
		this.question_per_paper = no_per_paper;
	}
	public int getMarks_per_question() {
		return marks_per_question;
	}
	public void setMarks_per_question(int marks_per_question) {
		this.marks_per_question = marks_per_question;
	}
	public int getN_marking() {
		return n_marking;
	}
	public void setN_marking(int n_marking) {
		this.n_marking = n_marking;
	}
	public Time getTimeOfPaper() {
		return timeOfPaper;
	}
	public void setTimeOfPaper(Time timeOfPaper) {
		this.timeOfPaper = timeOfPaper;
	}
	public Date getP_date() {
		return p_date;
	}
	public void setP_date(Date p_date) {
		this.p_date = p_date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}	
}