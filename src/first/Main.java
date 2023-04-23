package first;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ScannerException {
        Scanner s = new Scanner(System.in);
        String string = s.nextLine();

        if (string.indexOf(".")>=0 || string.indexOf(",")>=0) {
            throw new ScannerException("Вы пытаетесь ввести дробные числа - программа работает только с целыми :(");
        }

        String [] strings = string.split(" ");
        int output1 = 0;
        int output2 = 0;

        if (strings.length != 3) {
            throw new ScannerException("Вы ввели слишком мало/много аргументов или забыли пробелы, ИЛИ ВВЕЛИ ЧЕПУХУ");
        }

        switch(strings[0]){
            case "I" :
                strings[0] = "1";
                output1 = 1;
                break;
            case "II" :
                strings[0] = "2";
                output1 = 1;
                break;
            case "III" :
                strings[0] = "3";
                output1 = 1;
                break;
            case "IV" :
                strings[0] = "4";
                output1 = 1;
                break;
            case "V" :
                strings[0] = "5";
                output1 = 1;
                break;
            case "VI" :
                strings[0] = "6";
                output1 = 1;
                break;
            case "VII" :
                strings[0] = "7";
                output1 = 1;
                break;
            case "VIII" :
                strings[0] = "8";
                output1 = 1;
                break;
            case "IX" :
                strings[0] = "9";
                output1 = 1;
                break;
            case "X" :
                strings[0] = "10";
                output1 = 1;
                break;
        }

        switch(strings[2]){
            case "I" :
                strings[2] = "1";
                output2 = 1;
                break;
            case "II" :
                strings[2] = "2";
                output2 = 1;
                break;
            case "III" :
                strings[2] = "3";
                output2 = 1;
                break;
            case "IV" :
                strings[2] = "4";
                output2 = 1;
                break;
            case "V" :
                strings[2] = "5";
                output2 = 1;
                break;
            case "VI" :
                strings[2] = "6";
                output2 = 1;
                break;
            case "VII" :
                strings[2] = "7";
                output2 = 1;
                break;
            case "VIII" :
                strings[2] = "8";
                output2 = 1;
                break;
            case "IX" :
                strings[2] = "9";
                output2 = 1;
                break;
            case "X" :
                strings[2] = "10";
                output2 = 1;
                break;
        }

        int a = Integer.valueOf(strings[0]);
        int b = Integer.valueOf(strings[2]);

        if (a>10 || b>10) {
           throw new ScannerException("Вы ввели слишком больше число (не соответствует условиям)");
            }

        if ((output1==0 && output2==1)||(output1==1 && output2==0)) {
            throw new ScannerException("Вы ввели римское и арабское число (не соответствует условиям)");
        }




        Rim answer = new Rim();

        switch(strings[1]){
            case "+" :
                if (output1==1&&output2==1) {
                    answer.arabicToRim(a + b);
                } else System.out.println(a + b);;
                break;
            case "-" :
                if (output1==1&&output2==1) {
                    if ((a - b) < 1) {
                        throw new ScannerException("Римские числа могут быть только положительными");
                    } else answer.arabicToRim(a - b);
                } else System.out.println(a - b);
                break;
            case "*" :
                if (output1==1&&output2==1) {
                    answer.arabicToRim(a * b);
                } else System.out.println(a * b);
                break;
            case "/" :
                if (output1==1&&output2==1) {
                    answer.arabicToRim(a / b);
                } else System.out.println(a / b);
                break;
        }

    }
}

//++1. Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами:
// a + b, a - b, a * b, a / b. Данные передаются в одну строку (смотри пример)!
// Решения, в которых каждое число и арифмитеческая операция передаются с новой строки считаются неверными.
//++2. Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами.
//++3. Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.
//На выходе числа не ограничиваются по величине и могут быть любыми.
//++4. Калькулятор умеет работать только с целыми числами.
//5. Калькулятор умеет работать только с арабскими или римскими цифрами одновременно,
// при вводе пользователем строки вроде 3 + II калькулятор должен выбросить исключение и прекратить свою работу.
//6. При вводе римских чисел, ответ должен быть выведен римскими цифрами, соответственно, при вводе арабских
// - ответ ожидается арабскими.
//7. При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.
//8. При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций,
// приложение выбрасывает исключение и завершает свою работу.
//++9. Результатом операции деления является целое число, остаток отбрасывается.
//10. Результатом работы калькулятора с арабскими числами могут быть отрицательные числа и ноль.
// Результатом работы калькулятора с римскими числами могут быть только положительные числа,
// если результат работы меньше единицы, выбрасывается исключение
//
//