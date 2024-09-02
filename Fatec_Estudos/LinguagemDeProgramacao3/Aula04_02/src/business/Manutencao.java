package business;

public class Manutencao
{
    private String dataUltimaManutencao, tipoServico;

    public Manutencao(String dataUltimaManutencao, String tipoServico)
    {
        this.dataUltimaManutencao = dataUltimaManutencao;
        this.tipoServico = tipoServico;
    }

    @Override
    public String toString()
    {
        return String.format("Manutenção: [Data da última manutenção: %s, Tipo de serviço %s]",dataUltimaManutencao, tipoServico);
    }
}
