package io.github.gregsen.NameGeneratorClasses;

public class PrintGeneratedName {
    public static String PrintUsername(String[] NicknameResult){
        System.out.println("> Your Name was generated:\n");

            String convertionNicknameResult = NicknameResult[0] +", "+ NicknameResult[1] +" "+ NicknameResult[2]+ " " +NicknameResult[3]; 
            System.out.println("Your Username: "+convertionNicknameResult);
            System.out.println("\n Thanks for using RNG");
            return convertionNicknameResult;
    }
}
