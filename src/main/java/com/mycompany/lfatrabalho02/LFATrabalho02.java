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
        er.confere(er.AssinaturaDeFuncoes, "void 1funcao01(int a){");
      

// Casos válidos
        er.confere(er.EstruturaIf, "if(variavel)");       // Aceita
        er.confere(er.EstruturaIf, "if(a > b)");          // Aceita
        er.confere(er.EstruturaIf, "if(a == b)");         // Aceita
        er.confere(er.EstruturaIf, "if(true)");           // Aceita
        er.confere(er.EstruturaIf, "if(!flag)");          // Aceita
        er.confere(er.EstruturaIf, "if(a > b && c < d)"); // Aceita
        er.confere(er.EstruturaIf, "if(!(a > b))");       // Aceita

// Casos inválidos
        er.confere(er.EstruturaIf, "if()");               // Rejeita
        er.confere(er.EstruturaIf, "if(a >)");            // Rejeita
        er.confere(er.EstruturaIf, "if(> b)");            // Rejeita
        er.confere(er.EstruturaIf, "if(a &&)");           // Rejeita
        er.confere(er.EstruturaIf, "if(&& b)");           // Rejeita
        er.confere(er.EstruturaIf, "if(>)");              // Rejeita
        er.confere(er.EstruturaIf, "if( )");              // Rejeita
        er.confere(er.EstruturaIf, "if( a > )");          // Rejeita
        
        
        
        er.confere(er.ExpressaoMatematica, "-4 + beta * media[1].x * soma(a,b)/4 * vetor[5].idade");
             
    }
}
