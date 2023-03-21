
public class AgendarHorario implements Agendamento {

    @Override
    public Suite createSuite() {
        return new SuiteBasica();
    }

    @Override
    public HistoricoAgendamento createHistorico() {
        return new HistoricoHorario();
    }
}
