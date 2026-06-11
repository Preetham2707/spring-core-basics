package Bean;

import java.io.Serializable;
import java.util.Map;

public class College implements Serializable{
	private int cid;
	private String cname;
	private String cloc;
	private Student s;
	private Map<Integer,String> cCenterDetails;
	
	public College(int cid, String cname, String cloc, Student s, Map<Integer, String> cCenter) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cloc = cloc;
		this.s = s;
		this.cCenterDetails = cCenter;
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
	public Map<Integer, String> getcCenter() {
		return cCenterDetails;
	}
	public void setcCenter(Map<Integer, String> cCenter) {
		this.cCenterDetails = cCenter;
	}
	@Override
	public String toString() {
		return "College [cid=" + cid + ", cname=" + cname + ", cloc=" + cloc + ", s=" + s + ", cCenter=" + cCenterDetails
				+ "]";
	}
	
}
