package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FibCalc {
    private Logger log = LogManager.getLogger();

    public long calc(long i) {
       //через рекурсию
        /*if(i==0 || i==1) {
            return i;
        }
        if(i==-1) {
            return 1;
        }
        if(i<0) {
            int sign = i % 2 == 0 ? -1 : 1;
            return sign * calc(-i);
        } else {
            return calc(i-1) + calc(i-2);
        }*/






        // через цикл
        if (i == 0) return 1;
        else
        if (i == 1) return i;
        else
        if (i < 0) {
            int sign = i % 2 == 0 ? -1 : 1;
            return sign * calc(-i);}

        else {
            long c = 0;
            long d = 1;
            for (int j = 2; j <= i; ++j) {
                long next = c + d;
                c= d;
                d = next;
            }

            return d;
        }
        // if (i < 0 || i > 50) throw new IllegalArgumentException("Мы не считаем значения меньше 0 или больше 50!");

    }
}
