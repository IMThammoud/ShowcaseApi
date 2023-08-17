package io.github.gregsen.NameGeneratorClasses;

import java.util.Scanner;

public class InputHandler {
    
    // This global scanner will be used for all methods in this class so no need to pass it as param
    public Scanner scanner = new Scanner(System.in);

    //Returns the UserName that the User typed in
    public String setUserName(){

        System.out.println("█████   █████  ███    ██ ██████   ██████  ███    ███       ███    ██  █████  ███    ███ ███████        ██████  ███████ ███    ██ ███████ ██████   █████  ████████  ██████  ██████  \n" +
                "██   ██ ██   ██ ████   ██ ██   ██ ██    ██ ████  ████       ████   ██ ██   ██ ████  ████ ██            ██       ██      ████   ██ ██      ██   ██ ██   ██    ██    ██    ██ ██   ██ \n" +
                "██████  ███████ ██ ██  ██ ██   ██ ██    ██ ██ ████ ██ █████ ██ ██  ██ ███████ ██ ████ ██ █████   █████ ██   ███ █████   ██ ██  ██ █████   ██████  ███████    ██    ██    ██ ██████  \n" +
                "██   ██ ██   ██ ██  ██ ██ ██   ██ ██    ██ ██  ██  ██       ██  ██ ██ ██   ██ ██  ██  ██ ██            ██    ██ ██      ██  ██ ██ ██      ██   ██ ██   ██    ██    ██    ██ ██   ██ \n" +
                "██   ██ ██   ██ ██   ████ ██████   ██████  ██      ██       ██   ████ ██   ██ ██      ██ ███████        ██████  ███████ ██   ████ ███████ ██   ██ ██   ██    ██     ██████  ██   ██ \n*** HELLO, USER! *** \n The Random-Name-Generator (also called RNG) will help you with your next Username.\n This Tool will Connect your Name with a random Title and print it out for you! \n App-flow\n #1: Input your Name \n #2: Select the category of the titles \n #3: Use your next Username! ");


        System.out.println("> Please enter your Name:");

        String userName = scanner.nextLine();
        
        
        

        return userName;
    }

    // returns the Option of the Category of Adjectives that the User typed in  (1,2 or 3)
    public int setCategoryOption(){
        System.out.println("> Now please type in the number to select a Category for your Title: \n 1: Soft \n 2: Heroic \n 3: Random \n");
        
        int categoryOption = scanner.nextInt();
        



        return categoryOption;
    }


    // this returns the option (1,2, or 3) or loops until one of these options are chosen -- Params are the selected option and the scanner
    public int loopUntilValidCategory(int selectedCategory){

        

        while(selectedCategory != 1 && selectedCategory != 2 && selectedCategory !=3){
            System.out.println("> Your input was invalid, please type in the number to select a Category for your Title: \n 1: Soft \n 2: Heroic\n 3: Random \n");
            selectedCategory = scanner.nextInt();
        }
        
        return selectedCategory;
    }


}
