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
    public String Digitos = Digito + "+";
    public String Brancos = "(\\s)*";
    
    public String TipoCustomizado = "[A-Z][a-zA-Z0-9_]*";
    
    // Os tipos primitivos do Java. Aqueles que a gente sempre usa.
    public String TiposPrimitivos = "byte|short|int|long|float|double|boolean|char";
    // Tipos de objetos comuns no Java. Coisas que não são primitivas.
    public String TiposObjetos = "String|Integer|Double|Boolean|Character|Object|List|Map|Set";
    // O tipo "void", pra quando a função não retorna nada.
    public String TipoVoid = "void";
    // Tipos de array, pode ser de primitivo, de objeto ou customizado, com uns colchetes no final.
    public String TipoArray = "(" + TiposPrimitivos + "|" + TiposObjetos + "|" + TipoCustomizado + ")" + Brancos +  "(\\[" + Brancos + "\\] )*" ;
    // Tipos genéricos, tipo "List<String>". Aquelas coisas mais chiques.
    public String TipoGenerico = "(" + TiposObjetos + "|[A-Z][a-zA-Z0-9_]*)<([^<>]+|<[^<>]+>)+>";
    // Tipos de retorno que não são primitivos, tipo void, array, genérico ou customizado.
    public String TiposRetornoNaoPrimitivos = TipoVoid + "|" + TipoArray + "|" + TipoGenerico + "|" + TipoCustomizado;
    // Todos os tipos que podem existir, primitivos ou os mais complexos.
    public String Tipos = "\\b(" + TiposPrimitivos + "|" + TiposRetornoNaoPrimitivos + ")\\b";
    // As palavras-chave do Java. Não pode usar elas pra nomear variável ou método.
    public String PalavrasChaveJava = "^(?!abstract|assert|boolean|break|byte|case|catch|char|class|const|continue|default|do|double|else|enum|extends|final|finally|float|for|goto|if|implements|import|instanceof|int|interface|long|native|new|package|private|protected|public|return|short|static|strictfp|super|switch|synchronized|this|throw|throws|transient|try|void|volatile|while|true|false|null)$";
    // A primeira letra de um nome de método ou variável. Pode ser letra, underline ou cifrão.
    public String PrimeiraLetraNomeDeMetodoOuVariavel = "(" + Letra + "|\\_|\\$)";
    // As outras letras do nome, pode ser letra, número, underline ou cifrão.
    public String DemaisLetrasNomeDeMetodoOuVariavel = "(" + Letras + "|" + Digitos + "|\\_|\\$)";
    // O nome completo de um método ou variável. Ainda não tá pegando as palavras chave do Java.
    public String NomeDeMetodoOuVariavel = PrimeiraLetraNomeDeMetodoOuVariavel + DemaisLetrasNomeDeMetodoOuVariavel + "*"; //nao ta englobando palavraschaveJava
    
    
    //Parametro
    // Um único parâmetro, com o tipo e o nome.
    public String ParametroUnico = Tipos + Brancos + NomeDeMetodoOuVariavel;
    // Uma lista de parâmetros, pode ter vários separados por vírgula.
    public String ListaParametros = ParametroUnico + "(" + Brancos + "," + Brancos + ParametroUnico + ")*";
    // Um conjunto de parâmetros dentro de parênteses. Pode ser vazio também.
    public String Parametro = "\\(" + Brancos + "(" + ListaParametros + ")?" + Brancos + "\\)";
    
    
    // Assinatura de função
    // Como é a assinatura de uma função, com tipo de retorno, nome, parâmetros e termina com ; ou {
    public String AssinaturaDeFuncoes = "(" + Brancos + Tipos + Brancos + NomeDeMetodoOuVariavel + Brancos + Parametro + Brancos + "(\\;|\\{)" + Brancos + ")";
    
    
    //Condicional if
    // Operadores de comparação, tipo igual, diferente, maior, menor.
    public String OperadoresRelacionais = "(==|!=|>=|<=|>|<)";
    // Operadores lógicos, tipo AND e OR.
    public String OperadoresLogicos = "(\\&\\&|\\|\\|)";
    // Os valores booleanos, true ou false.
    public String Booleanos = "(true|false)";
    // Um identificador, que é tipo um nome de variável.
    public String Identificador = NomeDeMetodoOuVariavel;
    // Uma expressão simples, pode ser um booleano, um identificador ou uma comparação.
    public String ExpressaoSimples = "(" + Booleanos + "|" + Identificador + "|" + Identificador + Brancos + OperadoresRelacionais + Brancos + Identificador + ")";
    // Uma expressão negada, tipo "!true" ou "!(a == b)".
    public String ExpressaoNegada = "(!" + Brancos + "(" + ExpressaoSimples + "|\\(" + Brancos + ExpressaoSimples + Brancos + "\\))" + ")";
    // Uma expressão composta, com várias expressões simples e lógicas.
    public String ExpressaoComposta = "(" + ExpressaoSimples + "|" + ExpressaoNegada + ")" + "(" + Brancos + OperadoresLogicos + Brancos + "(" + ExpressaoSimples + "|" + ExpressaoNegada + "))*";
    // A condição de um IF, que é uma expressão composta.
    public String CondicaoIf = Brancos + "(" + ExpressaoComposta + ")" + Brancos;
    // A estrutura do IF, tipo "if (condição)".
    public String EstruturaIf = "if\\(" + CondicaoIf + "\\)"; // if
    
    
    //Expressão Matematica
    public String Exponencial = "E(\\+|\\-)" + Digitos;
    public String Fracionaria = "(\\." + Digitos + "(" + Exponencial + ")?)";
    public String NumeroReal = "\\-?" + Digitos + "(" + Fracionaria + ")?" + "(" + Exponencial + ")?";
    
    // Acesso a elementos de array, tipo "array[0][1]".
    public String AcessoArray = NomeDeMetodoOuVariavel + "(" + Brancos + "\\[" + Brancos + Digitos + Brancos + "\\])*";
    // Acesso encadeado, tipo "objeto.propriedade.outraPropriedade".
    public String AcessoEncadeado = AcessoArray + "(" + Brancos + "\\." + Brancos + AcessoArray + ")*";
    // Parâmetros de função simples, só nomes de variáveis.
    public String ParametrosFuncaoSimples = "\\(" + Brancos + "(" + NomeDeMetodoOuVariavel + "(" + Brancos + "," + Brancos + NomeDeMetodoOuVariavel + ")*)?" + Brancos + "\\)";
    // Uma função com parâmetros, tipo "minhaFuncao(param1, param2)".
    public String FuncaoComParametros = AcessoEncadeado + Brancos + ParametrosFuncaoSimples; 
    // Uma variável ou um acesso encadeado.
    public String VariavelOuAcesso = AcessoEncadeado;
    // Um termo sem parênteses, pode ser um número, uma função ou uma variável.
    public String TermoSemParenteses = "(" + NumeroReal + "|" + FuncaoComParametros + "|" + VariavelOuAcesso + ")";
    // Os operadores matemáticos, tipo +, -, *, /.
    public String Operador = "[+\\-*/]";
    // Uma expressão dentro de parênteses, com termos e operadores.
    public String ExpressaoParentesesSimples = "\\(" + Brancos + TermoSemParenteses + "(" + Brancos + Operador + Brancos + TermoSemParenteses + ")*" + Brancos + "\\)";
    // Um termo que pode ser sem parênteses ou com parênteses.
    public String Termo = "(" + TermoSemParenteses + "|" + ExpressaoParentesesSimples + ")";
    // Uma expressão matemática completa, com termos e operadores.
    public String ExpressaoMatematica = Termo + "(" + Brancos + Operador + Brancos + Termo + ")*";
    
    
    // Execicios
    // Números ímpares e positivos em binário. Termina com 1.
    public String NumerosPositivosEImparesBinario = "0(0|1)*1";
    // Números negativos e pares em binário. Começa com 1 e termina com 0.
    public String NumerosNegativosEParesBinario = "1(0|1)*0";

   
    public void confere(String expressao, String sentenca) {
        if (sentenca.matches(expressao)) {
            System.out.println("W: " + sentenca + " - Aceita!"); // A expressão foi aceita.
        } else {
            System.out.println("W: " + sentenca + " - Rejeitada!"); // A expressão foi rejeitada.
        }
        
        
    }

}