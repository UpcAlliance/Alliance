package com.alliance.announcement;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alliance.announcement.AnnouncementBean;
import com.alliance.announcement.AnnouncementDAO;

public class PublishAnnouncementServler extends HttpServlet {

	private static final long serialVersionUID = 1L;
	/**
	 * Constructor of the object.
	 */
	public PublishAnnouncementServler() {
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
		String announcement_title = request.getParameter("title");
		String announcement_content = request.getParameter("content");
		//int publisher_id = Integer.parseInt(request.getParameter("publisher_id"));

		AnnouncementBean ab = new AnnouncementBean();//利用得到的请求参数实例化对应JavaBean
		ab.setAnnouncement_title(announcement_title);
		ab.setAnnouncement_content(announcement_content);
		//ab.setAnnouncement_id(3);
		ab.setAnnouncement_publisher(1);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		ab.setAnnouncement_time(df.format(new Date()));
		
		AnnouncementDAO announcementDao = new AnnouncementDAO();//利用对应DAO来操作数据库，得到返回结果
		try {
			if(announcementDao.addAnnouncement(ab) == 1)//利用对应DAO来操作数据库，得到返回结果，这里是1，也可返回List<Object>等
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
