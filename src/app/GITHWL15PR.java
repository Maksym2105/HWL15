package app;

import app.EnumHelper.Day;
import app.models.DayAdviseInitialization;
import app.service.AdviseForDay;

public class GITHWL15PR {
    public static void main(String[] args) {

        AdviseForDay adviseForDay = new DayAdviseInitialization();

        for (Day day : Day.values()) {
            System.out.print(day + ": ");
            adviseForDay.advise(day);
        }

        }
    }