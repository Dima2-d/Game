package com.company;

public class Mag extends Personasz{
    int damage;
    public Mag(int damage) {
        this.damage = damage;
        Name="Маг";
    }
    public String FireAction( Personasz[] CPL , Personasz[] WPL)
    {
        int CF;
        int r=1+(int)(Math.random()*2);
        if(r>1)
        {
            r=(int)(Math.random()* CPL.length);
            CPL[r].setHard(true);

            Log=Name+" усиливает персонаж "+CPL[r].Name;
        }
        else
        {
            CF=damage;
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

        }



        return Log;
    }
}
