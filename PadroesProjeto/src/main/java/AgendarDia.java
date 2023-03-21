public class AgendarDia implements Agendamento {

    @Override
    public Suite createSuite() {return new SuiteLuxo();
    }

    @Override
    public HistoricoAgendamento createHistorico() {
        return new HistoricoDia();
    }
}