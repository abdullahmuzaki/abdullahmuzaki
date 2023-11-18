public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j <= 4 - i) {
                    System.out.print(" NUSA ");
                } else {
                    System.out.print(" PUTRA ");
                }
            }
            System.out.println();
        }
    }