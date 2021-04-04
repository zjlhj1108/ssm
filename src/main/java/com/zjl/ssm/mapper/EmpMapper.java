package com.zjl.ssm.mapper;

import java.util.List;

import com.zjl.ssm.bean.Emp;

public interface EmpMapper {

	List<Emp> getAllEmp();

	Integer insertEmp(Emp emp);

}
