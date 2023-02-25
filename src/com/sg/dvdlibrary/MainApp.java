package com.sg.dvdlibrary;

import com.sg.dvdlibrary.controller.DvdLibraryController;
import com.sg.dvdlibrary.dao.DvdDao;
import com.sg.dvdlibrary.dao.DvdDaoFileImpl;
import com.sg.dvdlibrary.ui.UserIo;
import com.sg.dvdlibrary.ui.UserIoImplements;
import com.sg.dvdlibrary.view.DvdLibraryView;

/**
 * This method is used to run the program
 */
public class MainApp {

    DvdLibraryView dvdView ;
    public static void main(String[] args) {
        String fileName="src/dvd.txt";
        UserIo myIo = new UserIoImplements();
        DvdDao mydvdDaoLibrary=new DvdDaoFileImpl(fileName);
        DvdLibraryView mydvdLibraryView=new DvdLibraryView(myIo);
        DvdLibraryController controller = new DvdLibraryController(mydvdDaoLibrary,mydvdLibraryView);
        controller.run();
    }
}
