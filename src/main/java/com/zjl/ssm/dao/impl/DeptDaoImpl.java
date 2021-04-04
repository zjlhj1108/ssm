package com.zjl.ssm.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zjl.ssm.bean.Dept;
import com.zjl.ssm.dao.DeptDao;
import com.zjl.ssm.mapper.DeptMapper;
@Repository
public class DeptDaoImpl implements DeptDao {
	@Autowired
	private DeptMapper deptMapper;

	@Override
	public List<Dept> getAllEmp() {
		// TODO Auto-generated method stub
		return deptMapper.getAllDept();
	}

}
