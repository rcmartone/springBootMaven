package src.edu.rafael.Curso.primeiros_passos_spring;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public int somar(int num1, int num2){
        return num1+num2;
    }
}
