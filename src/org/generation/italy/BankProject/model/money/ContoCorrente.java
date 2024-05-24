package org.generation.italy.BankProject.model.money;

 public class ContoCorrente {
    public int matricola;
    public double saldo;

    public ContoCorrente(int matricola, double saldo) {
        this.matricola = matricola;
        this.saldo = saldo;
    }
    
    public void deposita(double ricarica) {
        saldo = saldo + ricarica;
        System.out.println("Operazione avvenuta con successo, il tuo saldo attuale è " + saldo);
    }

    public void ritira(double contante) {
        saldo = saldo - contante;
        if(saldo > -1000) {
            System.out.println("Operazione avvenuta con successo, il tuo saldo attuale è " + saldo);
        } else {
            System.out.println("La cifra che vuoi ritirare è troppo alta");
        }
    }

    public void stampaSaldo() {
        System.out.println("Il tuo saldo attuale è " + saldo);
    }

    public void bonifico(ContoCorrente c2, double soldi) {
        saldo = saldo - soldi;
        c2.saldo = saldo + soldi;
        System.out.println("Bonifico andato a buon fine, ti rimangono " + saldo);
    }
}
