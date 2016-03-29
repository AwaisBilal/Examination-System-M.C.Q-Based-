import java.io.Serializable;

public class users implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private String u_name,u_pass,u_username,u_role,u_email;
	
	public users(String name,String pass,String uName,String role,String email){
		this.u_name=name;
		this.u_email=email;
		this.u_pass=pass;
		this.u_role=role;
		this.u_username=uName;
	}
	
	
	
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_pass() {
		return u_pass;
	}
	public void setU_pass(String u_pass) {
		this.u_pass = u_pass;
	}
	public String getU_username() {
		return u_username;
	}
	public void setU_username(String u_username) {
		this.u_username = u_username;
	}
	public String getU_role() {
		return u_role;
	}
	public void setU_role(String u_role) {
		this.u_role = u_role;
	}
	public String getU_email() {
		return u_email;
	}
	public void setU_email(String u_email) {
		this.u_email = u_email;
	}
}
