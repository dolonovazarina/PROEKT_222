package productStore.product.meatProdukt;

import productStore.product.Product;

import java.time.LocalDate;

public class Fish extends MeatProduct {
    public Fish(int id, String name, String companyName, LocalDate date) {
        super ( id, name, companyName, date );
    }
}
