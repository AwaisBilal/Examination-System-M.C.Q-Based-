import java.io.*;
import java.net.*;
import java.util.LinkedList;

public class Client {
	static ObjectOutputStream out;
	static PrintWriter ps;
	static ObjectInputStream in;
	static BufferedReader br;
	static Socket client;

		
	public Client(){
		try {
			client = new Socket("172.16.11.189",4444);
			out = new ObjectOutputStream(client.getOutputStream());
			ps= new PrintWriter(client.getOutputStream(),true);	
			br=new BufferedReader(new InputStreamReader(client.getInputStream()));
		} 
		catch (UnknownHostException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e);		
		}
	}

	public Socket getClient(){
		return client;
	}
//	public papers insertPaper(){
	//		LinkedList<papers> llp = new LinkedList<papers>();
	//		papers p = new papers("DSA","PaperName",20,50,4,0,new Time(02,30,00),new Date(2015,01,05),new Time(9,0,0));
	//		p.setInstruction("Hello Boys this is instruction");
	//		llp.add(p);
//	}
	
	public LinkedList<result> studentResultOfPaper(String pname){
				ps.println("view result all student of paper '"+pname+"'");
				try {
					in= new ObjectInputStream(client.getInputStream());
					@SuppressWarnings("unchecked")
					LinkedList<result> lr=(LinkedList<result>) in.readObject();
					return lr;
				} catch (IOException | ClassNotFoundException e) {
					e.printStackTrace();
					return null;
				}
				
	//			while(lp.isEmpty()==false)
	//			{
	//				result r=lp.removeFirst();
	//				System.out.println(r.getsname());
	//				System.out.print(r.getMarks()+"\t");
	//				System.out.print(r.getAttempQuestion()+"\t");
	//				System.out.print(r.getMarksPq()+"\t");
	//				System.out.println(r.getPname()+"\t");				
	//			}
				
				
				
	}

	public LinkedList<users> getStudentOfPaper(String pname){
				ps.println("view student who gave paper '"+pname+"'");
				try {
					in= new ObjectInputStream(client.getInputStream());
					@SuppressWarnings("unchecked")
					LinkedList<users> lp=(LinkedList<users>) in.readObject();
					//			while(lp.isEmpty()==false)
					//				System.out.println(lp.removeFirst().getU_name());
					return lp;
				} catch (IOException | ClassNotFoundException e) {
					e.printStackTrace();
					return null;
				}
				

	}
		
	public result getResultOfStudent(String sname,String pname){
				ps.println("result of student '"+sname+"', '"+pname+"' ");
				try {
					in= new ObjectInputStream(client.getInputStream());
					result r=(result) in.readObject();
					return r;
				} catch (IOException | ClassNotFoundException e) {
					e.printStackTrace();
					return null;
				}
	}
		
	public LinkedList<papers> getConductedPapers(){
				try {
					ps.println("view all conducted papers");
					in= new ObjectInputStream(client.getInputStream());
					@SuppressWarnings("unchecked")
					LinkedList<papers> lp=(LinkedList<papers>) in.readObject();
					return lp;
				} catch (IOException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return null;
				}
	}

	public void updatePaper(String pname,papers p){				
				try {
					out.writeObject(p);
					ps.println("edit paper details '"+pname+"'");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	
	public LinkedList<papers> getDraftPaper(){

				try {
					ps.println("view all draft papers");
					in= new ObjectInputStream(client.getInputStream());
					@SuppressWarnings("unchecked")
					LinkedList<papers> lp=(LinkedList<papers>) in.readObject();
								while(lp.isEmpty()==false)
									System.out.println(lp.removeFirst().getP_name());
					return lp;
				} catch (IOException | ClassNotFoundException e) {
					e.printStackTrace();
					return null;
				}
		
	}

	public void setPaperCode(String pname){
				String code=papers.generateCode();
//				System.out.println(code);
				ps.println("set paper code '"+pname+"','"+code+"'");
	}
		
	public void insertQuestion(LinkedList<Question> ql,String pname){		
		try {
			ps.println("Insert Question in '"+pname+"'");
			out.writeObject(ql);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
				
	public void insertPaper(papers p){
				
				try {
					ps.println("Insert Paper");
					out.writeObject(p);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	
	public papers paperDetails(String pname){
		papers pOb=new papers();
				try {
					ps.println("view paper details '"+pname+"'");
					in= new ObjectInputStream(client.getInputStream());
					
					pOb = (papers) in.readObject();
					System.out.println(pOb.getP_name()+"\t"+pOb.getGrades()+"\t"+pOb.getMarks_per_question());
					System.out.println(pOb.getInstruction());
					System.out.println(pOb.getN_marking());
					
				} catch (ClassNotFoundException|IOException e) {
					e.printStackTrace();
					return null;
				} 
				return pOb;
	}
		
	public void deletePaper(String pname){	
			ps.println("delete paper '"+pname+"'");
	}

	public String login(String username,String pass){
		ps.println("log in '"+username+"','"+pass+"'");
		
		try {
			in= new ObjectInputStream(client.getInputStream());
			users us = (users) in.readObject();
			return (us.getU_role());
		} 
		catch (IOException | ClassNotFoundException e) {
			return "";}

	}

	public LinkedList<papers> getCompletePaper(){
					ps.println("view all complete papers");
					try {
						in= new ObjectInputStream(client.getInputStream());
//						@SuppressWarnings("unchecked")
						@SuppressWarnings("unchecked")
						LinkedList<papers> lp=(LinkedList<papers>) in.readObject();
						while(lp.isEmpty()==false)
							System.out.println(lp.removeFirst().getP_name());	
						
						return lp;
					} catch (IOException | ClassNotFoundException e) {
						return null;
					}
	}

	public void deleteQuestion(String question){
					ps.println("delete question '"+question+"'");
	}
	
	public LinkedList<Question> viewPaperQuestion(String pname){
				try {
					ps.println("View Paper '"+pname+"'");
					in= new ObjectInputStream(client.getInputStream());
					@SuppressWarnings("unchecked")
					LinkedList<Question> qll=(LinkedList<Question>)in.readObject();
//					while(qll.isEmpty()==false){
//						Question q=qll.removeFirst();
//						System.out.println(q.getStatement()+q.getOp1()+q.getOp2()+q.getOp3()+q.getOp4()+q.getAns());
//					}
					return qll;
				} catch (IOException | ClassNotFoundException e) {
					e.printStackTrace();
					return null;
				}

	}	


}



//ps.println("sign up");
//			users u =new users("Afra Sayab","Passafra2013","afra2013","Student","afra2013@namal.edu.pk");
//			out.writeObject(u);