package pro.sky.WebShopNew.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import java.util.List;

@Service
@SessionScope
public class Basket extends ShopServiceImpl{
    public List <String> basket;

    public Basket(List<String> basket) {
        this.basket = basket;
    }

    public void addBasket(Integer [] id) {
        for (Integer i : id) {
            basket.add(priceList.get(i));
        }
    }
 public void getItem (){
        basket.toString();
 }

    @Override
    public String toString() {
        return "Basket{" + basket +
                '}';
    }
}
