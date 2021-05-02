package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerManager;
import Abstract.CustomerService;
import Entities.Customer;

public class StarbucksCustomerManager extends CustomerManager{

    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager()
    {

    }

    public StarbucksCustomerManager(CustomerCheckService customerCheckService)
    {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {
        if (customerCheckService.checkIfRealPerson(customer))
        {
            System.out.println("Kaydedildi");
        }else{
            System.out.println("Geçerli kişi değil");
        }
    }
}
