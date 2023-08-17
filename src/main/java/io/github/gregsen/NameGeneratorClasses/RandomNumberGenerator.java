package io.github.gregsen.NameGeneratorClasses;

import java.util.Random;

// Generiert die zufällige Zahl, Array und Int-Var werden als Parameter übergeben. Return-wert ist eine Zahl von 0 - array.length
public class RandomNumberGenerator {
    public int generated_num;
    public int ran_num_gen(String[] arr){
        // Object of Random Class named rand
        Random rand = new Random();

        // Variable generates random int from Range length of the array (parameter)
        int generated_num = rand.nextInt(arr.length);

        return generated_num;

    }
}
