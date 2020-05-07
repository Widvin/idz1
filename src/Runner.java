import by.gsu.pms.Stock;
import by.gsu.pms.Sorter;

public class Runner {

    public static void main(String[] args) {

        Stock[] stocks = new Stock[10];
        stocks[0] = new Stock("chair", 15, true);
        stocks[1] = new Stock("bed", 40, false);
        stocks[2] = new Stock("closet", 73, true);
        stocks[3] = new Stock("sofa", 59, true);
        stocks[4] = new Stock("table", 38, false);
        stocks[5] = new Stock("mirror", 12, false);
        stocks[6] = new Stock("armchair", 165, true);
        stocks[7] = new Stock("sideboard", 97, true);
        stocks[8] = new Stock("dressing table", 91, false);
        stocks[9] = new Stock();

        for (Stock Stock : stocks) {
            if (Stock != null) {
                Stock.show();
            }
        }

        int countavailability=0;
        for (int i = 0; i < stocks.length; i++) {

           if (stocks[i].getavailability()== true){
               countavailability++;
           }

            }
        System.out.print("Count in availability: " +countavailability);

        int sum=0;
        for (int j=0; j<stocks.length; j++){
            sum = sum + stocks[j].getcost();
        }
        System.out.println("   The total cost is: " + sum);
    }


    }



