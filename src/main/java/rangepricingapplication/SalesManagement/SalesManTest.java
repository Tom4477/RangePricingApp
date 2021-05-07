package rangepricingapplication.SalesManagement;

import com.github.javafaker.Faker;
import rangepricingapplication.OrderManagement.Order;
import rangepricingapplication.OrderManagement.OrderItem;
import rangepricingapplication.Personnel.EmployeeProfile;
import rangepricingapplication.Personnel.Person;
import rangepricingapplication.ProductManagement.Product;

import java.util.Random;

public class SalesManTest {

    static int NumOfItem=50;
    public static void main(String[] args) {

        SalesManTest salesManTest=new SalesManTest();

        salesManTest.genSalesManReport();
    }
   public void genSalesManReport()
    {
        Faker faker = new Faker();
        Random random=new Random();
        SalesReport salesReport=new SalesReport();
        Order order=new Order();

        for(int i=1;i<=NumOfItem;i++)
        {
            Product testPro=new Product(10+random.nextInt(10),30+random.nextInt(10),20+random.nextInt(10));
            OrderItem orderItem=order.newOrderItem(testPro,20+random.nextInt(10),random.nextInt(20));
            EmployeeProfile employee4Sale=new EmployeeProfile(new Person(faker.name().fullName()));
            SalesManProfile salesMan=new SalesManProfile(employee4Sale);
            salesMan.addProduct4Sale(orderItem);
            SalesSummary ssSummary =new SalesSummary(salesMan);
            salesReport.addSalesSummary(ssSummary);
        }

        System.out.println("-----------------------------sales volume--------------------------------------");
       SalesSummary[] salesSummaries= salesReport.genTop10SalesBySV();
       for(SalesSummary summary:salesSummaries)
           System.out.println(summary.salesvolume+" /// "+summary.salesMan.employee.getPerson().getPersonId());

        System.out.println("-----------------------------price performance--------------------------------------");
        SalesSummary[] salesSummariesPP= salesReport.genTop10SalesByPP();
        for(SalesSummary summary:salesSummariesPP)
            System.out.println(summary.pricePerformance+" /// "+summary.salesMan.employee.getPerson().getPersonId());

    }
}
