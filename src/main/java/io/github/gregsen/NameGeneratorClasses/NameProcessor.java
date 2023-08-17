package io.github.gregsen.NameGeneratorClasses;

public class NameProcessor {
   public static String categoryOne(int rand_num_placeholder,RandomNumberGenerator GeneratorObject ,String[] NicknameResult,String[] soft_adjective){
        System.out.println("> You selected Soft! your Title will become softer");

           // place the generated number in a variable (the wont be greater or smaller than the length of the array)
           rand_num_placeholder = GeneratorObject.ran_num_gen(Names.soft_adjectives);

           // Use the random number to append the index-string of the number to our Array:Nickname-result
           NicknameResult[2] = Names.soft_adjectives[rand_num_placeholder];
           System.out.println("> Your title got an adjective now... done");

           return NicknameResult[2];
   }

   public static String categoryTwo(int rand_num_placeholder,RandomNumberGenerator GeneratorObject ,String[] NicknameResult,String[] heroic_adjectives){
        System.out.println("> You selected Soft! your Title will become softer");

           // place the generated number in a variable (the wont be greater or smaller than the length of the array)
           rand_num_placeholder = GeneratorObject.ran_num_gen(Names.heroic_adjectives);

           // Use the random number to append the index-string of the number to our Array:Nickname-result
           NicknameResult[2] = Names.heroic_adjectives[rand_num_placeholder];
           System.out.println("> Your title got an adjective now... done");

           return NicknameResult[2];
   }

  public static String categoryThree(int rand_num_placeholder,RandomNumberGenerator GeneratorObject ,String[] NicknameResult,String[] someRandomAdj){
        System.out.println("> You selected Soft! your Title will become softer");

           // place the generated number in a variable (the wont be greater or smaller than the length of the array)
           rand_num_placeholder = GeneratorObject.ran_num_gen(Names.someRandomAdj);

           // Use the random number to append the index-string of the number to our Array:Nickname-result
           NicknameResult[2] = Names.someRandomAdj[rand_num_placeholder];
           System.out.println("> Your title got an adjective now... done");

           return NicknameResult[2];
   }

   // last step: add title to the NicknameResult Array using static title-array and a random number
   public static void addTitleToNickname(String[] NicknameResult,int randomNumberPlaceholder){
    NicknameResult[3] = Names.title[randomNumberPlaceholder];
   }
}
