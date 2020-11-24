package Controller;

import Model.IEstacaoMeteorologica;
import Model.Observer;
import java.util.ArrayList;
import java.util.List;

public class EstacaoMeteorologica implements IEstacaoMeteorologica {

    private List<Observer> observers;

    public double temperatura;
    public double pressao;
    public double umidade;

    public void atualizarInformacoes(double temperatura, double pressao, double umidade) {
        this.temperatura = temperatura;
        this.pressao = pressao;
        this.umidade = umidade;
        notificacao();
    }

    public EstacaoMeteorologica() {
        this.observers = new ArrayList<>();

    }

    @Override
    public void adicionar(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remover(Observer observer) {
        int index = observers.indexOf(observer);
        if (index > -1) {

            System.out.println("");
            System.out.println("Saiu: " + observer.getClass().getName());
            System.out.println("");

            observers.remove(observer);
        }
    }

    @Override
    public void notificacao() {

        System.out.println("");
        System.out.println("Nova Atualização");
        System.out.println("");
        for (Observer o : observers) {
            o.update();
        }
    }
}
