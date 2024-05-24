package org.generation.italy.BankProject.model.people;

import java.time.LocalDate;
import org.generation.italy.BankProject.model.money.ContoCorrente;

public class Cliente {
    public String nome;
    public String cognome;
    public LocalDate dataNascita;
    public boolean Maschio;
    public String status;
    public ContoCorrente[] contiCliente;

    public Cliente(String nome, String cognome, LocalDate dataNascita, boolean Maschio, String status) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.Maschio = Maschio;
        this.status = status;
        if(status.equals("base")) {
            contiCliente = new ContoCorrente[3];
        } else if(status.equals("premium")) {
            contiCliente = new ContoCorrente[5];
        } else {
            contiCliente = new ContoCorrente[10];
        }
    }

    public void aggiungiConto(ContoCorrente conto) {
        for(int i = 0; i < contiCliente.length; i++) {
            if(contiCliente[i] == null) {
                contiCliente[i] = conto;
                return;
            }
        } 
        System.out.println("Hai raggiunto il massimo di conti correnti");
    }
}
