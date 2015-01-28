package com.wgh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

public class FindProductServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public FindProductServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int currPage = 1;													//当前页码
		if(request.getParameter("page") !=null){							//判断传递页码是否有效
			currPage = Integer.parseInt(request.getParameter("page"));
		}
		ProductDao dao = new ProductDao();
		List<Product> list = dao.find(currPage);
		request.setAttribute("list", list);
		int pages;
		int count = dao.findCount();
		if(count % Product.PAGE_SIZE == 0){
			pages = count / Product.PAGE_SIZE;
		}else{
			pages = count / Product.PAGE_SIZE + 1;
		}
		StringBuffer sb = new StringBuffer();
		//通过循环构建分页条
		for(int i=1;i<=pages;i++){
			if(i == currPage){
				sb.append("["+i+"]");
			}else{
				sb.append("<a href='FindProductServlet?page="+i+"'>"+i+"</a>");
			}
			sb.append("");
		}
		request.setAttribute("bar", sb.toString());
		request.getRequestDispatcher("product_list.jsp").forward(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}