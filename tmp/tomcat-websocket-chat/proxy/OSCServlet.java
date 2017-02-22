package proxy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class OSCServlet extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1252";
    private static final String DOC_TYPE =
        "<!DOCTYPE html  \"-//W3C//DTD XHTML 1.0 Strict//EN\"\n" +
        "\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    /**Process the HTTP doGet request.
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<?xml version=\"1.0\"?>");
        out.println(DOC_TYPE);
        out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">");
        out.println("<head><title>OSCServlet</title></head>");
        out.println("<body>");
        out.println("<p>The servlet has received a GET. This is the reply.</p>");
        out.println("</body></html>");
        out.close();
    }

    /**Process the HTTP doPost request.
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<?xml version=\"1.0\"?>");
        out.println(DOC_TYPE);
        out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">");
        out.println("<head><title>OSCServlet</title></head>");
        out.println("<body>");
        out.println("<p>The servlet has received a POST. This is the reply.</p>");
        out.println("</body></html>");
        out.close();
    }
}
