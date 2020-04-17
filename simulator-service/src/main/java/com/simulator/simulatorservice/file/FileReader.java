package com.simulator.simulatorservice.file;

import java.util.Scanner;

public class FileReader {

    public FileReader() {
    }

    public Scanner reader(String file) throws Exception {
        java.io.File myObj = new java.io.File("/home/ramuspedro/projects/full-cycle-marathon/simulator-service/destinations/" + file + ".txt");
        Scanner myReader = new Scanner(myObj);
        return myReader;
    }
}
