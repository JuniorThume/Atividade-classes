package src.polimorfismoSobrescrita;

public class Main {
    public static void main(String[] args) {


        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(),new ClasseFIlha2(), new ClasseMae()};

        for(ClasseMae classe : classes){
            classe.metodo1();
        }
        System.out.println("");

        for(ClasseMae classe1 : classes){
            classe1.metodo2();
        }

        System.out.println("");
    }
}
