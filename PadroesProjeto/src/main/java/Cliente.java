
public class Cliente {

    private Suite suite;
    private HistoricoAgendamento historico;

    public Cliente (Agendamento Agendamento) {
        this.suite = Agendamento.createSuite();
        this.historico = Agendamento.createHistorico();
    }

    public String emitirSuite() { return this.suite.emitir();
    }
    public String emitirHistorico() {
        return this.historico.emitir();
    }
}

