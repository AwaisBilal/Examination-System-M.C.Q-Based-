import java.io.Serializable;

public class subjects implements Serializable{


	private static final long serialVersionUID = 3100280092174395603L;

	private String s_name;
	private int s_id,s_year;
	
	public subjects(String n,int id,int y){
		this.setS_id(id);
		this.setS_name(n);
		this.setS_year(y);
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public int getS_year() {
		return s_year;
	}

	public void setS_year(int s_year) {
		this.s_year = s_year;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
}
