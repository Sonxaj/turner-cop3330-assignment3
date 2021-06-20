/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jonas Turner
 *
 */

package assignment3.ex43;

import java.io.*;

public class WebsiteGenerator {

    public void folderCreate(String directory){
        // create folder at "directory"
        new File(directory).mkdirs();
    }


    public void rootFolderGen(String name){

        // create root folder
        folderCreate("output/exercise43_output/website/" + name);

        // print success
        System.out.println("Created .../website/" + name);
    }


    public void jScriptFolGen(String name, String choice){

        // if able
        if(choice.equalsIgnoreCase("y")){

            // create javaScript folder
            folderCreate("output/exercise43_output/website/" + name + "/js");

            // print success
            System.out.println("Created .../website/" + name + "/js/");
        }
    }


    public void cssFolGen(String name, String choice){

        // if able
        if(choice.equalsIgnoreCase("y")){

            // create CSS folder
            folderCreate("output/exercise43_output/website/" + name + "/css");

            // print success
            System.out.println("Created .../website/" + name + "/css/");
        }
    }


    public void htmlGenerator(String name, String author){

        // create index.html
        File htmlFile = new File("output/exercise43_output/website/" + name + "/index.html");

        // make string; edit <title> to "name" and <meta> to "author"
        String htmlText = "<html>\n" +
                            "\t<head>\n" +
                                "\t\t<title>" + name + "</title>\n" +
                                "\t\t<meta name = \"author\" content = \"" + author + "\"/>\n" +
                            "\t</head>\n\n" +
                            "\t<body> This is your new website! </body>\n" +
                        "</html>";

        // write to index.html
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(htmlFile));
            writer.write(htmlText);
            writer.close();

        }catch (IOException e){
            System.out.println("Error. Could not write to file.");
            e.printStackTrace();
        }
        // print success
        System.out.println("Created .../website/" + name + "/index.html");
    }
}
