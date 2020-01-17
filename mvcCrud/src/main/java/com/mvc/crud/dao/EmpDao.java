package com.mvc.crud.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mvc.crud.beans.Emp;

public class EmpDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Emp p) {
		String sql = "insert into mem(NAME,SALARY,DESIGNATION) values('" + p.getNAME() + "'," + p.getSALARY() + ",'"+ p.getDESIGNATION() + "')";
		return template.update(sql);
	}

	public int update(Emp p) {
		String sql = "update mem set NAME='" + p.getNAME() + "', SALARY=" + p.getSALARY() + ",DESIGNATION='"
				+ p.getDESIGNATION() + "' where ID=" + p.getID() + "";
		return template.update(sql);
	}

	public int delete(int id) {
		String sql = "delete from mem where ID=" + id + "";
		return template.update(sql);
	}

	public Emp getEmpById(int id) {
		String sql = "select * from mem where ID=?";
		return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<Emp>(Emp.class));
	}

	public List<Emp> getEmployees() {
		return template.query("select * from mem", new RowMapper<Emp>() {
			public Emp mapRow(ResultSet rs, int row) throws SQLException {
				Emp e = new Emp();
				e.setID(rs.getInt(1));
				e.setNAME(rs.getString(2));
				e.setSALARY(rs.getFloat(3));
				e.setDESIGNATION(rs.getString(4));
				return e;
			}
		});
	}
}