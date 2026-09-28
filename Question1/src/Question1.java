public class Question1 {
    public static void main(String[] args) {

        String[] Cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        int[][] sales = {{1000, 2000, 3000},{2000, 3000, 4000},{1500, 1100, 1200}};



        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------------------------------------------------------------");

        System.out.printf("%-25s%-16s%-16s%-16s%n"," ", "PS5", "XBOX", "SWITCH");

        for (int row = 0; row < Cities.length; row ++) {
            System.out.printf("%-25s", Cities[row]);

            for (int clm = 0; clm < sales[row].length; clm ++) {
                System.out.printf("%-16d", sales[row][clm]);
            }


            System.out.println();
        }

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("----------------------------------------------------------------------------------");


        int mostSales = 0;
        int maxIndex = 0;

        for (int row = 0; row < Cities.length; row ++) {
            int total = 0;
            for (int clm = 0; clm < sales[row].length; clm ++ ) {
                total += sales[row][clm];

                if (total > mostSales){
                    mostSales = total;
                    maxIndex = row;
                }

            }
            System.out.printf("%-20s%-16d", Cities[row], total);
            System.out.println();

        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + Cities[maxIndex]);
        System.out.println("----------------------------------------------------------------------------------");



    }

}
