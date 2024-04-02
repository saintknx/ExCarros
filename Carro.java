public class Carro {
    private String modelo;
    private int ano;

    //Construtor padrão
    public Carro(){
    }

    //Construtor determinado
    public Carro(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
        
    }
    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void acelerar(double velocidade){
        System.out.printf("\nA velocidade agora é %s", velocidade);
    }
    
    public int trocarMarcha(int marcha){
        if (marcha >= 1 && marcha <= 5){
            System.out.printf("\nNova marcha %d", marcha);
        } else {
            System.out.println("\nSCRRRRRRRRRRRRRRRR!");
        }
        return 1+marcha%5;
    }
}