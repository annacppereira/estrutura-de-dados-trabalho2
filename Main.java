package com.alexandre.aulased3ads20262;

import com.alexandre.aulased3ads20262.lib.Deque;
import com.alexandre.aulased3ads20262.lib.LinkedList;
import com.alexandre.aulased3ads20262.lib.Queue;
import com.alexandre.aulased3ads20262.lib.Stack;

import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {

        // --- Exercicio 1 ---
        System.out.println("--- Exercicio 1 ---");
        Queue<String> fila = new Queue<>();
        fila.enqueue("Cliente 1");
        fila.enqueue("Cliente 2");
        fila.enqueue("Cliente 3");
        fila.dequeue();
        System.out.println("Fila atual: " + fila.print());
        System.out.println("Total de operacoes: " + fila.getOperationCount());

        // --- Exercicio 2 ---
        System.out.println("\n--- Exercicio 2 ---");
        Stack<String> historicoWeb = new Stack<>();
        historicoWeb.push("site1.com");
        historicoWeb.push("site2.com");
        historicoWeb.push("site3.com");
        historicoWeb.pop();
        historicoWeb.pop();
        System.out.println("Pagina atual: " + historicoWeb.peek());
        System.out.println("Paginas removidas da pilha: " + historicoWeb.getHistory());

        // --- Exercicio 3 ---
        System.out.println("\n--- Exercicio 3 ---");
        Deque<Integer> dequeLimitado = new Deque<>(5);
        for (int i = 1; i <= 6; i++) {
            dequeLimitado.insertBack(i);
        }
        System.out.println("Deque: " + dequeLimitado.print());

        // --- Exercicio 4 ---
        System.out.println("\n--- Exercicio 4 ---");
        Stack<String> undo = new Stack<>(5);
        undo.push("Texto 1");
        undo.push("Texto 2");
        undo.push("Texto 3");
        undo.push("Texto 4");
        undo.push("Texto 5");
        undo.push("Texto 6"); // deve dar erro
        System.out.println("Pilha de desfazer: " + undo.print());

        // --- Exercicio 5 ---
        System.out.println("\n--- Exercicio 5 ---");
        Deque<String> carrinho = new Deque<>();
        carrinho.insertBack("Item A");
        carrinho.insertBack("Item B");
        carrinho.insertBack("Item A"); // duplicado, deve dar erro
        System.out.println("Carrinho: " + carrinho.print());

        // --- Exercicio 6 ---
        System.out.println("\n--- Exercicio 6 ---");
        LinkedList<String> listaEnc = new LinkedList<>();
        listaEnc.insertTail("No 1");
        listaEnc.insertTail("No 2");
        listaEnc.insertTail("No 3");
        listaEnc.remove(1);
        System.out.println("Lista final: " + listaEnc.print());
        System.out.println("Historico de remocao: " + listaEnc.getHistory());

        // --- Exercicio 7 ---
        System.out.println("\n--- Exercicio 7 ---");
        LinkedList<Integer> listaInverter = new LinkedList<>();
        listaInverter.insertTail(1);
        listaInverter.insertTail(2);
        listaInverter.insertTail(3);
        System.out.println("Antes de inverter: " + listaInverter.print());
        listaInverter.reverse();
        System.out.println("Depois de inverter: " + listaInverter.print());

        // --- Exercicio 8 ---
        System.out.println("\n--- Exercicio 8 ---");
        LinkedList<String> listaContar = new LinkedList<>();
        listaContar.insertTail("A");
        listaContar.insertTail("B");
        listaContar.insertTail("A");
        listaContar.insertTail("A");
        System.out.println("Ocorrencias de A: " + listaContar.countOccurrences("A"));
        System.out.println("Ocorrencias de B: " + listaContar.countOccurrences("B"));

        // --- Exercicio 9 ---
        System.out.println("\n--- Exercicio 9 ---");
        LinkedList<String> listaRemoverVarios = new LinkedList<>();
        listaRemoverVarios.insertTail("X");
        listaRemoverVarios.insertTail("Y");
        listaRemoverVarios.insertTail("X");
        listaRemoverVarios.insertTail("Z");
        listaRemoverVarios.insertTail("X");
        System.out.println("Antes de removeAll: " + listaRemoverVarios.print());
        listaRemoverVarios.removeAll("X");
        System.out.println("Apos removeAll: " + listaRemoverVarios.print());
        listaRemoverVarios.insertTail("W"); // testa se o tail ficou certo
        System.out.println("Apos inserir W: " + listaRemoverVarios.print());

        // --- Exercicio 10 ---
        System.out.println("\n--- Exercicio 10 ---");
        LinkedList<String> listaConv = new LinkedList<>();
        listaConv.insertTail("Teste 1");
        listaConv.insertTail("Teste 2");
        ArrayList<String> arrayResultado = listaConv.toArray();
        System.out.println("ArrayList gerado: " + arrayResultado);
    }
}