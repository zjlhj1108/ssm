package com.zjl.ssm.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zjl.ssm.bean.Emp;
import com.zjl.ssm.dao.EmpDao;
import com.zjl.ssm.mapper.EmpMapper;
@Repository
public class EmpDaoImpl implements EmpDao {
	@Autowired
	private EmpMapper empMapper;

	@Override
	public List<Emp> getAllEmp() {
		// TODO Auto-generated method stub
		List<Emp> eList = empMapper.getAllEmp();
		return eList;
	}

}
