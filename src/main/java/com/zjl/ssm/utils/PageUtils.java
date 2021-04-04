package com.zjl.ssm.utils;

import javax.servlet.http.HttpSession;

import com.github.pagehelper.PageInfo;

public class PageUtils<T> {
	// 简单的分页查询
	public String getPages(PageInfo<T> pi,HttpSession hs,String mappingPth) {
		StringBuilder sb = new StringBuilder();
		String path = hs.getServletContext().getContextPath()+"/"+mappingPth;
		int navigateFirstPage = pi.getNavigateFirstPage();
		sb.append("<a href=" + path + "/"+navigateFirstPage+">首页</a>&nbsp;&nbsp;");
		// 上一页
		boolean hasPreviousPage = pi.isHasPreviousPage();
		if (hasPreviousPage) {
			sb.append("<a href=" + path + "/" + (pi.getPageNum() - 1) + ">上一页</a>&nbsp;&nbsp;");
		}

		// 处理中间页
		int[] navigatepageNums = pi.getNavigatepageNums();
		for (int i : navigatepageNums) {
			if (i == pi.getPageNum()) {
				sb.append("<a style='color:red' href=" + path + "/" + i + ">" + i + "</a>&nbsp;&nbsp;");
			} else {
				sb.append("<a href=" + path + "/" + i + ">" + i + "</a>&nbsp;&nbsp;");
			}
		}

		// 下一页
		boolean hasNextPage = pi.isHasNextPage();
		if (hasNextPage) {
			sb.append("<a href=" + path + "/" + (pi.getPageNum() + 1) + ">下一页</a>&nbsp;&nbsp;");
		}
		// 尾页
		int size = pi.getNavigateLastPage();
		sb.append("<a href=" + path + "/" + size + ">尾页</a>");
		return sb.toString();
	}

}
