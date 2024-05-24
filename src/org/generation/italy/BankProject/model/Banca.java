package org.generation.italy.BankProject.model;

import org.generation.italy.BankProject.model.people.Cliente;

//metodo che ritorna il piu
// povero, metodo aggiungi cliente alla lista di clienti.

public class Banca {
    public String nome;
    public Cliente[] listaClienti = new Cliente[10];

    public Banca(String nome) {
        this.nome = nome;
    }

    public void sommaSaldi() {
        double somma = 0;
        for(int i = 0; i < listaClienti.length; i++) {
            if(listaClienti[i] != null) {
                for(int j = 0; j < listaClienti[i].contiCliente.length; j++) {
                    if(listaClienti[i].contiCliente[j] != null)
                        somma = somma + listaClienti[i].contiCliente[j].saldo;
                }
            }
        }
        System.out.println("L'intero deposito bancario ammonta a " + somma);
    }

    public void sommaSaldiStatus(String statusSomma) {
        double somma = 0;
        for(int i = 0; i < listaClienti.length; i++) {
            if(listaClienti[i] != null && listaClienti[i].status.equals(statusSomma)) {
                for(int j = 0; j < listaClienti[i].contiCliente.length; j++) {
                    if(listaClienti[i].contiCliente[j] != null) {
                        somma = somma + listaClienti[i].contiCliente[j].saldo;
                    }
                }     
            }
        }
        System.out.println("Il deposito bancario dei clienti " + statusSomma + " ammonta a " + somma);
    }

    public void clientePiuRicco() {
        double massimo = -999999999;
        String ricco = "Non ci sono clienti in questa banca";
        for(int i = 0; i < listaClienti.length; i++) {
            double somma = 0;
            if(listaClienti[i] != null) {
                for(int j = 0; j < listaClienti[i].contiCliente.length; j++) {
                    if(listaClienti[i].contiCliente[j] != null) {
                        somma = somma + listaClienti[i].contiCliente[j].saldo;
                }
                    if(somma > massimo) {
                        massimo = somma;
                        ricco = listaClienti[i].nome;
                    }
                }
            }
        }
        System.out.println("Il cliente più ricco è " + ricco);
    }

    public void clientePiuPovero() {
        double minimo = 999999999;
        String povero = "Non ci sono clienti in questa banca";
        for(int i = 0; i < listaClienti.length; i++) {
            double somma = 0;
            if(listaClienti[i] != null) {
                for(int j = 0; j < listaClienti[i].contiCliente.length; j++) {
                    if(listaClienti[i].contiCliente[j] != null) {
                        somma = somma + listaClienti[i].contiCliente[j].saldo;
                }
                    if(somma < minimo) {
                        minimo = somma;
                        povero = listaClienti[i].nome;
                    }
                }
            }
        }
        System.out.println("Il cliente più povero è " + povero);
    }

    public void aggiungiCliente(Cliente cliente) {
        for(int i = 0; i < listaClienti.length; i++) {
            if(listaClienti[i] == null) {
                listaClienti[i] = cliente;
                return;
            }
        }
        System.out.println("La banca ha raggiunto il limite massimo di clienti.");
    }
}
