package ifpr.pgua.eic.info.banco.entidades;

public class ContaCorrente extends Conta {

   
    public ContaCorrente(String agencia,String numero,Pessoa cliente, double taxaManutencao, double limite ){

        super(agencia, numero, cliente);
        this.taxaManutencao = taxaManutencao;
        this.limite = limite;

    }

    private double taxaManutencao;
    
    public double getTaxaManuetencao() {
        return taxaManutencao;
    }
    public void setTaxaManuetencao(double taxaManuetencao) {
        this.taxaManutencao = taxaManuetencao;
    }
    private double limite;

    public double getLimite() {
        return limite;
    }
  
    @Override
    public String gerarExtrato() {
        String texto = "";

        texto = super.gerarExtrato();

        texto = texto + "Taxa de manutenção:" +taxaManutencao;
        texto = texto + "limite: " + limite;

        return texto;
    }


    
}
