public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int a = 589;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 5;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 220;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 34500;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 365.8908f;
        System.out.println("Значение переменной e типом float равно " + e);
        double f = 6765.7642333;
        System.out.println("Значение переменной f с типом double равно " + f);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int a = 27897;
        byte b = 67;
        short c = -159;
        short l = 569;
        long d = 987678965549L;
        float e = 27.12f;
        double f = 2.786;
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte classLyudmilaPavlovna = 23;
        short classAnnaSergeyevna = 27;
        int classEkaterinaAndreevna = 30;
        long paper = 480;
        paper = paper  / (classLyudmilaPavlovna + classAnnaSergeyevna + classEkaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int bottles = 16;
        int minutes = 2;
        int  machinePerformance = bottles / minutes ;
        int  machinePerformance20Minutes = machinePerformance * 20;
        int machinePerformanceHour = machinePerformance20Minutes * 3;
        int machinePerformanceDay = machinePerformanceHour * 24;
        int machinePerformance3Day = machinePerformanceDay * 3;
        int machinePerformance1Month = machinePerformanceDay * 30;
        System.out.println("За 20 минут машина произвела " + machinePerformance20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + machinePerformanceDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + machinePerformance3Day + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + machinePerformance1Month + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int totalCansPaint = 120;
        int forClassWhitePaint = 2;
        int forClassBrownPaint = 4;
        int totalPaintForClass = forClassWhitePaint + forClassBrownPaint;
        int numberClassesInSchool = totalCansPaint / totalPaintForClass;
        int totalWhitePaint = numberClassesInSchool * forClassWhitePaint;
        int totalBrownPaint = numberClassesInSchool * forClassBrownPaint;
        System.out.println("В школе, где " + numberClassesInSchool + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint  + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int bananasCount = 5;
        int milkCount = 2;
        int iceCreamCount = 2;
        int EggsCount = 4;
        int weightBananasUnit = 80;
        int weightMilkUnit = 105;
        int weightIceCreamUnit = 100;
        int weightEggsUnit = 70;

        double totalWeightInGrams = bananasCount * weightBananasUnit + milkCount * weightMilkUnit + iceCreamCount * weightIceCreamUnit + EggsCount * weightEggsUnit;
        double totalWeightInKg = totalWeightInGrams / 1_000;
        System.out.println("Общий вес спортзавтрака составляет в граммах " + totalWeightInGrams + " и в кг " + totalWeightInKg);
    }

    public static void task7() {
        System.out.println("Задача 7");
        int totalWeightLossInGrams = 7000;
        int weightLossIn1DayMin = 250;
        int weightLossIn1DayMax = 500;
        double numberOfWeightLossDaysMin = totalWeightLossInGrams / weightLossIn1DayMin;
        double numberOfWeightLossDaysMax = totalWeightLossInGrams / weightLossIn1DayMax;
        double lossWeightPerDaysOnAverage = (weightLossIn1DayMin  + weightLossIn1DayMax ) / 2D;
        double averageDaysCount = totalWeightLossInGrams / lossWeightPerDaysOnAverage;
        System.out.println( numberOfWeightLossDaysMin  + " дней минимально уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println( numberOfWeightLossDaysMax  + " дней максимально уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println( averageDaysCount   + " дней уйдет на похудение в среднем");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int salaryMonthMasha = 67_760;
        int salaryMonthDenis = 83_690;
        int salaryMonthKristina = 76_230;
        double annualIncomeBeforeSalaryIncreaseMasha = salaryMonthMasha * 12;
        double annualIncomeBeforeSalaryIncreaseDenis = salaryMonthDenis * 12;
        double annualIncomeBeforeSalaryIncreaseKristina = salaryMonthKristina * 12;
        double salaryIncreaseMonthMasha = salaryMonthMasha * 0.1 + salaryMonthMasha;
        double salaryIncreaseMonthDenis = salaryMonthDenis * 0.1 + salaryMonthDenis;
        double salaryIncreaseMonthKristina = salaryMonthKristina * 0.1 + salaryMonthKristina;
        double annualIncomeAfterSalaryIncreaseMasha = salaryIncreaseMonthMasha * 12;
        double annualIncomeAfterSalaryIncreaseDenis = salaryIncreaseMonthDenis * 12;
        double annualIncomeAfterSalaryIncreaseKristina = salaryIncreaseMonthKristina * 12;
        double annualIncomeDifferenceMasha = annualIncomeAfterSalaryIncreaseMasha - annualIncomeBeforeSalaryIncreaseMasha;
        double annualIncomeDifferenceDenis = annualIncomeAfterSalaryIncreaseDenis - annualIncomeBeforeSalaryIncreaseDenis;
        double annualIncomeDifferenceKristina = annualIncomeAfterSalaryIncreaseKristina - annualIncomeBeforeSalaryIncreaseKristina;
        System.out.println("Маша теперь получает " + salaryIncreaseMonthMasha + " рублей. Годовой доход вырос на " + annualIncomeDifferenceMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryIncreaseMonthDenis + " рублей. Годовой доход вырос на " + annualIncomeDifferenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryIncreaseMonthKristina + " рублей. Годовой доход вырос на " + annualIncomeDifferenceKristina + " рублей");
    }
}
