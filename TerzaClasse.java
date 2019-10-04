package com.company;



public abstract class TerzaClasse implements PrimaInterfaccia{ // non è possibile istanziarla direttamente ma solo estesa

public int a;// posso ereditarla in tutte le classi
protected int b;//posso ereditarla in tutte le classi
private int d;

public void stampa(){
    System.out.println("Ecco un messaggio stampato");
    eseguiAssolo(); //metodo ereditato dall'interfaccia
    String primario = "Gente";
    System.out.println(primario);
}


//public abstract void Ballo();
// metodo astratto dentro una classe astratta che non posso dichiarare
// perchè è una sottoclasse di una classe non astratta, dovrei dichiarare astratta la Superclasse.




}
