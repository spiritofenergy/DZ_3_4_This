package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Зачем нужно ключевое слово this?");
        System.out.println("Ответ: this нужен для ссылки на текущий объект, для обращения к полям текущего класса ");
        System.out.println("2. Можно ли обратиться к полям класса, не используя ключевое слово this? ");
        System.out.println("Ответ: Можно");
        System.out.println("3. Когда стоит использовать слово this?");
        System.out.println("Ответ: Когда у переменной экземпляра класса и у переменной метода одинаковые имена и когда нужно вызвать конструктор одного типа из другого ");

        /////////////////
         System.out.println("4. Создайте класс, который находит наибольшее из трех чисел. Ко всем \n" +
             "переменным обращаться можно ТОЛЬКО используя this");
        class Dos {
            int uno = 24;
            int dos = 17;
            int tres = 55;
            int[] intArray = new int[]{this.uno, this.dos, this.tres};
            int max = 0;
            int result = findMax();

            int findMax() {
                for (int j : intArray) {
                    if (this.max < j) {
                        this.max = j;
                    }
                }
                System.out.println("Я в теме: " + this.max);
                return 0;
            }
        }
        Dos dos = new Dos();
        int[] arrayInt = new int[]{dos.uno, dos.dos, dos.tres};
        for (int j : arrayInt) {
            if (dos.max < j) dos.max = j;
        }
        System.out.println("A я за бортом: " + dos.max);

        ////////////////
       System.out.println("5. Создайте класс, который делает из трех маленьких строк одну большую. Ко \n" +
                "всем переменным обращаться можно ТОЛЬКО используя this.");
       class MaxString{
           String uno = "Гидро";
           String dos = "электро";
           String tres = "станция";
           String generalString = additionString();
           String additionString(){
               this.generalString = this.uno + this.dos + this.tres;
               return this.generalString;
           }

       }
       MaxString maxString = new MaxString();
       System.out.println(maxString.generalString);

        ////////////////
        System.out.println("6. Создайте класс, который принимает аргументом, какую задачу он должен \n" +
                "решить: “найти минимум из 2 чисел”, “найти сумму элементов массива”, \n" +
                "“вывести строку с конца”. На выходе этот класс пишет в консоль Java-код, \n" +
                "который решает заданную задачу. Ко всем переменным обращаться можно \n" +
                "ТОЛЬКО используя this.");
    class UniClass {
        int num1 = 40;
        int num2 = 10;
        int min = getMinNumber();
        int[] intArr = new int[]{54, 78, 23, 67, 34, 90};
        int sumArr = getSumArray();
        String str = "!ьлибомотвА";
        String result = backString();
        char[] charsArray = new char[10];

        int getMinNumber() {
            this.min = Math.min(this.num1, this.num2);
            System.out.println(this.min);
            return this.min;
        }
        int getSumArray() {
            for (int j : intArr) {
                this.sumArr += j;
            }
            System.out.println(this.sumArr);
            return this.sumArr;
        }
        String backString(){
            this.charsArray = str.toCharArray();
            this.result = "";
            for (int i = str.length() -1; i >= 0; i--){
                this.result += this.charsArray[i];
            }
            System.out.println(result);
            return this.result;
        }
    }
            UniClass uni = new UniClass();
            }
        }

