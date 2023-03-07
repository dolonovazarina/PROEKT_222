package productStore.product.wheatProduct;

import productStore.product.Product;

import java.time.LocalDate;

public abstract class WheatProduct extends Product {
    public WheatProduct(int id, String name, String companyName, LocalDate date) {
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
