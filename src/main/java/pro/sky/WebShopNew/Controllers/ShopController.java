package pro.sky.WebShopNew.Controllers;


import pro.sky.WebShopNew.Services.Basket;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {
    private final Basket basket;
    public ShopController(Basket basket) {
        this.basket = basket;
    }

@GetMapping("/add")
    public String addBasket (@RequestParam Integer [] id ) {
       basket.addBasket(id);
    return "items is added";
}
  @GetMapping("/get")
    public String getBasket () {
       return basket.toString();
    }
}
