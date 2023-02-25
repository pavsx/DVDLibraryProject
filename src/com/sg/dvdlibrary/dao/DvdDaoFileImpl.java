package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.Dvd;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class implements the DvdDao interface.
 *
 */
public class DvdDaoFileImpl implements DvdDao {
        private String fileName="src/dvd.txt";
        private ArrayList<Dvd> allDvds = new ArrayList();

    /**
     * constuctor for the dvd dao file implementation.
     * @param fileName
     */
    public DvdDaoFileImpl(String fileName)
    {
        this.fileName = fileName;
    }

    /**
     * This method reads the file and uses a while loop and
     * if statements to read the file and save the contents
     * to an arraylist of Dvds
     * @return arraylist.
     */
    @Override
    public ArrayList<Dvd> readFile(String fileName) {
        File dvdFiles=new File(fileName);
        FileReader fileReader;
        String[] line;
        try{
            fileReader=new FileReader(dvdFiles);
            BufferedReader fileBufferedReader=new BufferedReader(fileReader);
            String lineFromFile=" ";
            while(lineFromFile != null){
                lineFromFile=fileBufferedReader.readLine();
                if (lineFromFile != null){
                    line=lineFromFile.split(",");
                    System.out.println(Arrays.toString(line));
                    //Data Marshalling
                    String title=line[0];
                    String date=line[1];
                    String mpaaRating=line[2];
                    String directorsName=line[3];
                    String studio=line[4];
                    String userRating=line[5];
                    Dvd tempDvd=new Dvd(title,date,mpaaRating,directorsName,studio,userRating);
                    this.allDvds.add(tempDvd);


                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //return null;
        return allDvds;
    }

    /**
     * This method is responsible for adding a new Dvd to the arraylist.
     * @param title
     * @param date
     * @param mpaaRating
     * @param directorsName
     * @param studio
     * @param userRating
     */

    //This is not a DVD return type change to void
    @Override
    public void addDvd(String title, String date, String mpaaRating, String directorsName, String studio, String userRating) {
        Dvd newDvd=new Dvd(title,date,mpaaRating,directorsName,studio,userRating);
        allDvds.add(newDvd);
    }

    /**
     * This method is responsible for getting the Dvd by Title
     * It uses a for each loop to iterate through the array list.
     * An if statement is then used to retrieve the dvd.
     * @param title
     * @return dvd
     */
    //@Override
    public Dvd getDvdByTitle(String title) {

        for (Dvd dvd : allDvds) {
            //System.out.println(dvd);
            if (title.equalsIgnoreCase(dvd.getTitle())) {
                System.out.println("Dvd Found");

                return dvd;
            }

        }
       /** for (Dvd dvd : allDvds) {
            System.out.println(dvd);
            if (title.equalsIgnoreCase(dvd.getTitle())) {
                System.out.println("Dvd Found");

                return dvd;
            }

        } **/
        //System.out.println("Dvd not found");
        return null;
    }



    /**
     * This methods removes a dvd from the arraylist.
     * @param dvd
     *
     */
    @Override
    public void removeDvd(Dvd dvd) {
        allDvds.remove(dvd);
        //return removedDvdObject;
        //return null;
        //return null;
       // return null;
    }


    /**
     * This method returns an arraylist of all the dvds
     * This method is not used in the code but was used for testing during
     * implementation.
     * @return arraylist of dvds
     */
    @Override
    public ArrayList<Dvd> getAllDvds() {
        return allDvds;
    }

    /**
     * This method writes to the file.
     * It writes the contents of the arraylist to a file.
     *
     */
    @Override
    public void writeToFile() {
        File newFile=new File(fileName);
        try {
            FileWriter fw = new FileWriter(newFile);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < allDvds.size();i++)
            {

                bw.write(allDvds.get(i).toString()+"\n");
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } // End of writeToFile
        //return null;
    }



