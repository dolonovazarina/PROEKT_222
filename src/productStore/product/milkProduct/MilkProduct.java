package productStore.product.milkProduct;

import productStore.product.Product;

import java.time.LocalDate;

public abstract class MilkProduct extends Product {
    public MilkProduct(int id, String name, String companyName, LocalDate date) {
        super ( id, name, companyName, date );
    }

    @Override
    public String toString() {
        return "Product " +
                "id " + getName ( ) +
                " companyName " + getCompanyName ( ) +
                " date " + getDate ( );

    }
}
