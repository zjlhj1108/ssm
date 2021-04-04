package com.zjl.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zjl.ssm.bean.Dept;
import com.zjl.ssm.bean.Emp;
import com.zjl.ssm.service.DeptService;
import com.zjl.ssm.service.EmpService;
import com.zjl.ssm.utils.PageUtils;

@Controller
public class EmpController {
	@Autowired
	private EmpService empService;
	@Autowired
	private DeptService deptService;

	// 查询所有的员工
	@RequestMapping(value = "/emps/{page}", method = RequestMethod.GET)
	public String getAllEmp(Map<String, Object> map, @PathVariable("page") Integer page, HttpSession hs) {
		// 设置配置的起始页
		PageHelper.startPage(page, 2);
		// 获取所有的信息
		List<Emp> allEmp = empService.getAllEmp();
		// 设置page的信息，并且告诉显示几个页码
		PageInfo<Emp> pageInfo = new PageInfo<Emp>(allEmp, 5);
		// 设置分页查询
		PageUtils<Emp> pageUtils = new PageUtils<Emp>();
		String pages = pageUtils.getPages(pageInfo, hs, "emps");
		// 设置数据
		map.put("pageInfo", pageInfo);
		// 设置分页查询
		map.put("pages", pages);
		// 跳转页面
		return "elist";
	}

	// 跳转到添加页面
	@RequestMapping(value = "/toAdd", method = RequestMethod.GET)
	public String toUpdate(Map<String, Object> map) {
		// 查询所有的部门
		List<Dept> dList = deptService.getAllDept();
		// 放入作用域中
		map.put("dList", dList);
		// 一个map集合装性别
		Map<String, Object> genderMap = new HashMap<String, Object>();
		genderMap.put("0", "男");
		genderMap.put("1", "女");
		map.put("genderMap", genderMap);
		// 装入一个空对象
		map.put("emp", new Emp());
		// 跳转页面
		return "update";
	}

	// 添加员工
	@RequestMapping(value = "/emp", method = RequestMethod.POST)
	public String toUpdate(Emp emp) {
		// 设置员工的id
		emp.setEid(UUID.randomUUID().toString().substring(0, 8));
		empService.insertEmp(emp);
		// 跳转页面
		return "redirect:/emps/1";
	}

	// 批量删除员工
	@RequestMapping(value = "/emp", method = RequestMethod.DELETE)
	public String deleteChecked(String eid) {
		// 删除
		empService.deleteChecked(eid);
		// 跳转页面
		return "redirect:/emps/1";
	}

	// 删除单个
	@RequestMapping(value = "/emp/{id}", method = RequestMethod.DELETE)
	public String deleteOne(@PathVariable("id") String eid) {
		// 删除
		empService.deleteOne(eid);
		// 跳转页面
		return "redirect:/emps/1";
	}

	// 跳转修改页面
	@RequestMapping(value = "/toUpdate/{eid}", method = RequestMethod.GET)
	public String toUpdate(Map<String, Object> map, @PathVariable("eid") String eid) {
		// 查询所有的部门
		List<Dept> dList = deptService.getAllDept();
		// 放入作用域中
		map.put("dList", dList);
		// 一个map集合装性别
		Map<String, Object> genderMap = new HashMap<String, Object>();
		genderMap.put("0", "男");
		genderMap.put("1", "女");
		map.put("genderMap", genderMap);
		// 现在装入员工的信息
		Emp emp = empService.getEmpById(eid);
		map.put("emp", emp);
		// 跳转页面
		return "update";
	}
	// 修改页面
	@RequestMapping(value = "/emp", method = RequestMethod.PUT)
	public String updateEmp(Emp emp) {
		Integer i =empService.updateEmp(emp);
		// 跳转页面
		return "redirect:/emps/1";
	}
}
