package entities;

public class Agendamento {

    private Cliente cliente;
    private String data;
    private String horario;

    public Agendamento(Cliente cliente, String data, String horario) {
        this.cliente = cliente;
        this.data = data;
        this.horario = horario;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

    @Override
    public String toString() {
        return cliente.getNome() +
                " - " +
                cliente.getTelefone() +
                " - Data: " + data +
                " - Horário: " + horario;
    }

}
