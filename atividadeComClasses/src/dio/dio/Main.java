package dio.dio;

public class Main {
    public static void main(String[] args) {


        Carro carro1 = new Carro();
        carro1.setCor("Verde");
        carro1.setModelo("Sport");
        carro1.setCapacidadeTanque(56);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(2.45));


        Carro carro2 = new Carro("laranja","Sport",78);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(3.75));
    }
}
