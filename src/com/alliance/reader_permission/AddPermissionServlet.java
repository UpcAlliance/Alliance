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
		doPost(request,response);//�������ݶ���Post��ʽ�ύ
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
		int authorizer_id = Integer.parseInt(request.getParameter("authorizer_id"));//ע�⣬�����authorizer_id�Ǳ���ÿһ�������name
		int authorizee_id = Integer.parseInt(request.getParameter("authorizee_id"));
		
		ReaderBean rb = new ReaderBean();//���õõ����������ʵ������ӦJavaBean
		rb.setAuthorizer_id(authorizer_id);
		rb.setAuthorizee_id(authorizee_id);
		
		ReaderDAO readerDao = new ReaderDAO();//���ö�ӦDAO���������ݿ⣬�õ����ؽ��
		try {
			if(readerDao.addReaderPermission(rb) == 1)//���ö�ӦDAO���������ݿ⣬�õ����ؽ����������1��Ҳ�ɷ���List<Object>��
			{
				out.print("<script>alert('��ӳɹ���');history.back();</script>");//���ظ�Jsp���ض��������Servlet/Jsp
			}
			else
			{
				out.print("<script>alert('���ʧ�ܣ�');history.back();</script>");
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
