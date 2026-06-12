package jdbc;

public class Emp {
	private int eid;
	private String ename;
	private double esal;
	private String desg;
	public Emp(int eid, String ename, double esal, String desg) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.desg = desg;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", desg=" + desg + "]";
	}
	
}
