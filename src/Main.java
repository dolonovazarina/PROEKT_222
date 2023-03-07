import productStore.product.Product;
import productStore.product.meatProdukt.Fish;
import productStore.product.meatProdukt.LambMeat;
import productStore.product.meatProdukt.Sausage;
import productStore.product.milkProduct.Kefir;
import productStore.product.milkProduct.Milk;
import productStore.product.milkProduct.SourCream;
import productStore.product.wheatProduct.Ban;
import productStore.product.wheatProduct.Penne;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {


        Scanner scan = new Scanner ( System.in );
        String login;
        String password;
        System.out.println ( "Логин жаз : " );
        login = scan.next ( );
        System.out.println ( "Пароль жаз :" );
        password = scan.next ( );
        List<Product> products = new ArrayList<> ( );
        products.add ( new Fish ( 1, "fish1", "Море", LocalDate.of ( 2023, 4, 12 ) ) );
        products.add ( new LambMeat ( 1, "lambMeat", "Царыцино", LocalDate.of ( 2023, 5, 9 ) ) );
        products.add ( new Sausage ( 1, "sausage", "Царыцино", LocalDate.of ( 2023, 4, 6 ) ) );
        products.add ( new Fish ( 2, "fish2", "Море", LocalDate.of ( 2023, 4, 6 ) ) );
        products.add ( new Penne ( 1, "pasta", "Щебекинский", LocalDate.of ( 2023, 3, 8 ) ) );
        products.add ( new Ban ( 1, "ban", "Дарницкий", LocalDate.of ( 2023, 4, 6 ) ) );
        products.add ( new Kefir ( 1, "kefir", "Простоквашино", LocalDate.of ( 2023, 4, 6 ) ) );
        products.add ( new Milk ( 1, "milk", "Простоквашино", LocalDate.of ( 2023, 4, 6 ) ) );
        products.add ( new SourCream ( 1, "sourCream", "Простоквашино", LocalDate.of ( 2023, 4, 6 ) ) );

        Sausage et = new Sausage ( 1, "et", "Царицыно", LocalDate.of ( 2023, 3, 1 ) );
        Milk sut = new Milk ( 1, "молоко", "Простоквашино", LocalDate.of ( 2023, 3, 6 ) );
        Ban nan = new Ban ( 1, "хлеб", "Дарницкий", LocalDate.of ( 2023, 3, 6 ) );
        List<Product> sortArray = new ArrayList<> ( );

        StoreService storeService = new StoreService ( );
        storeService.addNewproduct ( et, products );
        storeService.addNewproduct ( sut, products );
        storeService.addNewproduct ( nan, products );
        storeService.sortByDiscont ( products, sortArray );
        System.out.println ( products );
        System.out.println ( "товар со скидкой" );
        System.out.println ( sortArray );
        storeService.loginPassword ( login, password, products );

    }
}