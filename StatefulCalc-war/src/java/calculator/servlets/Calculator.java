/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.servlets;

import calculator.ejb.CalculatorBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ACER
 */
@WebServlet(name = "Calculator", urlPatterns = {"/Calculator"})
public class Calculator extends HttpServlet {

    @EJB
    private CalculatorBeanLocal calculatorBean;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

double n1= 0.0;
double n2=0.0;
String sn1="";
String sn2="";
String value="";
String operator = "";

    if(request.getParameter("nol") != null) {
            calculatorBean.addSn1("0");
            
    }
        if(request.getParameter("satu") != null) {
           calculatorBean.addSn1("1");

    }
        if(request.getParameter("dua") != null) {
            calculatorBean.addSn1("2");
    }
        if(request.getParameter("tiga") != null) {
            calculatorBean.addSn1("3");
    }
        if(request.getParameter("empat") != null) {
            calculatorBean.addSn1("4");
    }
        if(request.getParameter("lima") != null) {
           calculatorBean.addSn1("5");
    }
        if(request.getParameter("enam") != null) {
            calculatorBean.addSn1("6");
    }
        if(request.getParameter("tujuh") != null){ 
            calculatorBean.addSn1("7");
    }
        if(request.getParameter("delapan") != null) {
           calculatorBean.addSn1("8");
    }
       if(request.getParameter("sembilan") != null) {
           calculatorBean.addSn1("9");
    }
       if(request.getParameter("titik") != null) {
           calculatorBean.addSn1(".");
    }
       if(request.getParameter("Reset") != null) {
           calculatorBean.Reset();
    }

if (request.getParameter("Add") != null) {
    operator+="Add";
    sn2 = calculatorBean.move(sn1);
    calculatorBean.operator(operator);
}
if (request.getParameter("Sub") != null) {
    operator+="Sub";
    sn2 = calculatorBean.move(sn1);
    calculatorBean.operator(operator);
}
if (request.getParameter("Div") != null) {
    operator+="Div";
    sn2 = calculatorBean.move(sn1);
    calculatorBean.operator(operator);
}
if (request.getParameter("Mul") != null) {
    operator+="Mul";
    sn2 = calculatorBean.move(sn1);
    calculatorBean.operator(operator);
}
 if(request.getParameter("hasil") != null) {
     sn1 = calculatorBean.getSn1();
     sn2 = calculatorBean.getSn2();
     n1 = Double.parseDouble(sn2);
     n2 = Double.parseDouble(sn1);
     operator = calculatorBean.getOperator();
     if(operator.equals("Add")) {
        value = Double.toString(calculatorBean.add(n1, n2));
        calculatorBean.movevalue(value);
     }
     if(operator.equals("Sub")) {
         value = Double.toString(calculatorBean.subtract(n1, n2));
         calculatorBean.movevalue(value);
     }
     if(operator.equals("Mul")) {
         value = Double.toString(calculatorBean.multiply(n1, n2));
         calculatorBean.movevalue(value);
     }
     if(operator.equals("Div")) {
         value = Double.toString(calculatorBean.divide(n1, n2));
         calculatorBean.movevalue(value);
     }
    }
request.setAttribute("display", "");
sn1 = calculatorBean.getSn1();
sn2 = calculatorBean.getSn2();
if(value.isEmpty()) {
    request.setAttribute("display", sn1);
}
else {
    request.setAttribute("display", value);
}


 getServletContext().getRequestDispatcher("/index.jsp").include(request, response);;

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
}
