package com.example.sroy.funfact;

import java.util.Random;

/**
 * Created by sroy on 3/23/18.
 */

class FactBook {

    // List of facts
    String[] facts = {
            "The average litter of kittens is between 2 - 6 kittens.",
            "Unlike other cats, lions have a tuft of hair at the end of their tails.",
            "Cats can’t see directly below their noses.",
            "Cats (and dogs) sweat through their paws.",
            "Domestic cats purr both when inhaling and when exhaling.",
            "Cats are way more popular in America than dogs are (88 million > 74 million).",
            "A cat's normal temperature varies around 101 degrees Fahrenheit.",};

    String getFact() {

        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);

        return facts[randomNumber];
    }

}
