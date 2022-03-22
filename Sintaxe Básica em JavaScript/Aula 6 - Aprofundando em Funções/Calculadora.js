function calculator () {
const operation = Number(prompt ("Escolha uma operação:\n 1 - Soma (+)\n 2 - Subtração (-)\n 3 - Multiplicação (*)\n 4 - Divisão (/)\n 5 - Resto da Divisão (%)\n 6 - Potenciação (**)")); 

if (!operation || operation >= 7){
    alert ("ERRO: operação inválida!");
    calculator ();
}
else {
let N1 = Number(prompt ("Insira o primeiro valor: "));
let N2 = Number(prompt ("Insira o segundo valor: "));
let result;

if (!N1 | !N2){
    alert ("ERRO: valor(es) inválido(s)!");
    calculator ();
}
else {
    function soma (){
        result = N1 + N2;
        alert (`${N1} + ${N2} = ${result}`);
    }
    function sub (){
        result = N1 - N2;
        alert (`${N1} - ${N2} = ${result}`);
    }
    function mult (){
        result = N1 * N2;
        alert (`${N1} * ${N2} = ${result}`);  
    }
    function div (){
        result = N1 / N2;
        alert (`${N1} / ${N2} = ${result}`);
    }
    function RestDiv (){
        result = N1 % N2;
        alert (`O resto da divisão entre ${N1} e ${N2} é igual a ${result}`);
    }
    function pot (){
        result = N1 ** N2;
        alert (`${N1} elevado a ${N2} é igual a ${result}`);
    }
    function NewOperation (){
        let option = Number(prompt ("Deseja fazer outra operação:\n 1 - Sim\n 2 - Não"));
        
        if (option == 1){
            calculator ();
        }
        else if (option == 2){
            alert ("Ok, fechando calculadora");
        }
        else {
            alert ("ERRO: digite um opção válida!");
            NewOperation ();
        }
    }
}
/*
// - Usando if, else if e else: 
if (operation == 1){
    soma ();
}
else if (operation == 2){
    sub ();
}
else if (operation == 3){
    mult ();
}
else if (operation == 4){
    div ();
}
else if (operation == 5){
    RestDiv ();
}
else if (operation == 6){
    pot ();
}
else {
    console.log ("Operação inexistente ou não listada.");
}
*/
// - Usando switch case:
switch (operation){
    case 1:
        soma ();
        break;
    case 2:
        sub ();
        break;
    case 3:
        mult ();
        break;
    case 4:
        div ();
        break;
    case 5:
        RestDiv ();
        break;
    case 6:
        pot ();
        break;
}
NewOperation ();
}
}
calculator ();