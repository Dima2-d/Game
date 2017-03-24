package com.company;

public class Arrow extends Personasz{
    int fire, damage;
    public Arrow(int fire, int damage, String NewName) {
        this.fire = fire;
        this.damage = damage;
        this.Name=NewName;
    };
    public String FireAction( Personasz[] CPL , Personasz[] WPL)
    {
        int CF;
        int r=1+(int)(Math.random()*2);
        if(r>1)
        {
            CF=fire;
        }
        else
        {
            CF=damage;
        }

        if(Hard)
        {
            CF=CF*2;
        }
        if(Low)
        {
            CF=CF/2;
        }

        r=(int)(Math.random()* WPL.length);
        WPL[r].XPmin(CF);

        Log=Name+" наносит "+CF+" урона персонажу "+WPL[r].Name;


        return Log;
    }
}
