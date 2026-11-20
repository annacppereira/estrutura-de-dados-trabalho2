/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.aulased3ads20262.lib;

import java.util.ArrayList;

/**
 *
 @author Alexandre (original) / Anna Clara Pereira - 3 ADS Noturno
 */
public class Stack<T> {
    
    private ArrayList<T> data; // Lista interna privada
    private ArrayList<T> historyData;
    private final int limit; // cap max



    public Stack(int limit) {
        this.data = new ArrayList<T>(); // lista vazia
        this.historyData = new ArrayList<T>();//começa a lista do historico
        this.limit = limit;
    }

    //metodo lim padrão 100
    public Stack() {
        this(100);
    }

    
    //método para inserção de dados na pilha
    public void push(T val){
        if(this.data.size() >= this.limit){
            System.out.println("erro: pilha cheia!");
            return;
        }
        this.data.add(val);
    }
    
    //método para remoção de dados na pilha
    public T pop(){
        if(isEmpty()) return null;
        T removed = this.data.remove(this.data.size() - 1);
        this.historyData.add(removed);
        return removed;
    }

    //metodo declarado publico para poder retornar a lista
    public ArrayList<T> getHistory(){
        return this.historyData;
    }


    //método para informar se a pilha está vazia
    public boolean isEmpty(){
        return this.data.isEmpty();
    }
    
    //método para consultar o topo (última posição) da pilha (sem remover)
    public T peek(){
        if(isEmpty()) return null;
        return this.data.get(this.data.size() - 1);
    }
    
    // método que imprime a pilha para efeitos de depuração
    public String print(){
        return this.data.toString();
    }
}


