package com.zjl.ssm.mapper;

import java.util.List;

import com.zjl.ssm.bean.Dept;

public interface DeptMapper {

	List<Dept> getAllDept();
	Dept getDeptById();

}
