package service;
import java.util.ArrayList;
import java.util.List;
import entities.Cliente;
import entities.Agendamento;

public class BarbeariaService {

    private List<Agendamento> agendamentos = new ArrayList<>();

    public boolean agendar (Cliente cliente, String data, String horario) {

        for (Agendamento a : agendamentos){
            if (a.getData().equals(data) && a.getHorario().equals(horario)) {
                return false;
            }
        }

        Agendamento agendamento = new Agendamento(cliente, data, horario);
        agendamentos.add(agendamento);
        return true;
    }

    public void listarAgendamentos(){
        System.out.println("==== LISTAR AGENDAMENTOS ====");

        if (agendamentos.isEmpty()){
            System.out.println("Nenhum agendamento foi encontrado!");
        }
        else {
            for (Agendamento agendamento : agendamentos){
                System.out.println(agendamento);
            }
        }

    }

}
