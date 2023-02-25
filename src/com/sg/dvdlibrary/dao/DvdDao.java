package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.Dvd;

import java.io.File;
import java.util.ArrayList;

/**
 * This interface is responsible for the DvdDao
 * it has methods such as reading the file,adding a new Dvd
 * getting a DvdByTitle and removing Dvd and writing to a file.
 */
public interface DvdDao {

    /**
     *This method reads the file and returns an arraylist of the
     * file's contents
     * @param fileName
     * @return ArrayList
     */
    ArrayList<Dvd> readFile(String fileName);
    /**
     *This method allows the user to add a new Dvd to the list
     * file's contents
     * @param title,date,mpaaRating,directorsName,studio and userRating.
     *
     */
    void addDvd(String title, String date, String mpaaRating, String directorsName, String studio, String userRating);

    /**
     * This method gets the dvd by title.
     * @param title
     * @return dvd
     */
    Dvd getDvdByTitle(String title);

    /**
     * This method removes a Dvd.
     * @param dvd
     */
    void removeDvd(Dvd dvd);

    /**
     * This methods retrieves an arraylist of Dvds
     * @return
     */
    ArrayList <Dvd> getAllDvds();

    /**
     * This methods writes the contents of the arraylist to a file.
     */
    void writeToFile();

}
