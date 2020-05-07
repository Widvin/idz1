package by.gsu.pms;
import java.util.*;
import by.gsu.pms.Stock;

public class Sorter {
    public static Stock[] get_sorted_stock_by_values(Stock[] array){
       Arrays.sort(array, Comparator.comparing(Stock::getcost));
         return array;
       }

    public static Stock[] get_sorted_Stocks_by_names(Stock[] array){
        Arrays.sort(array, Comparator.comparing(Stock::getName));
           return array;
         }
        }



