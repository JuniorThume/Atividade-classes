package dio.polimorfismoSobrescrita;

public class ClasseFIlha2 extends ClasseMae{

    @Override
    void metodo1(){
        System.out.println("Metodo 1 oriundo da classe filha 2");
    }

    @Override
    void metodo2(){
        System.out.println("Metodo 2 oriundo da classe filha 2");
    }
}
