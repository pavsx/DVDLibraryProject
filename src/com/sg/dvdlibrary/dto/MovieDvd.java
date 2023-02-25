package com.sg.dvdlibrary.dto;

/**
 * Example class of inheritance which inherits the Dvd class.
 */
public class MovieDvd extends Dvd {
    private String genre;

    /**
     * The constructor for MovieDvd
     * @param title
     * @param date
     * @param mpaaRating
     * @param directorsName
     * @param studio
     * @param userRating
     */
    public MovieDvd(String title, String date, String mpaaRating, String directorsName, String studio, String userRating) {
        super(title, date, mpaaRating, directorsName, studio, userRating);
    }

    /**
     * This method sets the genre
     * @param genre
     */
    public void setGenre(String genre){
        this.genre=genre;
    }

    /**
     * This method gets the genre
     * @return genre
     */
    public String getGenre(){
        return genre;
    }
}
