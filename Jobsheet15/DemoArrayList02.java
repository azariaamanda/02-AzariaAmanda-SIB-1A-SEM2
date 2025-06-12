import java.util.ArrayList;
import java.util.Collections;
public class DemoArrayList02 {
    public static void main(String[] args) {
        ArrayList<Customer02> customers = new ArrayList<>();

        Customer02 customer1 = new Customer02(1, "John");
        Customer02 customer2 = new Customer02(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer02(4, "Cica"));

        customers.add(2, new Customer02(100, "Rosa"));

        System.out.println(customers.indexOf(customer2));

        Customer02 customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        ArrayList<Customer02> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer02(201, "Della"));
        newCustomers.add(new Customer02(202, "Victor"));
        newCustomers.add(new Customer02(203, "Sarah"));

        customers.addAll(newCustomers);

        
        for (Customer02 cust : customers) {
            System.out.println(cust.toString());
        }
        
        System.out.println("\nAlternatif Tampilan Lainnya");
        System.out.println(customers);

        System.out.println("\nSorting ke-1");
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collections.sort(daftarSiswa);
        
        System.out.println(daftarSiswa);
        
        System.out.println("\nSorting ke-2");
        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
        System.out.println(customers);
    }
}
