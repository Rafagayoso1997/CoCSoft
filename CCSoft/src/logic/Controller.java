package logic;

import java.util.ArrayList;

public class Controller {

    private ArrayList<Date> warDates;

    public Controller(ArrayList<Date> warDates) {
        this.warDates = warDates;
    }

    public ArrayList<Date> getWarDates() {
        return warDates;
    }

    public void setWarDates(ArrayList<Date> warDates) {
        this.warDates = warDates;
    }



}
