package com.company;
/*Feu un programa que llegeixi un enter que representa una temperatura en graus Celsius, i que digui si fa calor,
si fa fred, o si s’està bé. Suposeu que fa calor si la temperatura és més alta que 30 graus, que fa fred si és més baixa que 10 graus,
 i que s’està bé en altre cas. A més, cal avisar si amb temperatura donada l’aigua bulliria, o si es gelaria.
 Suposeu que l’aigua bull amb 100 o més graus, i que es gela amb 0 o menys graus.

Entrada
L’entrada consisteix en un enter.

Sortida
Cal escriure una línia dient si fa calor, si fa fred, o si s’està bé.
Adicionalment, potser cal escriure una altra línia si l’aigua bulliria o si es gelaria..*/

/*
16 it's ok
-5 it's cold
water would freeze
99 it's hot
100 it's hot
water would boil
*/

public class Temperature {
    public static void main(String[] args) {
        int temperature = 30;
    if(temperature < -5) {
        System.out.println("t's cold water would freeze");
    }else if(temperature < 16){
        System.out.println("it's ok");
    }else if( temperature == 99) {
        System.out.println("it's hot");
    }else if(temperature >= 100) {
        System.out.println("it's hot water would boil");
    }

    }
}

