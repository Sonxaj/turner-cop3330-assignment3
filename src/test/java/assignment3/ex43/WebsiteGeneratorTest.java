/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jonas Turner
 *
 */

package assignment3.ex43;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteGeneratorTest {
    WebsiteGenerator generator = new WebsiteGenerator();

    @Test
    void folderCreate_creates_folder_at_target_directory() {
        int flag = 0;

        generator.folderCreate("src/test/java/assignment3/ex43/test");

        Path test = Path.of("src/test/java/assignment3/ex43/test");

        if(!Files.exists(test)){
            flag = 1;
        }

        assertEquals(0, flag);
    }
}