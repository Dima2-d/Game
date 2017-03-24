package com.company;


public class Nekromant extends Personasz{
    int damage;
    public Nekromant(int damage) {
        this.damage = damage;
        Name="Некромант";
    }

    public String FireAction( Personasz[] CPL , Personasz[] WPL)
    {
        int CF;
        int r=1+(int)(Math.random()*2);
        if(r>1)
        {
            r=(int)(Math.random()* WPL.length);
            WPL[r].setLow(true);

            Log=Name+" ослабляет персонаж "+WPL[r].Name;
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
