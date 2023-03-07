package productStore.product.meatProdukt;

import productStore.product.Product;

import java.time.LocalDate;

public abstract class MeatProduct extends Product {
    public MeatProduct(int id, String name, String companyName, LocalDate date) {
        super ( id, name, companyName, date );
    }

    @Override
    public String toString() {
        return "Product " +
              "id " + getName ()+
              " companyName " + getCompanyName ()+
              " date " + getDate ();

    }
}
