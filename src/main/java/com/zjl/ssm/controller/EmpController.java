package com.zjl.ssm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zjl.ssm.bean.Emp;
import com.zjl.ssm.service.EmpService;

@Controller
public class EmpController {
	@Autowired
	private EmpService empService;
	@RequestMapping(value="/emps",method=RequestMethod.GET)
	public String getAllEmp(Map<String,Object> map) {
		List<Emp> eList = empService.getAllEmp();
		map.put("eList", eList);
		System.out.println(eList);
		return "elist";
	}

}
