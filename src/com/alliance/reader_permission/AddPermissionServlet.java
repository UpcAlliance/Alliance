package com.alliance.reader_permission;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddPermissionServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public AddPermissionServlet() {
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
		doPost(request,response);//所有数据都以Post方式提交
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
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int authorizer_id = Integer.parseInt(request.getParameter("authorizer_id"));//注意，这里的authorizer_id是表单中每一项参数的name
		int authorizee_id = Integer.parseInt(request.getParameter("authorizee_id"));
		
		ReaderBean rb = new ReaderBean();//利用得到的请求参数实例化对应JavaBean
		rb.setAuthorizer_id(authorizer_id);
		rb.setAuthorizee_id(authorizee_id);
		
		ReaderDAO readerDao = new ReaderDAO();//利用对应DAO来操作数据库，得到返回结果
		try {
			if(readerDao.addReaderPermission(rb) == 1)//利用对应DAO来操作数据库，得到返回结果，这里是1，也可返回List<Object>等
			{
				out.print("<script>alert('添加成功！');history.back();</script>");//返回给Jsp或重定向给其他Servlet/Jsp
			}
			else
			{
				out.print("<script>alert('添加失败！');history.back();</script>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
