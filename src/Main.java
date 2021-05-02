import Abstract.CustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new NeroCustomerManager();
        LocalDate date1 = LocalDate.of(2001,2,28);
        customerManager.save(new Customer(1,"yusuf","sertbolat", date1,"12345678901"));


    }
}
