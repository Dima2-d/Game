package com.company;

public class Shaman extends Personasz{
    public Shaman() {
        Name="Шаман";
    }
    public String FireAction( Personasz[] CPL , Personasz[] WPL)
    {
        int r=1+(int)(Math.random()*2);
        if(r>1)
        {
            r=(int)(Math.random()* CPL.length);
            CPL[r].setHard(true);

            Log=Name+" усиливает персонаж "+CPL[r].Name;
        }
        else
        {
            r=(int)(Math.random()* WPL.length);
            WPL[r].setHard(false);

            Log=Name+" снимает усиление с персонажа "+WPL[r].Name;

        }



        return Log;
    }
}
