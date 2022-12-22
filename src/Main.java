public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        int intVariables = 2147483646;
        byte byteVariables = 126;
        short shortVariables = 32766;
        long longVariables = 999999999L;
        float floatVariables = 3346543535434545.334575f;
        double doubleVariables = 9999999999999999.443534645646353;
        System.out.println("Значение переменной intVariables с типом "+((Object)intVariables).getClass().getSimpleName()
                +" равно "+intVariables+" .");
        System.out.println("Значение переменной byteVariables с типом "+((Object)byteVariables).getClass().getSimpleName()
                +" равно "+byteVariables+" .");
        System.out.println("Значение переменной shortVariables с типом "+((Object)shortVariables).getClass().getSimpleName()
                +" равно "+shortVariables+" .");
        System.out.println("Значение переменной longVariables с типом "+((Object)longVariables).getClass().getSimpleName()
                +" равно "+longVariables+" .");
        System.out.println("Значение переменной floatVariables с типом "+((Object)floatVariables).getClass().getSimpleName()
                +" равно "+floatVariables+" .");
        System.out.println("Значение переменной doubleVariables с типом "+((Object)doubleVariables).getClass().getSimpleName()
                +" равно "+doubleVariables+" .");
        System.out.println();

        System.out.println("Задача 2:");
        float floatVariables2 = 27.12f;
        long longVariables2 = 987678965549L;
        String stringVariables2 = "2,786";
        char charVariables2 = 569;
        short shortVariables3 = -159;
        int intVariables4 = 27897;
        byte byteVariables2 = 67;
        System.out.println("Все переменные инициализированы.");
        System.out.println();

        System.out.println("Задача 3:");
        byte luda = 23;
        byte anna = 27;
        byte ekaterina = 30;
        short list = 480;
        System.out.println("На каждого ученика рассчитано "+ list/(luda+anna+ekaterina)+" листов бумаги.");
        System.out.println();

        System.out.println("Задача 4:");
        short quantityDuring = 16;
        byte min = 2;
        short min2 = 20;
        byte dayAndMonth = 1;
        byte day = 3;
        System.out.println("За "+min2+" минут машина произвела "+(min2/min)*quantityDuring+" штук бутылок.");
        System.out.println("За "+dayAndMonth+" сутки машина произвела "+((24*60)/min)*quantityDuring+" штук бутылок.");
        System.out.println("За "+day+" дня машина произвела "+((3*24*60)/min)*quantityDuring+" штук бутылок.");
        System.out.println("За "+dayAndMonth+" месяц машина произвела "+((31*24*60)/min)*quantityDuring+" штук бутылок.");
        System.out.println();

        System.out.println("Задача 5:");
        byte sumBanks = 120;
        byte whiteBanksClass = 2;
        byte brownBanksClass = 4;
        System.out.println("В школе, где "+sumBanks/(whiteBanksClass+brownBanksClass)+" классов, нужно "
                +(sumBanks/(whiteBanksClass+brownBanksClass))*whiteBanksClass +" банок белой краски и "
                +(sumBanks/(whiteBanksClass+brownBanksClass))*brownBanksClass+" банок коричневой краски");
        System.out.println();

        System.out.println("Задача 6:");
        byte banana = 5;
        byte bananaWeight = 80;
        short milk = 200;
        short milkWeight100ml = 105;
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        byte agg = 4;
        byte aggWeight = 70;
        int breakfast = (banana*bananaWeight)+(milk/100*milkWeight100ml)+(iceCream*iceCreamWeight)+(agg*aggWeight);
        System.out.println("Вес спортзавтрака "+breakfast/1000+" килограмм "+breakfast%1000+" грамм.");
        System.out.println();

        System.out.println("Задача 7:");
        short weight = 7;
        short weightInDayMin = 250;
        short weightInDayMax = 500;
        weight *=1000;
        System.out.println(weight/weightInDayMin+ " дней уйдет на похудание, если в день будет терять 250 грамм.");
        System.out.println(weight/weightInDayMax+ " дней уйдет на похудание, если в день будет терять 500 грамм.");
        System.out.println(weight/((weightInDayMax-weightInDayMin)/2+weightInDayMin)
                + " дней уйдет на похудание, если в день будет терять в среднем.");
        System.out.println();

        System.out.println("Задача 8:");
        double salaryIncrease = 1.1;
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        System.out.println("Маша теперь получает "+ (int)(salaryMasha*salaryIncrease) +" рублей.Годовой доход вырос на "
                + Math.abs((salaryMasha*12)-((int)(salaryMasha*salaryIncrease)*12))+" рублей.");
        System.out.println("Денис теперь получает "+ (int)(salaryDenis*salaryIncrease) +" рублей.Годовой доход вырос на "
                + Math.abs((salaryDenis*12)-((int)(salaryDenis*salaryIncrease)*12))+" рублей.");
        System.out.println("Кристина теперь получает "+ (int)(salaryKristina*salaryIncrease) +" рублей.Годовой доход вырос на "
                + Math.abs((salaryKristina*12)-((int)(salaryKristina*salaryIncrease)*12))+" рублей.");

    }
}