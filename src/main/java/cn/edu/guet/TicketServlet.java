package cn.edu.guet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class TicketServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("余票查询");
        String startStation = request.getParameter("startStation");
//        System.out.println("起始站："+startStation);
        String endStation = request.getParameter("endStation");
//        System.out.println("终点站："+endStation);
        String departureDate = request.getParameter("departureDate");
//        System.out.println("出发日期："+departureDate);

        TicketSearch.search(startStation,endStation,departureDate);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
