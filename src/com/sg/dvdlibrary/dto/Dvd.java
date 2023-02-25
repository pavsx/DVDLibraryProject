package com.sg.dvdlibrary.dto;

/**
 * This class consists of the properties for a Dvd.
 * It consists of getters and setters to run the program.
 */
public class Dvd {
    private String title;
    private String date;
    private String mpaaRating;
    private String directorsName;
    private String studio;
    private String userRating;

    /**
     * Constructor for the DVD class
     * @param title
     * @param date
     * @param mpaaRating
     * @param directorsName
     * @param studio
     * @param userRating
     */
    public Dvd(String title, String date, String mpaaRating, String directorsName, String studio, String userRating) {
        this.title = title;
        this.date = date;
        this.mpaaRating = mpaaRating;
        this.directorsName = directorsName;
        this.studio = studio;
        this.userRating = userRating;
    }

    /**
     * This method gets the title
     * @return title
     */
    public String getTitle() {
        return title;
    }
    /**
     * This method sets the title
     * @param title
     *
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method gets the date
     * @return date
     */

    public String getDate() {
        return date;
    }

    /**
     * This method set  the date
     * @param  date
     */

    public void setDate(String date) {
        this.date = date;
    }

    /**
     * This method gets the mpaaRating
     * @return mpaaRating
     */
    public String getMpaaRating() {
        return mpaaRating;
    }

    /**
     * This method sets the mpaaRating
     * @param mpaaRating
     */
    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    /**
     * This method gets the directorsName
     * @return  directorsName
     */
    public String getDirectorsName() {
        return directorsName;
    }

    /**
     * This method sets the directorsName
     * @param directorsName
     */
    public void setDirectorsName(String directorsName) {
        this.directorsName = directorsName;
    }

    /**
     * This method gets the studio
     * @return studio
     */
    public String getStudio() {
        return studio;
    }

    /**
     * This method sets the studio
     * @param studio
     */
    public void setStudio(String studio) {
        this.studio = studio;
    }

    /**
     * This method gets the user rating
     * @return user rating
     */
    public String getUserRating() {
        return userRating;
    }

    /**
     * This method sets the user rating.
     * @param userRating
     */
    public void setUserRating(String userRating) {
        this.userRating = userRating;
    }

    public String toString(){
        return title+","+date+","+mpaaRating+","+directorsName+","+studio+","+userRating;
    }


}