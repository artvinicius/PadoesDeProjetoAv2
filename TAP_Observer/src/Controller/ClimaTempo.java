package Controller;

import Model.Observer;

public class ClimaTempo implements Observer {

    public EstacaoMeteorologica estacao;

    public ClimaTempo(EstacaoMeteorologica estacao) {
        this.estacao = estacao;
        this.estacao.adicionar(this);
    }

    @Override
    public void update() {
        System.out.println("ClimaTempo: dados atualizados -> pressão = " + String.format("%.2f", estacao.pressao)
                + " temperatura= " + String.format("%.2f", estacao.temperatura) + " umidade= "
                + String.format("%.2f", estacao.umidade));
    }

    @Override
    public void update(Object obj) {

    }
}
