package com.company;


public abstract class Personasz {
    int XP=100;
    boolean Hard=false;
    boolean Low=false;
    String Log="";

    String Name;

    public void XPmin(int mXP) {
        XP=XP-mXP;

    }

    public String PName()
    {
        return Name;
    }

    public boolean isLow() {
        return Low;
    }
    public boolean isHard(){
        return  Hard;
    }
    public void setLow(boolean L)
    {
        Low=L;
    }
    public void setHard(boolean H)
    {
        Hard=H;
    }

    public abstract String FireAction(Personasz[] CPL, Personasz[] WPL);

}
