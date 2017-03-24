package atmarkitExam;

import java.util.List;

public class ExecuteSalesData {

    public static void main(String[] args) {
        List<SalesData> salesDataList = SalesData.createSalesData();

        int maxSalesAmount = salesDataList.stream().filter(salesData -> salesData.getLocation().equals("東京"))
                .mapToInt(salesData -> salesData.getSalesAmount()).max().getAsInt();
        System.out.println("maxSalesAmount = " + String.valueOf(maxSalesAmount));
    }

}
