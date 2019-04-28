package com.example.demo.services;

import com.example.demo.enums.Calculations;
import org.springframework.stereotype.Service;


import static com.example.demo.enums.Calculations.INVALID;

@Service
public class CalculatorService {
    Calculations calculations;
    public String calculate(String calcType,String x, String y){
        try {
            calculations = Calculations.valueOf(calcType);
        }
        catch (IllegalArgumentException e)
        {
            calculations = INVALID;
        }

        String val="";
        switch (calculations){
            case ADD: val = "" + (Double.parseDouble(x)+ Double.parseDouble(y));
                break;
            case DIVIDE: val = "" + (Double.parseDouble(x)- Double.parseDouble(y));
                 break;
            case MULTIPLY:val = "" + (Double.parseDouble(x)* Double.parseDouble(y));
                break;
            case SUBTRACT:val = "" + (Double.parseDouble(x)/ Double.parseDouble(y));
                break;
            default: val = "INVALID calculation type, please use the following ADD, DIVIDE, SUBTRACT, MULTIPLY";


        }
        val = "RESULT IS " + val;

        return val;
    }

}
