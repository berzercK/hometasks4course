package education.homework.task3structures.nestedloops;

public class LoopsMain {

    public static final int SIZE = 7;

    public static void main(String[] args) {
        drowSharpSquare(SIZE);
        drowVariantA(SIZE);
        drowVariantB(SIZE);
        drowVariantC(SIZE);
        drowVariantD(SIZE);
        drowVariantE(SIZE);
        drowVariantF(SIZE);
        drowVariantG(SIZE);
        drowVariantH(SIZE);
        drowVariantI(SIZE);

    }

    private static void spacePrint() {
        System.out.print("  ");
    }

    private static void sharpPrint() {
        System.out.print("# ");
    }

    public static void nextLine() {
        System.out.println();
    }

    public static void drowSharpSquare(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                sharpPrint();
            }
            nextLine();
        }
        /*
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        */
    }

    public static void drowVariantA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                sharpPrint();
            }
            nextLine();
        }
        /*
        #
        # #
        # # #
        # # # #
        # # # # #
        */
    }

    public static void drowVariantB(int size) {
        for (int row = size; row >= 1; row--) {
            for (int col = row; col >= 1; col--) {
                sharpPrint();
            }
            nextLine();
        }
        /*
        # # # # #
        # # # #
        # # #
        # #
        #
        */
    }

    public static void drowVariantC(int size) {
        for (int row = size, space = 0; row >= 1; row--, space++) {
            for (int i = 0; i < space; i++) {
                spacePrint();
            }

            for (int col = row; col >= 1; col--) {
                sharpPrint();
            }
            nextLine();
        }
        /*
        # # # # #
          # # # #
            # # #
              # #
                #
        */
    }

    public static void drowVariantD(int size) {
        for (int row = 1, space = size; row <= size; row++, space--) {
            for (int i = 0; i < space - 1; i++) {
                spacePrint();
            }

            for (int col = row; col >= 1; col--) {
                sharpPrint();
            }
            nextLine();
        }
        /*
                #
              # #
            # # #
          # # # #
        # # # # #
        */
    }

    public static void drowVariantE(int size) {
        for (int row = 1; row <= size; row++) {
            if (row > 1 && row < size) {
                for (int i = 0; i <= size; i++) {
                    if (i == 0 || i == size - 2) {
                        sharpPrint();
                    }
                    spacePrint();
                }
            } else
                for (int col = 0; col <= size - 1; col++) {
                    sharpPrint();
                }
            nextLine();
        }
        /*
        # # # # #
        #       #
        #       #
        #       #
        # # # # #
        */
    }

    public static void drowVariantF(int size) {
        for (int row = 0; row <= size - 1; row++) {
            if (row > 0 && row < size - 1) {
                for (int col = 0; col <= size - 1; col++) {
                    if (col != row) {
                        spacePrint();
                    } else {
                        sharpPrint();
                    }
                }
            } else
                for (int col = 0; col <= size - 1; col++) {
                    sharpPrint();
                }
            nextLine();
        }
        /*
        # # # # #
          #
            #
              #
        # # # # #
        */
    }

    public static void drowVariantG(int size) {
        for (int row = 0; row <= size - 1; row++) {
            if (row > 0 && row < size - 1) {
                for (int col = size - 1; col >= 0; col--) {
                    if (col != row) {
                        spacePrint();
                    } else {
                        sharpPrint();
                    }
                }
            } else
                for (int col = 0; col <= size - 1; col++) {
                    sharpPrint();
                }
            nextLine();
        }
        /*
        # # # # # # # #
                    #
                  #
                #
              #
            #
          #
        # # # # # # # #
        */
    }

    public static void drowVariantH(int size) {
        for (int row = 0; row <= size - 1; row++) {
            if (row > 0 && row < size - 1) {
                for (int col = 0; col <= size - 1; col++) {
                    if (col != row && col != (size - 1) - row) {
                        spacePrint();
                    } else {
                        sharpPrint();
                    }
                }
            } else
                for (int col = 0; col <= size - 1; col++) {
                    sharpPrint();
                }
            nextLine();
        }
        /*
        # # # # # # #
          #       #
            #   #
              #
            #   #
          #       #
        # # # # # # #
         */
    }

    public static void drowVariantI(int size) {
        for (int row = 0; row <= size - 1; row++) {
            if (row > 0 && row < size - 1) {
                for (int col = 0; col <= size - 1; col++) {
                    if ((col == 0 || col == size - 1) || !(col != row && col != (size - 1) - row)) {
                        sharpPrint();
                    } else {
                        spacePrint();
                    }
                }
            } else
                for (int col = 0; col <= size - 1; col++) {
                    sharpPrint();
                }
            nextLine();
        }
        /*
        # # # # # # #
        # #       # #
        #   #   #   #
        #     #     #
        #   #   #   #
        # #       # #
        # # # # # # #
        */
    }

}
