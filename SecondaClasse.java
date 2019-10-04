package com.company;


public class SecondaClasse extends PrimaClasse{
    public String h;
    private int a ;
    protected int b;

    public void Somma(){
        a = num; // eredita variabile public dalla Superclasse, e posso portare fuori la variabile a con un metodo public
        b= contante;// eredita variabile protected dalla Supeclasse
        System.out.println(a+b);

    }
    protected void Sommatore(){ // ho ereditato un metodo public e protected dalla superclasse;
         Calcolo();
         Calcolo1();
         int x = 22; //variabile del metodo definita locale che non viene istanziata all'esterno
    }
    private void Prodotto(){// non può essere implementato al di fuori della Classe in cui è dichiarato, non ha utilità
       int u = a*b;
        System.out.println(u);
    }








}
