/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lfatrabalho02;

/**
 *
 * @author mylenaantonelli
 */
public class LFATrabalho02 {

    public static void main(String[] args) {
        ExpressaoRegular er = new ExpressaoRegular();
        //Parametro
        System.out.println("Parametro");
        er.confere(er.Parametro, "()");
        er.confere(er.Parametro, "(int a)");
        er.confere(er.Parametro, "(int 15i)");
        
        System.out.println("Assinatura de Função");
        //Assinatura de Função
        er.confere(er.AssinaturaDeFuncoes, "float soma(float a, float b){");
        er.confere(er.AssinaturaDeFuncoes, "void 1funcao01(int a){");
        er.confere(er.AssinaturaDeFuncoes, "void funcao01(){");
        er.confere(er.AssinaturaDeFuncoes, "void funcao01");
        
        
        System.out.println("Condicional if");
        //Condicionais
        //Casos Validos
        er.confere(er.EstruturaIf, "if(variavel)");       // Aceita
        er.confere(er.EstruturaIf, "if(a > b)");          // Aceita
        er.confere(er.EstruturaIf, "if(a == b)");         // Aceita
        er.confere(er.EstruturaIf, "if(true)");           // Aceita
        er.confere(er.EstruturaIf, "if(!flag)");          // Aceita
        er.confere(er.EstruturaIf, "if(a > b && c < d)"); // Aceita
        er.confere(er.EstruturaIf, "if(!(a > b))");       // Aceita
        
        //Casos inválidos
        er.confere(er.EstruturaIf, "if()");               // Rejeita
        er.confere(er.EstruturaIf, "if(a >)");            // Rejeita
        er.confere(er.EstruturaIf, "if(> b)");            // Rejeita
        er.confere(er.EstruturaIf, "if(a &&)");           // Rejeita
        er.confere(er.EstruturaIf, "if(&& b)");           // Rejeita
        er.confere(er.EstruturaIf, "if(>)");              // Rejeita
        er.confere(er.EstruturaIf, "if( )");              // Rejeita
        er.confere(er.EstruturaIf, "if( a > )");          // Rejeita
        
         System.out.println("Expressão Matematica");
        //Expressão Matematica
        er.confere(er.ExpressaoMatematica, "-4 + beta * media[1].x * soma(a,b)/4 * vetor[5].idade");
        er.confere(er.ExpressaoMatematica,"t++");
        er.confere(er.ExpressaoMatematica, "3 + media/3");
        er.confere(er.ExpressaoMatematica, "soma de 3 e 4");
        er.confere(er.ExpressaoMatematica, "3 + 5$");
        
        System.out.println("LFA13 B");
        er.confere(er.NumerosPositivosEImparesBinario, "01");
        er.confere(er.NumerosPositivosEImparesBinario, "011000");
            
        System.out.println("LFA13 c");
        //Exercicio LFA 13
        er.confere(er.NumerosNegativosEParesBinario, "10");
        er.confere(er.NumerosNegativosEParesBinario, "0100");
    }
}
