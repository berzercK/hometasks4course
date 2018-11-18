package education.homework.task3structures.constructions;

import static education.homework.task3structures.arrays.oneDim.Methods.initRandArray;
import static education.homework.task3structures.arrays.oneDim.Methods.printArray;
import static education.homework.task3structures.constructions.Methods.*;

public class ConstructionsMain {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        compareEnumSwitchVSIf();
        compareSwitchVSIf();

    }

    private static void compareEnumSwitchVSIf() {
        MyEnum girl = MyEnum.Julia;

        switchCase(girl);
        ifElseStatements(girl);
    }

    private static void compareSwitchVSIf() {
        int[] array = initRandArray(50, 0, 10);
        printArray(array);

        switchCase(array);
        ifElseStatements(array);
    }

}
