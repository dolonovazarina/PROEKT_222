package productStore.product.meatProdukt;

import productStore.product.Product;

import java.time.LocalDate;

public class LambMeat extends MeatProduct {
    public LambMeat(int id, String name, String companyName, LocalDate date) {
        super ( id, name, companyName, date );
    }
}
