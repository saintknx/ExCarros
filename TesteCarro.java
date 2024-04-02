public class TesteCarro {
    public static void main(String[] args) {
        
        //Instanciar dois carros
        Carro carro95 = new Carro();
        Carro relampago = new Carro();

        //Configurar os atributos
        carro95.setAno(1978);
        carro95.setModelo("Mustang");
        relampago.setAno(2002);
        relampago.setModelo("Uno Mille");

        //Chamar métodos
        carro95.acelerar(130.0);
        carro95.trocarMarcha(5);

        relampago.acelerar(98);
        relampago.trocarMarcha(6);

        //Imprimir atributos
        System.out.println(carro95.getAno());
        System.out.println(carro95.getModelo());

        System.out.println(relampago.getAno());
        System.out.println(relampago.getModelo());

    }
}
