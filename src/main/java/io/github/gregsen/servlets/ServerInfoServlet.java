package io.github.gregsen.servlets;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.PrintWriter;

public class ServerInfoServlet extends HttpServlet {
    private static final Logger LOG = LoggerFactory.getLogger(ServerInfoServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        LOG.debug("Request: " + req.getQueryString());
        
        // Commented this out to test different requestParameters
        //final String server_type = req.getParameter("server_type");

        if (req.getQueryString() == null) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            final PrintWriter writer = resp.getWriter();
            writer.write("{\"status\":\"400\",\"message\":\"no server type provided\"}");
            writer.write("{server_type}:"+ "null");
            writer.flush();
            writer.close();
            
        }

        if (req.getQueryString().equals("test")) {
            PrintWriter writer = resp.getWriter();
            System.out.println("Success test");
            writer.write("{\"status\":\"200\",\"message\":\"Parameter provided  'test'\"}");
            writer.flush();
            writer.close();
        }

        if (req.getQueryString().equalsIgnoreCase("tomcat")) {
            final PrintWriter writer = resp.getWriter();
            writer.write("Tomcat Server!\n");
            writer.flush();
            writer.close();
       
    }
   
    } 
}
