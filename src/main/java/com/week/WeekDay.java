package com.week;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public interface WeekDay {

      public default String getWeekDayName(){
          return null;
      };
}
