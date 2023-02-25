package com.sg.dvdlibrary.ui;

import java.util.Scanner;

public class UserIoImplements implements UserIo {
    final private Scanner getUserInput = new Scanner(System.in);
    @Override
    public void print(String msg) {
        System.out.println(msg);


    }

    /**
     * This method reads a string
     * @param prompt
     * @return
     */
    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        return getUserInput.nextLine();
    }







    /**
     * This method reads a integer.
     * @param readPrompt
     * @return
     */
    @Override
    public int readInt(String readPrompt) {
        int intResult=0;
        String stringValue = this.readString(readPrompt);
        // Get the input line, and try and parse
        intResult = Integer.parseInt(stringValue);
        System.out.println(readPrompt);
        return intResult;
    }
}
