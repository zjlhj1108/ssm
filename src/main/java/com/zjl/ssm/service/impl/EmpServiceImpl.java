package com.zjl.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjl.ssm.bean.Emp;
import com.zjl.ssm.dao.EmpDao;
import com.zjl.ssm.service.EmpService;
@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpDao empDao;

	@Override
	public List<Emp> getAllEmp() {
		// TODO Auto-generated method stub
		List<Emp> eList =empDao.getAllEmp();
		return eList;
	}

}
