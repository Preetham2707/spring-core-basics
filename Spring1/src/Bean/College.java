package Bean;

import java.io.Serializable;

public class College implements Serializable{
	private int cid;
	private String cname;
	private String cloc;
	private Student s;
	public College(int cid, String cname, String cloc, Student s) {
		this.cid = cid;
		this.cname = cname;
		this.cloc = cloc;
		this.s = s;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCloc() {
		return cloc;
	}
	public void setCloc(String cloc) {
		this.cloc = cloc;
	}
	public Student getS() {
		return s;
	}
	public void setS(Student s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return "College [cid=" + cid + ", cname=" + cname + ", cloc=" + cloc + ", s=" + s.toString() + "]";
	}
	
}
