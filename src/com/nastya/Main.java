package com.nastya;

public class Main {

    public static void main ( String[] args ) {
        Workman office[] = new Workman[ 5 ];
        office[ 0 ] = new Workman ("Иванов Иван" , "директор" , "kvhk@mail.ru" , 38 , 3222232 , 25000);
        office[ 1 ] = new Workman ("Павлова Анна" , "балерина" , "нету" , 117 , 117008 , 25000);
        office[ 2 ] = new Workman ("Попов Олег" , "клоун" , "pop_clown@bk.ru" , 98 , 233456 , 35000);
        office[ 3 ] = new Workman ("Краморов Савелий" , "актер" , "kramor@gmail.com" , 75 , 781452 , 45000);
        office[ 4 ] = new Workman ("Березовский Борис" , "главбух" , "somuch$@bereza.com" , 30 , 1000001 , 7770000);

        for (int i = 0; i < office.length; i++) {
                if( office[i].getAge () > 40) {
                    office[ i ].outToConcole ();
                }
        }
    }
}

