package io.github.gregsen.NameGeneratorClasses;

import java.util.*;
import java.util.Scanner;



public class App {
    public static void main(String[] args){
        // Initializing New Objects for handling input and generating random Numbers
        InputHandler handleInput = new InputHandler();
        RandomNumberGenerator GeneratorObject = new RandomNumberGenerator();

        int randomNumberPlaceholder = 0;
        
        // Prepare the Array where the final Nickname will be stored
        String[] NicknameResult = new String[4];

        // Will be stored in NicknameResult after the UserName
        final String the = "The";

        String GivenUsername = handleInput.setUserName();
        
        //save the username in the first index of the Nickname_result array
        NicknameResult[0] = GivenUsername;
        NicknameResult[1] = the;

        // chosen category will be stored 
        int selectedCategory = handleInput.setCategoryOption();


        //Parameter selectedCategory will be passed and it will loop if unvalid category INT was typed in
        selectedCategory = handleInput.loopUntilValidCategory(selectedCategory);


        
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

            PrintGeneratedName.PrintUsername(NicknameResult);

            // close the scanner from the object handleInput
            handleInput.scanner.close();
    } 
}   