package com.week;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Saturday implements WeekDay{

    @Override
    public String getWeekDayName() {
        return "Saturday";
    }

}
