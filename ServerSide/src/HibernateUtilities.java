import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class HibernateUtilities {

	private static Connection connection = null;

	private static void connectionToDataBase(String databaseName)  {
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/"+databaseName, "postgres",
					"namal123");
			connection.setAutoCommit(false);
		}		//try close 
		catch (ClassNotFoundException | SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}// catch close
	}//function end

	
	
	
	
	public LinkedList<papers> getConductedPaper(){

		LinkedList<papers> lp = new LinkedList<papers>();
		try {
			connectionToDataBase("rawdata");
			Statement st=null;ResultSet rs=null;
			st=connection.createStatement();
			String query="select distinct p_name from papers p inner join result r on p.p_id=r.p_id;";
			rs=st.executeQuery(query);
			while(rs.next()){
				papers pap=new papers();
				String s=(rs.getString("p_name"));
				pap.setP_name(s);
				lp.add(pap);
			}
			st.close();
			connection.commit();
			connection.close();
		} catch (SQLException e) {
			System.out.println(e);		
			return null;
		}
		return lp;
	}
	
	
	
	public result getStudentResult(String Sn,String Pn){
		result r = new result();
		try {
			connectionToDataBase("rawdata");
			String query="select p_name,p_totalQuestion, p_marksperquestion,p_nmarking,r_marks,r_attemptedQuestions from result r inner join papers p on p.p_id=(select p_id from papers where p_name='"+Pn+"') and r.p_id=(select p_id from papers where p_name='"+Pn+"' and r.u_id=(select u_id from users where u_name='"+Sn+"'));";
			Statement st=null;
			st=connection.createStatement();
			ResultSet rs= st.executeQuery(query);
			while(rs.next()){
				r.setSname(Sn);
				r.setPname(rs.getString("p_name"));
				r.setTotalQuestion(rs.getInt("p_totalQuestion"));
				r.setMarksPq(rs.getInt("p_marksperquestion"));
				r.setMarks(rs.getInt("r_marks"));
				r.setAttempQuestion(rs.getInt("r_attemptedquestions"));
			}
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
		return r;
	}
	
	
	
	public LinkedList<users> getPaperStudent(String name){
		LinkedList<users> std= new LinkedList<users>();
		try {
			connectionToDataBase("rawdata");
			String query="select u_name from users u inner join result r on r.u_id=u.u_id where r.p_id=(select p_id from papers where p_name='"+name+"');";
			Statement st=null;
			st=connection.createStatement();
			ResultSet rs= st.executeQuery(query);
			while(rs.next()){
				users u = new users();
				u.setU_name(rs.getString("u_name"));
				std.add(u);
			}
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
		return std;
	}




	public users login(String username,String password)
	{
		users u =new users();
		try {

			connectionToDataBase("rawdata");
			String role = "Invalid Username";
			Statement st=null;ResultSet rs=null;
			String query="Select u_role from users where u_username='"+username+"' and u_password='"+password+"';";
			st=connection.createStatement();
			rs=st.executeQuery(query);
			while(rs.next()){
				role=rs.getString("u_role");
			}
			
			st.close();
			connection.commit();
			connection.close();
			u.setU_role(role);
		}
		catch (SQLException e) {
			
			return u;
		}
		return u;
	}


	public LinkedList<result> getClassResult(String paper){
		LinkedList<result> lr=new LinkedList<result>();
		LinkedList<users> lu=getPaperStudent(paper);
		while(lu.isEmpty()==false){
			lr.add(getStudentResult(lu.removeFirst().getU_name(),paper));
		}
		return lr;
	}
	
	
	
	public void updatePaper(String pname, papers p) {
		try {
			connectionToDataBase("rawdata");
			Statement st=null;
			st=connection.createStatement();
			String query ="update papers set p_name='"+p.getP_name()+"',p_date='"+p.getP_date()+"',p_time='"+p.getTime()+"',p_totalquestion='"+p.getQuestion_per_paper()+"',p_weightage='"+p.getGrades()+"',p_marksperquestion="+p.getMarks_per_question()+",p_nmarking="+p.getN_marking()+",p_instruction='"+p.getInstruction()+"',so_id=(select s.so_id from subjectsOffer s inner join subjects sb on sb.s_id=s.s_id where sb.s_name='"+p.getSubject()+"') where p_name='"+pname+"';";
			st.executeUpdate(query);
			st.close();
			connection.commit();
			connection.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	
	
	
	public LinkedList<papers> getAllDraftPaper() {
		LinkedList<papers> lp = new LinkedList<papers>();
		try {
			connectionToDataBase("rawdata");
			Statement st=null;ResultSet rs=null;
			st=connection.createStatement();
			String query="select p_name from papers where p_pincode is null;";
			rs=st.executeQuery(query);
			while(rs.next()){
				papers pap=new papers();
				String s=(rs.getString("p_name"));
				pap.setP_name(s);
				lp.add(pap);
			}
			st.close();
			connection.commit();
			connection.close();
		} catch (SQLException e) {
			System.out.println(e);		
			return null;
		}
		return lp;

	}
	
	
	
	public LinkedList<papers> getCompletePapers() {
		LinkedList<papers> lp = new LinkedList<papers>();
		try {
			connectionToDataBase("rawdata");
			Statement st=null;ResultSet rs=null;
			st=connection.createStatement();
			String query="select p_name from papers where p_pincode is not null;";
			rs=st.executeQuery(query);
			while(rs.next()){
				papers pap=new papers();
				String s=(rs.getString("p_name"));
				pap.setP_name(s);
				lp.add(pap);
			}
			st.close();
			connection.commit();
			connection.close();
		} catch (SQLException e) {
			System.out.println(e);		
			return null;
		}
		return lp;
	}
	
//	public static void main(String [] args){
//		LinkedList<papers> lp=new HibernateUtilities().getCompletePapers();
//		System.out.println(lp.remove().getP_name());
//	}
	
	
	public void setP_code(String pname, String code) {
		try {
			connectionToDataBase("rawdata");
			Statement st=null;
			String query="update papers set p_pincode= '"+code+"' where p_name='"+pname+"';";
			st=connection.createStatement();
			st.executeUpdate(query);
			st.close();

			connection.commit();
			connection.close();

		} catch (SQLException e) {
			System.out.println("paper code exception");
		}
	}
	
	
	
	public LinkedList<Question> getPaperQuestion(String pName) {
		int sq=getSqId(pName);
		try {
			connectionToDataBase("rawdata");
			String query="select pq_statement,pq_op1,pq_op2,pq_op3,pq_op4,pq_level from paperQuestion pq inner join setofquestion sq on sq.sq_id=pq.sq_id where sq.p_id="+sq+";";
			Statement st=null;
			st=connection.createStatement();
			ResultSet rs= st.executeQuery(query);
			LinkedList<Question> ll = new LinkedList<Question>();
			while(rs.next()){
				Question q = new Question(rs.getString("pq_statement"),rs.getString("pq_op1"),rs.getString("pq_op2"),rs.getString("pq_op3"),rs.getString("pq_op4"),1,rs.getString("pq_level"));
				ll.add(q);
			}
			return ll;
		} catch (SQLException e) {
			System.out.println(e);
		}
		return null;
	}
	
	
	
	public void InsertQuestion(String pName, LinkedList<Question> LLQuestion) {
		int sq=getSqId(pName);
		try {
			connectionToDataBase("rawdata");
			Statement st=null;
			while(LLQuestion.isEmpty()==false){
				Question q=LLQuestion.remove();
				String query="insert into paperQuestion (pq_id,pq_statement,pq_op1,pq_op2,pq_op3,pq_op4,pq_ans,sq_id) values ((select max(pq_id) from paperQuestion)+1,'"+q.getStatement()+"','"+q.getOp1()+"','"+q.getOp2()+"','"+q.getOp3()+"','"+q.getOp4()+"','"+q.getAns()+"',"+sq+");";
				st=connection.createStatement();
				st.executeUpdate(query);
				st.close();
			}
			connection.commit();
			connection.close();
		}
		catch (SQLException e) {
		}
	}
	
	
	

	public boolean setSetOfQuestionId(String name) {
		try {
			connectionToDataBase("rawdata");
			Statement st=null;
			st=connection.createStatement();
			String query="insert into setOfQuestion (sq_id,p_id) values ((select max(sq_id) from setofquestion)+1,(select p_id from papers where p_name ='"+name+"' LIMIT 1));";
			st.executeUpdate(query);
			st.close();

			connection.commit();
			connection.close();
		} catch (SQLException e) {
			System.out.println(e);
			return false;
		}

		return true;
	}

	public void insertPaper(papers p) {
		try {
			connectionToDataBase("rawdata");

			String query="insert into papers (p_id,p_name,p_date,p_time,p_totalQuestion,p_weightage,p_marksperquestion,p_nmarking,p_instruction,so_id) values ((select max(p_id) from papers)+1,'"+p.getP_name()+"','"+p.getP_date()+"','"+p.getTime()+"','"+p.getQuestion_per_paper()+"','"+p.getGrades()+"','"+p.getMarks_per_question()+"','"+p.getN_marking()+"','"+p.getInstruction()+"',(select s.so_id from subjectsOffer s inner join subjects sb on sb.s_id=s.s_id where sb.s_name='"+p.getSubject()+"'));";
			Statement st=null;st=connection.createStatement();
			st.executeUpdate(query);st.close();
			connection.commit();
			connection.close();

		} catch (SQLException e) {
		}
		setSetOfQuestionId(p.getP_name());
	}

	
	
	public papers getPaperByName(String pName) {
		papers pap = new papers();
		try {
			connectionToDataBase("rawdata");
			Statement st=null;ResultSet rs=null;
			st=connection.createStatement();
			String query="select p_name,p_date,p_time,p_totalquestion,p_weightage,p_marksperquestion,p_nmarking,p_instruction from papers where p_name='"+pName+"';";
			rs=st.executeQuery(query);
			while(rs.next()){
				pap.setP_name((rs.getString("p_name")));
				pap.setGrades((rs.getInt("p_weightage")));
				pap.setQuestion_per_paper((rs.getInt("p_totalquestion")));
				pap.setInstruction((rs.getString("p_instruction")));
				pap.setMarks_per_question((rs.getInt("p_marksperquestion")));
				pap.setP_date((rs.getDate("p_date")));
				pap.setN_marking((rs.getInt("p_nmarking")));
				pap.setTimeOfPaper(rs.getTime("p_time"));
			}
			st.close();
			connection.commit();
			connection.close();			
		} catch (SQLException e) {
			return null;
		}
		return pap;
	}
	
	
	
	public void deletePaper(String pName) {
		int sq=getSqId(pName);
		try {
			connectionToDataBase("rawdata");
			Statement st=null;
			String query="delete from papers where p_name='"+pName+"';";
			String query1="delete from setofquestion where sq_id="+sq+");";
			String query2="delete from paperQuestion where sq_id="+sq+");";
			
			st=connection.createStatement();
			st.executeUpdate(query1);
			st.executeUpdate(query);
			st.executeUpdate(query2);
			st.close();

			connection.commit();
			connection.close();

		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	
	
	public void deleteQuestion(String statement) {
		try {
			connectionToDataBase("rawdata");
			Statement st=null;
			String query = "delete from paperQuestion where pq_statement='"+statement+"';";
			st=connection.createStatement();
			st.executeUpdate(query);
			st.close();
			connection.commit();
			connection.close();
		}
		catch (SQLException e) {
		}
	}


	
	public static int getSqId(String Pname){
		int sq = -1;
		try {
			connectionToDataBase("rawdata");
			Statement st=null;
			ResultSet rs=null;
			String query = "Select sq_id from setOfQuestion where p_id=(select p_id from papers where p_name='"+Pname+"' LIMIT 1);";
			st=connection.createStatement();
			rs=st.executeQuery(query);
			while(rs.next()){
				sq=rs.getInt("sq_id");
			}
			st.close();
			connection.commit();
			connection.close();

		} catch (SQLException e) {
			System.out.println(e);
		}
		return sq;


	}

}
