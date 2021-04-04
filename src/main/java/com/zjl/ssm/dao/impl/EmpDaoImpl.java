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

	@Override
	public Integer insertEmp(Emp emp) {
		// TODO Auto-generated method stub
		return empMapper.insertEmp(emp);
	}

	@Override
	public Integer deleteChecked(String ids) {
		// TODO Auto-generated method stub
		return empMapper.deleteChecked(ids);
	}

	@Override
	public Integer deleteOne(String eid) {
		// TODO Auto-generated method stub
		return empMapper.deleteOne(eid);
	}

	@Override
	public Emp getEmpById(String eid) {
		// TODO Auto-generated method stub
		return empMapper.getEmpById(eid);
	}

	@Override
	public Integer updateEmp(Emp emp) {
		// TODO Auto-generated method stub
		return empMapper.updateEmp(emp);
	}

}
