package com.sg.dvdlibrary.ui;

/**
 * This interface is designed for User interaction
 * It has methods to print messages,reading strings and
 * reading integers.
 */
public interface UserIo {
    /**
     * Prints a message
     * @param message
     */
    void print(String message);

    /**
     * reads a string using a user input
     * @param userInput
     * @return returns a string
     */
    String readString(String userInput);

    /**
     * Reads an integer
     * @param userInput
     * @return int
     */
    int readInt(String userInput);


}
