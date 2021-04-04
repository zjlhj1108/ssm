package com.zjl.ssm.dao;

import java.util.List;

import com.zjl.ssm.bean.Emp;

public interface EmpDao {

	List<Emp> getAllEmp();

	Integer insertEmp(Emp emp);

	Integer deleteChecked(String ids);

	Integer deleteOne(String eid);

	Emp getEmpById(String eid);

	Integer updateEmp(Emp emp);

}
