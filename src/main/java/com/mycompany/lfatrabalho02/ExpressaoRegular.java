/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lfatrabalho02;

/**
 *
 * @author mylenaantonelli
 */
public class ExpressaoRegular {
    public String Letra = "[A-Za-z]";
    public String Letras = Letra + "*";
    public String Digito = "[0-9]";
    public String Digitos = Digito + "*";
    public String Brancos = "(\\s)*";
    
    public String TiposPrimitivos = "byte|short|int|long|float|double|boolean|char";
    public String TiposObjetos = "String|Integer|Double|Boolean|Character|Object|List|Map|Set";
    public String Tipos = "\\b(" + TiposPrimitivos + "|" + TiposObjetos + ")\\b";
    
    public String NomeDeFuncaoComeco = "(" + Letra + "|\\_|\\$)";
    public String NomeDeFuncaoFinal = "(" + Letras + "|" + Digitos + "|\\_|\\$)";
    public String NomeDeFuncao = NomeDeFuncaoComeco + NomeDeFuncaoFinal + "*";
    
    public String ParametroUnico = Tipos  + Brancos + NomeDeFuncao;
    public String ListaParametros = ParametroUnico + "(" + Brancos + "," + Brancos + ParametroUnico + ")*";
    public String Parametro = "\\(" + Brancos + "(" + ListaParametros + ")?" + Brancos + "\\)";

    public void confere(String expressao, String sentenca) {
        if (sentenca.matches(expressao)) {
            System.out.println("W: " + sentenca + " - Aceita!");
        } else {
            System.out.println("W: " + sentenca + " - Rejeitada!");
        }
    }

}
