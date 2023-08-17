package io.github.gregsen.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ShowcaseGET extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{

        // this String will be printed if this endpoint is triggered
        final String greeting = "Youre on my Showcase endpoint! \nif you want to display your name on this page then add it to the form.";

        // This String stores the Request-Parameter that was sent with the GET-Request on this Endpoint
        final String firstRequestParameter = req.getParameter("firstName");
        final String secondRequestParameter = req.getParameter("lastName");
       
        // Initialize an Object of PrintWriter class to write text to the page
        PrintWriter writer = resp.getWriter();

        // Write the First String to the Page
        writer.write(greeting);


        // This will be Executed if the a Request-Parameter was sent with the GET-Request, EXAMPLE: /api/showcase?hassan
        // The Parameter in this case is 'hassan' and will be printed out, if there is no Parameter then this block will be skipped
        if (!firstRequestParameter.isEmpty()) {
            writer.write("\n\n You filled this into the form: " + "\nFirstname: "+firstRequestParameter + " " + " Lastname: " + secondRequestParameter);
        }

        // flush that writer and close it, we have to keep it clean out here :D
        writer.flush();
        writer.close();
    }
}
