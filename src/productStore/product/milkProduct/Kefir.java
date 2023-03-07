package productStore.product.milkProduct;

import productStore.product.Product;

import java.time.LocalDate;

public class Kefir extends MilkProduct {
    public Kefir(int id, String name, String companyName, LocalDate date) {
        super ( id, name, companyName, date );
    }
}
