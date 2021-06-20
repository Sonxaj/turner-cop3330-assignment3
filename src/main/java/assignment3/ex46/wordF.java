/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jonas Turner
 *
 */

package assignment3.ex46;

public class wordF implements Comparable<wordF>{

    private String content;
    private int frequency;

    public wordF(String content){
        super();

        this.content = content;
        this.frequency = 1;
    }

    public int getFrequency(){
        return this.frequency;
    }

    public String getContent(){
        return this.content;
    }

    public void incrementFreq(){
        this.frequency++;
    }

    public String printStars(){
        String out = "";

        for (int i = 0; i < this.frequency; i++) {
            out += "*";
        }

        return out;
    }


    // for comparing wordF frequencies
    @Override
    public int compareTo(wordF word){
        return (this.frequency - word.getFrequency());
    }
}
