package com.sg.dvdlibrary.view;

import com.sg.dvdlibrary.dto.Dvd;
import com.sg.dvdlibrary.ui.UserIo;
import com.sg.dvdlibrary.ui.UserIoImplements;

import java.util.Scanner;

/**
 *This method is used to implement the methods that are needed for the User to view the output and
 * retrive their input
 */
public class DvdLibraryView {

    private UserIo io;

    public DvdLibraryView(UserIo io) {
        this.io = io;
    }

    /**
     * This method displays the menu selection with different options
     * and returns an int depending on the User's choice.
     * @return
     */
    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. Add a new Dvd");//DONE
        io.print("2. List the Dvds");//DONE change it to
        io.print("3. Edit information from a Dvd");//Done
        io.print("4. Remove the Dvds");//done
        io.print("5. Display the information for a particular DVD ");//Done
        io.print("6. Search for a DVD by title ");//Done
        io.print("7.Exit");


        //Scanner intInput=new Scanner(System.in);
        int readIntInput=io.readInt("Please choose an integer");

        return readIntInput;

    }

    /**
     * This method retrieves information requires the information
     * to create new dvd
     * @return dvd
     */
    public Dvd getNewDvdInfo(){ //createNewDvd for Controller and the menu in the controller
        String title=io.readString("Please enter the title of the DVD");
        String date=io.readString("Please enter the date when the Dvd was published");
        String  mpaaRating=io.readString("Please enter the MPAA Rating");
        String directorsName=io.readString("Please enter the directors name");
        String studio=io.readString("Please enter the studio name");
        String userRating=io.readString("Please enter the userrating");
        Dvd createDvd=new Dvd(title,date,mpaaRating,directorsName,studio,userRating);
        createDvd.setTitle(title);
        createDvd.setDate(date);
        createDvd.setMpaaRating(mpaaRating);
        createDvd.setDirectorsName(directorsName);
        createDvd.setStudio(studio);
        createDvd.setUserRating(userRating);
        return createDvd;


    }

    /**
     * This method is used to retrive the edit prompt from the user.
     * @return string
     */
    public String getEditPrompt(){
        String editPrompt=io.readString("Please enter what you would like to edit?");
        return editPrompt;
    }

    /**
     * This method is used to retrive the date
     * @return string
     */
    public String getEditDate(){
        String date=io.readString("Please enter the date when the Dvd was published");
        return date;

    }

    /**
     * This method is used to retrive the mpaa rating
     * @return string
     */
    public String getEditMpaaRating(){
        String  mpaaRating=io.readString("Please enter the MPAA Rating");
        return mpaaRating;
    }
    /**
     * This method is used to retrive the directors name
     * @return string
     */
    public String getEditdirectorsName(){
        String directorsName=io.readString("Please enter the directors name");
        return directorsName;
    }

    /**
     * This method is used to retrive the studio
     * @return string
     */
    public String getEditstudio(){
        String studio=io.readString("Please enter the studio name");
        return studio;
    }

    /**
     * This method is used to retrive the user rating
     * @return string
     */
    public String getEditUserrating(){
        String userRating=io.readString("Please enter the userrating");
        return userRating;
    }

    /**
     * This method gets the dvd title
     * @return string
     */
    public String getDvdTitle(){
        String title=io.readString("Please enter the title of the DVD");
        return title;
    }




}
