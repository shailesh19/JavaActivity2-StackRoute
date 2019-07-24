package com.java.stackroute;

import java.util.Scanner;

public class LightBulb
{
    private boolean bulbStateOn;
    //constructor
    LightBulb()
    {
        //set default values
        bulbStateOn = false;
    }
    //getters setters
    public void setBulbStateOn(boolean s)
    {
        bulbStateOn = s;
    }

    public boolean getBulbStateOn()
    {
        return bulbStateOn;
    }
    public void displayAttribute()
    {

        if(getBulbStateOn())
        {
            System.out.println("The bulb is on");
        }
        else
        {
            System.out.println("The bulb is off");
        }
    }


    public static void main(String[] args)
    {

        LightBulb lightBulb = new LightBulb();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the State you want in true/false: ");
        boolean input = sc.nextBoolean();
        lightBulb.setBulbStateOn(input);

        if(lightBulb.getBulbStateOn())
        {
            System.out.println("The bulb turned on as expected");
        }
        else
        {
            System.out.println("The bulb is off, maybe its burned out?");
        }

        lightBulb.displayAttribute();
    }

}
