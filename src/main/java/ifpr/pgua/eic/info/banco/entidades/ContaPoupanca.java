package ifpr.pgua.eic.info.banco.entidades;

import javax.sound.sampled.SourceDataLine;

public class ContaPoupanca extends Conta {
    

    public ContaPoupanca(String agencia, String numero, Pessoa cliente, double taxaRendimento) {
        super(agencia, numero, cliente);
        this.taxaRendimento = taxaRendimento;
        this.rendimento = 0.0;
    }


    private double taxaRendimento;
    public double getTaxaRendimento() {
        return taxaRendimento;
    }
    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
    private double rendimento;
    public double getRendimento() {
        return rendimento;
    }

    @Override
    public String gerarExtrato() {
        String texto = "";

        texto = super.gerarExtrato();

        texto = texto + "Taxa de rendimento:" +taxaRendimento;
        texto = texto + "Rendimento" +rendimento;

        return texto;
    }

    
    
}
