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
    public String TipoVoid = "void";
    public String TipoArray = "(" + TiposPrimitivos + "|" + TiposObjetos + "|[A-Z][a-zA-Z0-9_]*)\\s*(\\[\\s*\\])*";
    public String TipoGenerico = "(" + TiposObjetos + "|[A-Z][a-zA-Z0-9_]*)<([^<>]+|<[^<>]+>)+>";
    public String TipoCustomizado = "[A-Z][a-zA-Z0-9_]*";
    public String TiposRetornoNaoPrimitivos = TipoVoid + "|" + TipoArray + "|" + TipoGenerico + "|" + TipoCustomizado;
    public String Tipos = "\\b(" + TiposPrimitivos + "|" + TiposRetornoNaoPrimitivos + ")\\b";
    
    public String PalavrasChaveJava = "^(?!abstract|assert|boolean|break|byte|case|catch|char|class|const|continue|default|do|double|else|enum|extends|final|finally|float|for|goto|if|implements|import|instanceof|int|interface|long|native|new|package|private|protected|public|return|short|static|strictfp|super|switch|synchronized|this|throw|throws|transient|try|void|volatile|while|true|false|null)$";
    public String PrimeiraLetraNomeDeMetodoOuVariavel = "(" + Letra + "|\\_|\\$)";
    public String DemaisLetrasNomeDeMetodoOuVariavel = "(" + Letras + "|" + Digitos + "|\\_|\\$)";
    public String NomeDeMetodoOuVariavel = PrimeiraLetraNomeDeMetodoOuVariavel + DemaisLetrasNomeDeMetodoOuVariavel + "*"; //nao ta englobando palavraschaveJava
    
    
    //Parametro
    public String ParametroUnico = Tipos  + Brancos + NomeDeMetodoOuVariavel;
    public String ListaParametros = ParametroUnico + "(" + Brancos + "," + Brancos + ParametroUnico + ")*";
    public String Parametro = "\\(" + Brancos + "(" + ListaParametros + ")?" + Brancos + "\\)";
    
    
    // Assinatura de função
    public String AssinaturaDeFuncoes = "(" + Brancos + Tipos + Brancos + NomeDeMetodoOuVariavel + Brancos + Parametro + Brancos + "(\\;|\\{)" + Brancos + ")";
    
    
    //Condicional if
    public String OperadoresRelacionais = "(==|!=|>=|<=|>|<)";
    public String OperadoresLogicos = "(\\&\\&|\\|\\|)";
    public String Booleanos = "(true|false)";
    public String Identificador = PrimeiraLetraNomeDeMetodoOuVariavel + DemaisLetrasNomeDeMetodoOuVariavel + "*";
    public String ExpressaoSimples = "(" + Booleanos + "|" + Identificador + "|" + Identificador + Brancos + OperadoresRelacionais + Brancos + Identificador + ")";
    public String ExpressaoNegada = "(!" + Brancos + "(" + ExpressaoSimples + "|\\(" + Brancos + ExpressaoSimples + Brancos + "\\))" + ")";
    public String ExpressaoComposta = "(" + ExpressaoSimples + "|" + ExpressaoNegada + ")" + "(" + Brancos + OperadoresLogicos + Brancos + "(" + ExpressaoSimples + "|" + ExpressaoNegada + "))*";
    public String CondicaoIf = Brancos + "(" + ExpressaoComposta + ")" + Brancos;
    public String EstruturaIf = "if\\(" + CondicaoIf + "\\)"; // if

    
    


    //Expressão Matematica
    public String Exponencial = "E(\\+|\\-)" + Digitos;
    public String Fracionaria = "(\\." + Digitos + "(" + Exponencial + ")?)";
    public String Real = "\\-?" + Digitos + "(" + Fracionaria + ")?" + "(" + Exponencial + ")?"; //aceita qualquer numero real
    public String Numero = Real;
    public String AcessoArray = NomeDeMetodoOuVariavel + "(" + Brancos + "\\[" + Brancos + Digitos + Brancos + "\\])*";
    public String AcessoEncadeado = AcessoArray + "(" + Brancos + "\\." + Brancos + AcessoArray + ")*";
    public String ParametrosFuncaoSimples = "\\(" + Brancos + "(" + NomeDeMetodoOuVariavel + "(" + Brancos + "," + Brancos + NomeDeMetodoOuVariavel + ")*)?" + Brancos + "\\)";
    public String FuncaoComParametros = AcessoEncadeado + Brancos + ParametrosFuncaoSimples;
    public String VariavelOuAcesso = AcessoEncadeado;
    public String TermoSemParenteses = "(" + Numero + "|" + FuncaoComParametros + "|" + VariavelOuAcesso + ")";
    public String ExpressaoParentesesSimples = "\\(" + Brancos + TermoSemParenteses + "(" + Brancos + "[+\\-*/]" + Brancos + TermoSemParenteses + ")*" + Brancos + "\\)";
    public String Termo = "(" + TermoSemParenteses + "|" + ExpressaoParentesesSimples + ")";
    public String Operador = "[+\\-*/]";
    public String ExpressaoMatematica = Termo + "(" + Brancos + Operador + Brancos + Termo + ")*";
    
    
    // Execicios
    //Numeros Impares e Positivos 
    public String NumerosPositivosEImparesBinario = "0(0|1)*1";
    //Numeros Negativos e pares
    public String NumerosNegativosEParesBinario = "1(0|1)*0";

    public void confere(String expressao, String sentenca) {
        if (sentenca.matches(expressao)) {
            System.out.println("W: " + sentenca + " - Aceita!");
        } else {
            System.out.println("W: " + sentenca + " - Rejeitada!");
        }
    }

}
