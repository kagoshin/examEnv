package atmarkitExam;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class SalesData {
    private Date date;
    private int salesAmount;
    private String location;
    private static final int[] SALES_AMOUNT = { 1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000 };
    private static final String[] LOCATION = { "東京", "千葉", "埼玉", "神奈川", "茨城", "栃木", "群馬" };

    public SalesData(Date date, int salesAmount, String location) {
        this.date = date;
        this.salesAmount = salesAmount;
        this.location = location;
    }

    public static List<SalesData> createSalesData() {
        List<SalesData> salesDataList = new ArrayList<>();

        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(2014, 1, 1);

        for (int i = 0; i < 1000; i++) {
            Date salesDate = calendar.getTime();
            for (int salesAmount : SALES_AMOUNT) {
                for (String location : LOCATION) {
                    salesDataList.add(new SalesData(salesDate, salesAmount, location));
                }
            }
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        return salesDataList;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(int salesAmount) {
        this.salesAmount = salesAmount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
