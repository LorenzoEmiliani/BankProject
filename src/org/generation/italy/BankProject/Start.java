package org.generation.italy.BankProject;

import java.time.LocalDate;
import org.generation.italy.BankProject.model.Banca;
import org.generation.italy.BankProject.model.money.ContoCorrente;
import org.generation.italy.BankProject.model.people.Cliente;

public class Start {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Mario", "Rossi", LocalDate.of(1990, 1, 10), true, "base");
        ContoCorrente conto1 = new ContoCorrente(12345, 10_000);
        cliente1.aggiungiConto(conto1);
        cliente1.contiCliente[0].stampaSaldo();
        cliente1.contiCliente[0].deposita(200);
        cliente1.contiCliente[0].stampaSaldo();
        Banca banca1 = new Banca("Intesa San Paolo");
        banca1.aggiungiCliente(cliente1);
        System.out.println(banca1.listaClienti[0].nome);
        banca1.clientePiuRicco();
        banca1.clientePiuPovero();
        banca1.sommaSaldi();
        banca1.sommaSaldiStatus("base");
        banca1.sommaSaldiStatus("premium");
        


    }
}
