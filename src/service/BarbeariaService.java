package service;
import java.util.ArrayList;
import java.util.List;
import entities.Cliente;
import entities.Agendamento;

public class BarbeariaService {

    private List<Agendamento> agendamentos = new ArrayList<>();

    public void agendar (Cliente cliente, String data, String horario) {
        Agendamento agendamento = new Agendamento(cliente, data, horario);
        agendamentos.add(agendamento);
    }

    public void listarAgendamentos(){
        System.out.println("=== Lista de Agendamentos ===");
        for (Agendamento agendamento : agendamentos){
            System.out.println(agendamento);
        }
    }


}
