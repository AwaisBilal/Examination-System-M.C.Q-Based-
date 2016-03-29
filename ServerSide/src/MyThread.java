import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.LinkedList;

public class MyThread extends Thread {
	private Socket cs;
	BufferedReader br;
	ObjectInputStream ois;
	ObjectOutputStream ous;
	MyThread(Socket s) 
	{
		this.cs = s;
	}
	public void run()
	{
		try {
			ois=new ObjectInputStream(cs.getInputStream());
			br=new BufferedReader(new InputStreamReader(cs.getInputStream()));
			String readInput=br.readLine();
			System.out.println(readInput);
			if(readInput.contains("log in")){
				getRole(readInput);
			}else if(readInput.contains("view result all student of paper")){
				getClassResult(readInput);
			}else if(readInput.contains("view student who gave paper")){
				getStudentOfPaper(readInput);
			}else if(readInput.contains("result of student ")){
				getStudentResult(readInput);
			}else if(readInput.contains("view all conducted papers")){
				getConductedPaper(readInput);
			}else if(readInput.contains("edit paper details")){
				editPaperdetails(readInput);
			}else if(readInput.contains("view all draft papers")){
				getDraftPaper();
			}else if(readInput.contains("view all complete papers")){
				System.out.println("f");
				getCompletePaper();
			}else if(readInput.contains("set paper code")){
				setPcode(readInput);
			}else if(readInput.contains("View Paper")){
				getPquestion(readInput);
			}else if(readInput.contains("Insert Question")){
				insertQuestion(readInput);
			}else if(readInput.contains("Insert Paper")){
				insertPaper(readInput);
			}
			else if(readInput.contains("view paper details")){
				getPaperDetails(readInput);
			}
			else if(readInput.contains("delete paper")){
				deletePaper(readInput);
			}
			else if(readInput.contains("delete question ")){
				deleteQuestion(readInput);
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}


	private void deleteQuestion(String readInput) {
		String []sl=readInput.split("'");
		readInput=sl[1];
		new HibernateUtilities().deleteQuestion(readInput);
	}
	
	private void deletePaper(String readInput) {
		String []sl=readInput.split("'");
		String pName=sl[1];
		new HibernateUtilities().deletePaper(pName);
	}
	
	private void getPaperDetails(String readInput) throws IOException {
		String []sl=readInput.split("'");
		String pName=sl[1];
		ous=new ObjectOutputStream(cs.getOutputStream());
		ous.writeObject(new HibernateUtilities().getPaperByName(pName));
	}
	
	private void insertPaper(String readInput) throws ClassNotFoundException, IOException {
		new HibernateUtilities().insertPaper((papers) ois.readObject());
	}
	
	@SuppressWarnings("unchecked")
	private void insertQuestion(String readInput) throws ClassNotFoundException, IOException {
		String []sl=readInput.split("'");
		String pName=sl[1];
		new HibernateUtilities().InsertQuestion(pName,(LinkedList<Question>) ois.readObject());
	}
	
	private void getPquestion(String readInput) throws IOException {
		String []sl=readInput.split("'");
		String pName=sl[1];
		ous=new ObjectOutputStream(cs.getOutputStream());
		ous.writeObject(new HibernateUtilities().getPaperQuestion(pName));		
	}
	
	private void setPcode(String readInput) {
		String []sl=readInput.split("'");
		String Pname=sl[1];String code= sl[3];
		new HibernateUtilities().setP_code(Pname, code);
	}
	
	private void getCompletePaper() throws IOException {
		ous=new ObjectOutputStream(cs.getOutputStream());
		ous.writeObject(new HibernateUtilities().getCompletePapers());
	}
	
	private void getDraftPaper() throws IOException {
		ous=new ObjectOutputStream(cs.getOutputStream());
		ous.writeObject(new HibernateUtilities().getAllDraftPaper());
	}
	
	private void editPaperdetails(String readInput) throws ClassNotFoundException, IOException {
		String []sl=readInput.split("'");
		String pname=sl[1];
		new HibernateUtilities().updatePaper(pname,(papers)ois.readObject());
	}	
	
	private void getConductedPaper(String readInput) throws IOException {
		ous=new ObjectOutputStream(cs.getOutputStream());
		ous.writeObject(new HibernateUtilities().getConductedPaper());
	}
	
	private void getStudentResult(String readInput) throws IOException {
		String []sl=readInput.split("'");
		String sn=sl[1];String pn= sl[3];
		ous=new ObjectOutputStream(cs.getOutputStream());
		ous.writeObject(new HibernateUtilities().getStudentResult(sn, pn));
	}
	
	private void getStudentOfPaper(String readInput) throws IOException {
		String []sl=readInput.split("'");
		String name=sl[1];
		ous=new ObjectOutputStream(cs.getOutputStream());
		ous.writeObject(new HibernateUtilities().getPaperStudent(name));
	}
		
	private void getClassResult(String readInput) throws IOException {
		String []sl=readInput.split("'");
		String paperName=sl[1];
		ous=new ObjectOutputStream(cs.getOutputStream());
		ous.writeObject(new HibernateUtilities().getClassResult(paperName));
	}
			
	private void getRole(String Input) throws IOException {
		String []sl=Input.split("'");
		String username=sl[1];String password= sl[3];
		ous=new ObjectOutputStream(cs.getOutputStream());
		ous.writeObject(new HibernateUtilities().login(username, password));
	}
	
}