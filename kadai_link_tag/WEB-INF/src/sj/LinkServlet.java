package sj;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LinkServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		// リクエストのエンコード設定
        request.setCharacterEncoding("UTF-8");
        
        // レスポンスのコンテンツタイプ設定
        response.setContentType("text/html; charset=UTF-8");
        
        // JSPからのリクエストデータ取得
        String personName = request.getParameter("name");
        
        request.setAttribute("name", personName);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        
        dispatcher.forward(request, response);
	}
	
	
}
