package productStore.product.wheatProduct;

import productStore.product.Product;

import java.time.LocalDate;

public class Penne extends WheatProduct {
    public Penne(int id, String name, String companyName, LocalDate date) {
        super ( id, name, companyName, date );
    }
}
