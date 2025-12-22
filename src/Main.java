public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int integer = 2000000000;
        System.out.println("Значение переменной integer с типом int " + integer + " равно");

        byte byteVar = 127;
        System.out.println("Значение переменной byteVar с типом byte " + byteVar + " равно");

        short shortVar = 32767;
        System.out.println("Значение переменной shortVar с типом short " + shortVar + " равно");

        long longVar = 9223272036854775808L;
        System.out.println("Значение переменной longVar с типом long " + longVar + " равно");

        float floatVar = 32767;
        System.out.println("Значение переменной floatVar с типом float " + floatVar + " равно");

        double doubleVar = 922337203;
        System.out.println("Значение переменной doubleVar с типом double " + doubleVar + " равно");


        System.out.println("Задача 2");
        float n1 = 27.12f;
        System.out.println("Значение переменной n1 с типом float " + n1 + " равно");
        long n2 = 987678965549L;
        System.out.println("Значение переменной n2 с типом long " + n2 + " равно");
        float n3 = 2.786f;
        System.out.println("Значение переменной n3 с типом float " + n3 + " равно");
        short n4 = 569;
        System.out.println("Значение переменной n4 с типом short " + n4 + " равно");
        short n5 = -159;
        System.out.println("Значение переменной n5 с типом short " + n5 + " равно");
        short n6 = 27897;
        System.out.println("Значение переменной n6 с типом short " + n6 + " равно");
        byte n7 = 67;
        System.out.println("Значение переменной n7 с типом byte " + n7 + " равно");

        System.out.println("Задача 3");
        int ludmila = 23;
        int anna = 27;
        int katy = 30;
        int paper = 480;
        int res = paper / (ludmila+anna+katy);
        System.out.println("На каждого ученика рассчитано " + res + " листов бумаги");

        System.out.println("Задача 4");
        int efficiency = 16 / 2;
        int eff20 = efficiency * 20;
        System.out.println("За 20 минут машина произвела " + eff20 + " штук бутылок");
        int effDay = efficiency * 60 * 24;
        System.out.println("За сутки минут машина произвела " + effDay + " штук бутылок");
        int eff3Day = efficiency * 60 * 24 * 3;
        System.out.println("За 3 дня машина произвела " + eff3Day + " штук бутылок");
        int effMonth = efficiency * 60 * 24 * 30;
        System.out.println("За 1 месяц машина произвела " + effMonth + " штук бутылок");

        System.out.println("Задача 5");
        int allCan = 120;
        int whiteCan = 2;
        int brownCan = 4;
        int room = allCan / (whiteCan+brownCan);
        int whiteCanAll = room * whiteCan;
        int brownCanAll = room * brownCan;
        System.out.println("В школе, где " + room + " классов, нужно " + whiteCanAll + " банок белой краски и " + brownCanAll + " банок коричневой краски");

        System.out.println("Задача 6");
        float bananas = 5 * 0.080f;
        System.out.println(bananas);
        float milk = 2 * 0.105f;
        System.out.println(milk);
        float ice = 2 * 0.100f;
        System.out.println(ice);
        float eggs = 4 * 0.070f;
        System.out.println(eggs);
        float weight = bananas + milk + ice + eggs;

        int kg = (int) weight;
        int grams = (int) ((weight - kg) * 1000);
        System.out.println("Вес завтрака " + kg + " килограмм " + grams + " грамм");

        System.out.println("Задача 7");
        int desiredWeight = 7;
        int weight250gr = 250;
        int weight500gr = 500;
        int day250gr = (desiredWeight*1000) / weight250gr;
        System.out.println("Чтобы сбросить " + desiredWeight + " килограмм, при потери веса в " + weight250gr + " нужно "+ day250gr + " дней");
        int day500gr = (desiredWeight*1000)  / weight500gr;
        System.out.println("Чтобы сбросить " + desiredWeight + " килограмм, при потери веса в " + weight500gr + " нужно "+ day500gr + " дней");
        int sredDay = (day250gr + day500gr) / 2;
        System.out.println("В среднем потребуется " + sredDay + " дней");

        System.out.println("Задача 8 ");
        int masha = 67760;
        int den = 83690;
        int kristina = 76230;
        float percent = 0.1f;

        float masha10 = masha + (masha * percent);;
        float masha10Year = (masha10 - masha) * 12 ;
        System.out.println("Маша теперь получает " + masha10 + "рублей. Годовой доход вырос на " + masha10Year + " рублей");

        float den10 = den + (den * percent);
        float den10Year = (den10 - den) * 12;
        System.out.println("Маша теперь получает " + den10 + "рублей. Годовой доход вырос на " + den10Year + " рублей");

        float kristina10 = kristina + (kristina * percent);
        float kristina10Year = (kristina10 - kristina) * 12 ;
        System.out.println("Маша теперь получает " + kristina10 + "рублей. Годовой доход вырос на " + kristina10Year + " рублей");






    }
}