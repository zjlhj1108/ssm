package com.zjl.ssm.mapper;

import java.util.List;

import com.zjl.ssm.bean.Emp;

public interface EmpMapper {

	List<Emp> getAllEmp();

	Integer insertEmp(Emp emp);

	Integer deleteChecked(String ids);
	Integer deleteOne(String ids);

	Emp getEmpById(String eid);

	Integer updateEmp(Emp emp);

}
