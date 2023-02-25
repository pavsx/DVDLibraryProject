package com.sg.dvdlibrary.controller;

import com.sg.dvdlibrary.dao.DvdDao;
import com.sg.dvdlibrary.dao.DvdDaoFileImpl;
import com.sg.dvdlibrary.dto.Dvd;
import com.sg.dvdlibrary.view.DvdLibraryView;
import com.sg.dvdlibrary.ui.UserIo;
import com.sg.dvdlibrary.ui.UserIoImplements;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * This is the controller class which is responsbile for the logic of the program
 */
public class DvdLibraryController {
    private DvdDao dvdDaoLibrary ;
    private DvdLibraryView dvdView ;
    ArrayList<Dvd> dvdList=new ArrayList<>();
    private UserIo io = new UserIoImplements();

    /**
     * Constructor for the controller.
     * @param dvdDaoLibrary
     * @param dvdView
     */
    public DvdLibraryController(DvdDao dvdDaoLibrary,DvdLibraryView dvdView) {
        this.dvdDaoLibrary = dvdDaoLibrary;
        this.dvdView=dvdView;
    }

    /**
     * This method creates a new dvd and adds it to the array list.
     */
    private void createNewDvd(){
        System.out.println(dvdList.size());
        Dvd newDvd=dvdView.getNewDvdInfo();
        dvdDaoLibrary.addDvd(newDvd.getTitle(),
                newDvd.getDate(), newDvd.getMpaaRating(),
                newDvd.getDirectorsName(), newDvd.getStudio(), newDvd.getUserRating());
        System.out.println(dvdList.size());
        System.out.println(dvdList.toString().toString());


        //System.out.println("hello "+ArrayList.toString(dvdList));



    }

    /**
     * This method is used to remove the dvd from the array list.
     */
    private void removeADvd(){
        String titleOfDvd= dvdView.getDvdTitle();
        for(Dvd dvd : dvdList) {
            //System.out.println(dvd);//Used to print the DVD
            if (titleOfDvd.equalsIgnoreCase(dvd.getTitle())) {
                //System.out.println("One");
                dvdDaoLibrary.removeDvd(dvd);
                io.print("Dvd removed");
                break;
            }
        }

        //dvdDaoLibrary.removeDvd(dvdTileRemove);
        // dvdDaoLibrary.removeDvd(titleOfDvd);
        //System.out.println(dvdList.toString().toString());

    }

    /**
     * This method gets the dvd using the title
     */
    private void getDvdUsingTitle(){
        String titleOfDvd= dvdView.getDvdTitle();
        dvdDaoLibrary.getDvdByTitle(titleOfDvd);
        io.print(dvdDaoLibrary.getDvdByTitle(titleOfDvd).toString());
    }

    /**private void displayInformation(){
        String titleOfDvd= dvdView.getDvdTitle();
        dvdDaoLibrary.getDvdByTitle(titleOfDvd);
        System.out.println(dvdDaoLibrary.getDvdByTitle(titleOfDvd).toString());
    }**/

    /**
     * This method is used to edit the title of the dvd.
     *
     */
    private void editInformationForDvd() {
        String titleOfDvd = dvdView.getDvdTitle();
        for (Dvd dvd : dvdList) {
            //System.out.println(dvd);
            if (titleOfDvd.equalsIgnoreCase(dvd.getTitle())) {
                io.print("title found");
                String editInout = dvdView.getEditPrompt();
                if (editInout.equalsIgnoreCase("title")) {
                    String editTitle = dvdView.getDvdTitle();
                    dvd.setTitle(editTitle);
                } else if (editInout.equalsIgnoreCase("date")) {
                    String editDate = dvdView.getEditDate();
                    dvd.setDate(editDate);
                } else if (editInout.equalsIgnoreCase("mpaa rating")) {
                    String editMpaaRating = dvdView.getEditMpaaRating();
                    dvd.setMpaaRating(editMpaaRating);
                } else if ((editInout.equalsIgnoreCase("directors name"))) {
                    String editDirectorsName = dvdView.getEditdirectorsName();
                    dvd.setDirectorsName(editDirectorsName);
                }else if ((editInout.equalsIgnoreCase("studio"))){
                    String editStudio=dvdView.getEditstudio();
                    dvd.setStudio(editStudio);
                } else if ((editInout.equalsIgnoreCase("userRating"))) {
                    String editUserRating = dvdView.getEditUserrating();
                    dvd.setUserRating(editUserRating);
                }
            }
        }
    }

    /**
     * This method retrives all the dvds.
     */
    private void getAllDvd(){
        for(int i=0;i<dvdList.size();i++){
            io.print(dvdList.get(i).toString());

        }
        //dvdList= dvdDaoLibrary.getAllDvds();
        //System.out.println(dvdList.size());
        //return dvdList;
        //System.out.println(dvdList.toString());
        //return dvdList;
    }


    //private void writeToFile(){

   // }

    /**
     * This method runs the program.
     */
    public void run() {
        dvdList = dvdDaoLibrary.readFile("src/dvd.txt");
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            while (keepGoing) {

                menuSelection = dvdView.printMenuAndGetSelection();

                switch (menuSelection) {
                    case 1:
                        createNewDvd();
                        break;
                    case 2:
                        getAllDvd();//Need to print a list
                        break;
                    case 3:
                        editInformationForDvd();
                        break;
                    case 4:
                        removeADvd();
                        break;
                    case 5:
                        getDvdUsingTitle();
                        break;
                    case 6:
                        getDvdUsingTitle();
                        break;
                    case 7:
                        dvdDaoLibrary.writeToFile();
                        keepGoing = false;
                        break;
                    default:
                        io.print("UNKNOWN COMMAND");
                }


            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
