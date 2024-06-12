package Main;

import DataStructure.Queue;
import DataStructure.Stack;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Ex. Sistema de atendimento ao cliente. Crie um programa que simule
        // a fila de atendimento, onde os clientes entram na fila e são atendidos um por um.

        int n = 5;
        var random  = new Random();
        int cliente = random.nextInt(101);
        Queue queue = new Queue(cliente);
        // Simula a chegada dos clientes
        System.out.println("Chegou o cliente: " + cliente);
        for(int i = 2; i <= n; i++){
            cliente = random.nextInt(101);
            System.out.println("Chegou o cliente: " + cliente);
            queue.enqueue(cliente);
        }
        // Atendimento dos clientes
        var node = queue.dequeue();
        while (node != null) {
            System.out.println("Atendido o cliente: " + node.getValue());
            node = queue.dequeue();
        }
        // Ex. Dado um conjunto de numeros, inverter usando uma pilha!
//                int [] numeros = {5, 4, 3, 2, 1};
//                inverter(numeros);
//    }
//                private static void inverter (final int[] numeros){
//                    Stack stack = new Stack(numeros[0]);
//                        for (int i = 1; i < numeros.length; i++){
//                        stack.push(numeros[i]);
//                        }
//                var node = stack.pop();
//                    while(node != null) {
//                    System.out.println(node.getValue());
//                    node = stack.pop();
//                    }
    }

}