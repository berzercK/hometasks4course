package education.homework.task3structures.constructions;

import static education.homework.task3structures.nestedloops.LoopsMain.nextLine;

public class Methods {

    private static void printTimesElseIf(int[] times) {
        for (int i = 0; i < times.length; ++i) {
            System.out.println("Уровень вложенности ->  " + i + "  inputs ->  " + times[i]);
        }
    }

    private static void printTimes(int[] times) {
        for (int i = 0; i < times.length; ++i) {
            System.out.println("Case ->  " + i + "  inputs ->  " + times[i]);
        }
    }

    static void ifElseStatements(int[] array) {
        System.out.println("\t\t\t IF - ELSE");
        int[] times = new int[11];
        long startTime = System.nanoTime();

        for (int anArray : array) {
            if (anArray == 0) {
                System.out.print("0");
                times[0]++;
            } else if (anArray == 1) {
                System.out.print("1");
                times[1]++;
            } else if (anArray == 2) {
                System.out.print("2");
                times[2]++;
            } else if (anArray == 3) {
                System.out.print("3");
                times[3]++;
            } else if (anArray == 4) {
                System.out.print("4");
                times[4]++;
            } else if (anArray == 5) {
                System.out.print("5");
                times[5]++;
            } else if (anArray == 6) {
                System.out.print("6");
                times[6]++;
            } else if (anArray == 7) {
                System.out.print("7");
                times[7]++;
            } else if (anArray == 8) {
                System.out.print("8");
                times[8]++;
            } else if (anArray == 9) {
                System.out.print("9");
                times[9]++;
            } else if (anArray == 10) {
                System.out.print("10");
                times[10]++;
            }
        }

        long estimatedTime = System.nanoTime() - startTime;
        nextLine();

        printTimesElseIf(times);
        System.out.println("ifElseStat()   -> " + (estimatedTime / 1e+9) + " sec");
        nextLine();
    }


    static void switchCase(int[] array) {
        System.out.println("\t\t\t SWITCH-CASE");
        int[] times = new int[11];
        long startTime = System.nanoTime();

        for (int anArray : array) {
            switch (anArray) {
                case 0: {
                    System.out.print("0");
                    times[0]++;
                    break;
                }
                case 1: {
                    System.out.print("1");
                    times[1]++;
                    break;
                }
                case 2: {
                    System.out.print("2");
                    times[2]++;
                    break;
                }
                case 3: {
                    System.out.print("3");
                    times[3]++;
                    break;
                }
                case 4: {
                    System.out.print("4");
                    times[4]++;
                    break;
                }
                case 5: {
                    System.out.print("5");
                    times[5]++;
                    break;
                }
                case 6: {
                    System.out.print("6");
                    times[6]++;
                    break;
                }
                case 7: {
                    System.out.print("7");
                    times[7]++;
                    break;
                }
                case 8: {
                    System.out.print("8");
                    times[8]++;
                    break;
                }
                case 9: {
                    System.out.print("9");
                    times[9]++;
                    break;
                }
                case 10: {
                    System.out.print("10");
                    times[10]++;
                    break;
                }
            }
        }

        long estimatedTime = System.nanoTime() - startTime;
        nextLine();

        printTimes(times);
        System.out.println("switchCase()   -> " + (estimatedTime / 1e+9) + " sec");
        nextLine();
    }


    static void ifElseStatements(MyEnum girl) {
        long startTime = System.nanoTime();

        for (int i = 0; i < 10_000; i++) {
            if (girl == MyEnum.Anna) {
                System.out.print("Anna");
            } else if (girl == MyEnum.Olga) {
                System.out.print("Olga");
            } else if (girl == MyEnum.Julia) {
                System.out.print("Julia");
            } else if (girl == MyEnum.Natahsa) {
                System.out.print("Natasha");
            } else if (girl == MyEnum.Veronika) {
                System.out.print("Veronika");
            }
        }

        long estimatedTime = System.nanoTime() - startTime;
        nextLine();
        System.out.println("ifElseStat()   -> " + (estimatedTime / 1e+9) + " sec");
    }

    static void switchCase(MyEnum girl) {
        long startTime = System.nanoTime();

        for (int i = 0; i < 10_000; i++) {
            switch (girl) {
                case Anna: {
                    System.out.print("Anna");
                    break;
                }
                case Olga: {
                    System.out.print("Olga");
                    break;
                }
                case Julia: {
                    System.out.print("Julia");
                    break;
                }
                case Natahsa: {
                    System.out.print("Natasha");
                    break;
                }
                case Veronika: {
                    System.out.print("Veronika");
                    break;
                }
            }
        }

        long estimatedTime = System.nanoTime() - startTime;
        nextLine();
        System.out.println("switchCase()   -> " + (estimatedTime / 1e+9) + " sec");
    }
}
