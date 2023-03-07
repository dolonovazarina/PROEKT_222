import productStore.product.Product;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class StoreService {
    public void addNewproduct(Product product, List<Product> array) {
        if ((Objects.equals ( product.getCompanyName ( ), "Простоквашино" ) || Objects.equals ( product.getCompanyName ( ), "Царыцино" ) || Objects.equals ( product.getCompanyName ( ), "Дарницкий" ))) {
            if (product.getLocalDate ( ).isAfter ( LocalDate.now ( ) )) {
                array.add ( product );

            }
            else System.out.println ( "срогу откон" );
        }
        else System.out.println ( "Мындай компания менен иштебейбиз" );

    }

    public void sortByDiscont(List<Product> massiv, List discontArray) {
        // LocalDate localDate = LocalDate.now().minusDays(7);
        for (Product a : massiv) {

            if (a.getLocalDate ( ).minusDays ( 7 ).isBefore ( LocalDate.now ( ) )) {
                discontArray.add ( a );
            }


        }


    }

    public void loginPassword(String login, String password, List<Product> array) {
        if (login.equals ( "user" ) || password.equals ( "password" )) {

            System.out.println ( "Пароль туура" );
            System.out.println ( Arrays.asList ( array ) );

        }
        else {
            System.out.println ( "Туура эмес" );

        }
    }
}

