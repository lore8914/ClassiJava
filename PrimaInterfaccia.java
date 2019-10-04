package com.company;

public interface PrimaInterfaccia {//non si può istanziare, come la classe astratta deve essere implementata.

    default void eseguiAssolo(){
        System.out.println("DO RE MI FA SOL LA SI DO");

    }
    public String primario = "Castrizzi";

}
