package app.models;

import app.EnumHelper.Day;
import app.service.AdviseForDay;

public class DayAdviseInitialization implements AdviseForDay {
    @Override
    public void advise(Day day) {
        switch (day){
            case MONDAY:
                System.out.println("A start has been made");
                break;
            case TUESDAY:
                System.out.println("Stay focused!");
                break;
            case WEDNESDAY:
                System.out.println("Be productive!");
                break;
            case THURSDAY:
                System.out.println("Be positive!");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
                System.out.println("You should take a walk in park");
                break;
            case SUNDAY:
                System.out.println("Don't forget your family,make visit to your parent's");
                break;
        }

    }
}
