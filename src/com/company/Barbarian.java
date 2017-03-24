package com.company;


public class Barbarian extends Personasz{
    int damage;
    public Barbarian(int damage, String NewName) {
        this.damage = damage;
        this.Name=NewName;
    }
    public String FireAction( Personasz[] CPL , Personasz[] WPL)
    {
        int CF;
        CF=damage;

        if(Hard)
        {
            CF=CF*2;
        }
        if(Low)
        {
            CF=CF/2;
        }

        int r=(int)(Math.random()* WPL.length);
        WPL[r].XPmin(CF);

        Log=Name+" наносит "+CF+" урона персонажу "+WPL[r].Name;


        return Log;
    }
}
