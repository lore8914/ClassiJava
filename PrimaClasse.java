package com.company;


public class PrimaClasse extends TerzaClasse { //estendo la classe astratta nella Superclasse

public int num = 10;
private int moneta; // non può essere richiamata fuori dalla classe
protected int contante = 33;

public void Calcolo(){
    int a = 3+num;
    System.out.println("La somma è: "+a);
    stampa(); // eredito il metodo non astratto sia pubblico sia protetto dalla classe astratta
    System.out.println(b=22);//eredito una variabile protetta e pubblica dalla classe astratta

}
protected void Calcolo1(){
    int z = 7+8;
    System.out.println("Il risultato è "+z);

}
private void Calcolo2(){
    System.out.println("Numero di ritorno"); //non può essere chiamato fuori dalla classe e non è ereditato
                                            //nella sottoclasse.
}

    }




