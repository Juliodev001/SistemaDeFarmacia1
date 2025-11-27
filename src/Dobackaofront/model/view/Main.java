package Dobackaofront.model.view;

import Dobackaofront.model.Model.Item;
import Dobackaofront.model.controller.BancoDeDados;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Sistema de Farmacia");





        BancoDeDados banco = new BancoDeDados();
        ArrayList<Item>itens = banco.Ler();

        banco.editar(1,itens);







        }




    }
