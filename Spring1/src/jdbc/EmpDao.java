package jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDao {
	private JdbcTemplate template;

	
	public JdbcTemplate getTemplate() {
		return template;
	}


	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}


	public String saveData(Emp emp) {
		String s="Insert into emp values(?,?,?,?)";
		template.update(s, emp.getEid(),emp.getEname(),emp.getEsal(),emp.getDesg());
		return "Success";
	}
}
