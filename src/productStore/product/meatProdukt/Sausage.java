package productStore.product.meatProdukt;

import productStore.product.Product;

import java.time.LocalDate;

public class Sausage extends MeatProduct {
    public Sausage(int id, String name, String companyName, LocalDate date) {
        super ( id, name, companyName, date );
    }
}
