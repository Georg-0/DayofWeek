package com.week;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Monday implements WeekDay{

    @Override
    public String getWeekDayName() {
        return "Monday";
    }

}
