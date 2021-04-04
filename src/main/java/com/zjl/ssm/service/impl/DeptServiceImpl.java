package com.zjl.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjl.ssm.bean.Dept;
import com.zjl.ssm.bean.Emp;
import com.zjl.ssm.dao.DeptDao;
import com.zjl.ssm.service.DeptService;
@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptDao deptDao;

	@Override
	public List<Dept> getAllDept() {
		// TODO Auto-generated method stub
		return deptDao.getAllEmp();
	}

}
