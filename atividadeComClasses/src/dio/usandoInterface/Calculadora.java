package dio.usandoInterface;

public class Calculadora implements OperacoesMatematicas{

    public void soma(double operando1, double operando2){
        System.out.println(operando1 + " + " + operando2 + " = " + (operando1+operando2));
    }
    public void subtracao(double operando1, double operando2){
        System.out.println(operando1 + " - " + operando2 + " = " + (operando1-operando2));
    }
    public void multiplicacao(double operando1, double operando2){
        System.out.println(operando1 + " * " + operando2 + " = " + (operando1*operando2));
    }
    public void divisao(double operando1, double operando2){
        System.out.println(operando1 + " / " + operando2 + " = " + (operando1/operando2));
    }
}
