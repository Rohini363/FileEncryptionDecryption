package com.example;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.*;

@MultipartConfig
public class FileEncryptorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String ENCRYPTION_KEY = "simplekey";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String operation = request.getParameter("operation");
        System.out.println("POST called");
        Part filePart = request.getPart("file");

        String fileName = filePart.getSubmittedFileName();
        InputStream fileContent = filePart.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(fileContent));
        StringBuilder fileData = new StringBuilder();

        String line;
        while ((line = reader.readLine()) != null) {
            fileData.append(line).append("\n");
        }

        String result;
        if ("encrypt".equals(operation)) {
            result = simpleEncrypt(fileData.toString());
        } else {
            result = simpleDecrypt(fileData.toString());
        }

        //HttpSession session = request.getSession();
        request.setAttribute("result", result);
        request.setAttribute("operation", operation);
        //response.sendRedirect("result.jsp");
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

    private static final int SHIFT = 3;

 // Caesar cipher with control character protection
 private String simpleEncrypt(String text) {
     StringBuilder encrypted = new StringBuilder();
     for (char c : text.toCharArray()) {
         if (c < 32 || c == 127) {
             encrypted.append(c);
         } else {
             encrypted.append((char)(c + SHIFT));
         }
     }
     return encrypted.toString();
 }

 private String simpleDecrypt(String text) {
     StringBuilder decrypted = new StringBuilder();
     for (char c : text.toCharArray()) {
         if (c < 32 || c == 127) {
             decrypted.append(c);
         } else {
             decrypted.append((char)(c - SHIFT));
         }
     }
     return decrypted.toString();
 }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        System.out.println("GET called");
        PrintWriter out = response.getWriter();
        out.println("<h3>Error: GET method is not supported. Please use the form on <a href='index.html'>index.html</a>.</h3>");
    }

}
