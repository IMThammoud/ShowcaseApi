package io.github.gregsen.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.text.html.parser.Parser;

import io.github.gregsen.NameGeneratorClasses.App;
import io.github.gregsen.NameGeneratorClasses.InputHandler;
import io.github.gregsen.NameGeneratorClasses.NameProcessor;
import io.github.gregsen.NameGeneratorClasses.Names;
import io.github.gregsen.NameGeneratorClasses.PrintGeneratedName;
import io.github.gregsen.NameGeneratorClasses.RandomNumberGenerator;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProcessNameServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        
         // Initializing New Objects for handling input and generating random Numbers
        InputHandler handleInput = new InputHandler();
        RandomNumberGenerator GeneratorObject = new RandomNumberGenerator();

        int randomNumberPlaceholder = 0;
        
        // Prepare the Array where the final Nickname will be stored
        String[] NicknameResult = new String[4];

        // Will be stored in NicknameResult after the UserName
        final String the = "The";

        String GivenUsername = req.getParameter("name");
        
        //save the username in the first index of the Nickname_result array
        NicknameResult[0] = GivenUsername;
        NicknameResult[1] = the;

        // chosen category will be stored 
        int selectedCategory = Integer.parseInt(req.getParameter("adjective"));


        


        
        if (selectedCategory == 1) {
            // If category :1 then add soft adjective to NicknameResult
            NameProcessor.categoryOne(randomNumberPlaceholder,GeneratorObject,NicknameResult,Names.soft_adjectives);

        }

        if (selectedCategory == 2) {
            // If category :2 then add heroic adjective to NicknameResult
            NameProcessor.categoryTwo(randomNumberPlaceholder,GeneratorObject,NicknameResult,Names.heroic_adjectives);

        }

        if (selectedCategory == 3) {
            // If category :3 then add random adjectives to NicknameResult
            NameProcessor.categoryThree(randomNumberPlaceholder, GeneratorObject, NicknameResult,Names.someRandomAdj);
        }


            // generate another random number for the last addition to the Nickname
            randomNumberPlaceholder = GeneratorObject.ran_num_gen(Names.soft_adjectives);

            // append the last string to the array
            NameProcessor.addTitleToNickname(NicknameResult, randomNumberPlaceholder);

            String SuperDuperResult = PrintGeneratedName.PrintUsername(NicknameResult);

            PrintWriter writer = resp.getWriter();
            writer.write("Your Username is ready:\n\n "+ SuperDuperResult);


    }
    
}
