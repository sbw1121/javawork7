package cn.edu.guet;
import com.alibaba.fastjson.JSON;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class TicketServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("余票查询");
        String startStation = request.getParameter("startStation");
        System.out.println("起始站："+startStation);
        String endStation = request.getParameter("endStation");
        System.out.println("终点站："+endStation);
        String departureDate = request.getParameter("departureDate");
        System.out.println("出发日期："+departureDate);

        String ticketList = TicketSearch.search(startStation, endStation, departureDate);

        String json=JSON.toJSON(ticketList).toString();

        response.setContentType("application/json;charset=UTF-8");
        PrintWriter out=response.getWriter();
        out.print(json);
        out.flush();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
