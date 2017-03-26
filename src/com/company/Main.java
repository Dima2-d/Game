package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Main {

    static Personasz[] a;
    static Personasz[] b;
    static String Log;

    public static void main(String[] args) {

        PrintStream out = null;
        try {
            out = new PrintStream(new FileOutputStream("log.txt", true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        out.println("....");

        int r=1+(int)(Math.random()*2);
        if(r>1)
        {
            Log="Выбрали рассу Эльфов для армии А\n";
            a[0]=new Mag(10);
            a[1]=new Arrow(7, 3, "Лучник");
            a[2]=new Arrow(7, 3, "Лучник");
            a[3]=new Arrow(7, 3, "Лучник");
            a[4]=new Barbarian(15, "Воин");
            a[5]=new Barbarian(15, "Воин");
            a[6]=new Barbarian(15, "Воин");
            a[7]=new Barbarian(15, "Воин");
        }
        else
        {
            Log="Выбрали рассу Людей для армии А\n";
            a[0]=new Mag(4);
            a[1]=new Arrow(5, 3, "Арбалетчик");
            a[2]=new Arrow(5, 3, "Арбалетчик");
            a[3]=new Arrow(5, 3, "Арбалетчик");
            a[4]=new Barbarian(18, "Воин");
            a[5]=new Barbarian(18, "Воин");
            a[6]=new Barbarian(18, "Воин");
            a[7]=new Barbarian(18, "Воин");
        }
        System.out.println(Log);
        //запись в файло Log везде де вывод в консоль

        r=1+(int)(Math.random()*2);
        if(r>1)
        {
            Log="Выбрали рассу Орков для армии Б\n";
            b[0]=new Shaman();
            b[1]=new Arrow(3, 2, "Лучник");
            b[2]=new Arrow(3, 2, "Лучник");
            b[3]=new Arrow(3, 2, "Лучник");
            b[4]=new Barbarian(20, "Гоблин");
            b[5]=new Barbarian(20, "Гоблин");
            b[6]=new Barbarian(20, "Гоблин");
            b[7]=new Barbarian(20, "Гоблин");
        }
        else
        {
            Log="Выбрали рассу Некромантов для армии Б\n";
            b[0]=new Nekromant(5);
            b[1]=new Arrow(4, 2, "Охотник");
            b[2]=new Arrow(4, 2, "Охотник");
            b[3]=new Arrow(4, 2, "Охотник");
            b[4]=new Barbarian(18, "Зомби");
            b[5]=new Barbarian(18, "Зомби");
            b[6]=new Barbarian(18, "Зомби");
            b[7]=new Barbarian(18, "Зомби");
        }

        System.out.println(Log);

        r=1+(int)(Math.random()*2);

        int i;

        while (a.length>0 && b.length>0)
        {
            if(r>1)
            {
                for (i=0;i<a.length;i++)
                    if(a[i].isHard())
                    {
                        Log=a[i].FireAction(a,b);
                        System.out.println(Log);
                    }

                for (i=0;i<a.length;i++)
                    if(!a[i].isHard())
                    {
                        Log=a[i].FireAction(a,b);
                        System.out.println(Log);
                    }

                for (i=0;i<b.length;i++)
                    if(b[i].isHard())
                    {
                        Log=b[i].FireAction(b,a);
                        System.out.println(Log);
                    }

                for (i=0;i<b.length;i++)
                    if(!b[i].isHard())
                    {
                        Log=b[i].FireAction(b,a);
                        System.out.println(Log);
                    }

            }
            else
            {
                for (i=0;i<b.length;i++)
                    if(b[i].isHard())
                    {
                        Log=b[i].FireAction(b,a);
                        System.out.println(Log);
                    }

                for (i=0;i<b.length;i++)
                    if(!b[i].isHard())
                    {
                        Log=b[i].FireAction(b,a);
                        System.out.println(Log);
                    }

                for (i=0;i<a.length;i++)
                    if(a[i].isHard())
                    {
                        Log=a[i].FireAction(a,b);
                        System.out.println(Log);
                    }

                for (i=0;i<a.length;i++)
                    if(!a[i].isHard())
                    {
                        Log=a[i].FireAction(a,b);
                        System.out.println(Log);
                    }

            }


        }


        if(a.length>0)
        {
            Log="Банда А победила!";
        }


        if(b.length>0)
        {
            Log="Банда Б победила!";
        }

        System.out.println(Log);


//закрыть файл если надо
    }
}