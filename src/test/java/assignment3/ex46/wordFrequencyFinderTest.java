/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jonas Turner
 *
 */

package assignment3.ex46;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class wordFrequencyFinderTest {
    wordFrequencyFinder test = new wordFrequencyFinder();

    @ParameterizedTest
    @ValueSource(strings = {"badger", "mushroom", "snake"})
    void readWords_adds_words_to_hashmap(String testWord) {
        int flag = 0;
        test.readWords();

        if(!(test.words.containsKey(testWord))){
            flag = 1;
        }

        assertEquals(0, flag);
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 2, 1})
    void readWords_adds_intended_frequencies(int testFreq) {
        int wordFlag = 0;
        int flag = 0;

        test.readWords();

        List<wordF> testList = new ArrayList<>(test.words.values());

        for (wordF w:testList) {
            if(w.getFrequency() != testFreq){
                // should be no more than 2
                wordFlag++;
            }
        }

        if(wordFlag > 2)
            flag = 1;

        assertEquals(0, flag);
    }
}