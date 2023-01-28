/*Com if, exiba o nome do mês do ano de acordo com seu número.
 * Evite o efeito flecha. Faça também outro if que verifique 
 * se o mês é julho, dezembro ou janeiro, para assim exibir o texto "Férias".
 */

public class ExercicioEstruturaCondicional {
    public static void main(String[] args) {
        int mes = 2;
        if (mes == 1){
            System.out.println("Janeiro");
        }
        else if(mes == 2){
            System.out.println("Fevereiro");
        }
        else if(mes == 3){
            System.out.println("Março");
        }
        else if(mes == 4){
            System.out.println("Abril");
        }
        else if(mes == 5){
            System.out.println("Maio");
        }
        else if(mes == 6){
            System.out.println("Junho");
        }
        else if(mes == 7){
            System.out.println("Julho");
        }
        else if(mes == 8){
            System.out.println("Agosto");
        }
        else if(mes == 9){
            System.out.println("Setembro");
        }
        else if(mes == 10){
            System.out.println("Outubro");
        }
        else if(mes == 11){
            System.out.println("Novembro");
        }
        else if(mes == 12){
            System.out.println("Dezembro");
        }
        else{
            System.out.println("Número inválido, por favor, informe apenas números de 1 a 12");
        }
        if(mes == 1 || mes == 6 || mes == 12){
            System.out.println("Férias!");
        }

            /* 
 * Com switch use String para a partir do dia da semana, exibir seu numero.
 * Ainda no switch, faça outro exemplo onde, se uma
 * variável inteira for entre 1 e 3 exibir o texto "Certo". Se for 4
 * exibir "Errado", se for 5 " Talvez". Pra demais
 * valores exibir "Valor indefinido".
 */
    String diaSemana = "domingo";
    int variavelInteira = 1;

    switch (variavelInteira) {
        case 1:
            if(variavelInteira < 4){
                System.out.println("Certo");
            }
            break;
        case 2:
            if(variavelInteira == 4){
                System.out.println("Errado");
            }
        break;
        case 3:
            if(variavelInteira == 5){
                System.out.println("Talvez");
            }
        break;
        default:
        System.out.println("Valor indefinido");
            break;
    }
    
    switch (diaSemana) {
        case "domingo":
            
            System.out.println("1");
            break;
            case "segunda-feira":
            System.out.println("2");
            break;
            case "terça-feira":
            System.out.println("3");
            break;
            case "quarta-feira":
            System.out.println("4");
            break;
            case "quinta-feira":
            System.out.println("5");
            break;
            case "sexta-feira":
            System.out.println("6");
            break;
            case "sabado":
            System.out.println("7");
            break;
        default:
            break;
    }
}


}
