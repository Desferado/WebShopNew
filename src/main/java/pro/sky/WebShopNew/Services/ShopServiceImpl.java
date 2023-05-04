package pro.sky.WebShopNew.Services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ShopServiceImpl implements ShopService {
public HashMap <Integer, String> priceList = new HashMap<>(Map.of(
        1,"pen",
        2, "ruler",
        3, "eraser",
        4,  "basket",
        5, "pencil",
        6, "marker",
        7, "stepler"));

    @Override
    public void addItem(Integer id, String item) {
       priceList.put(id,item);
    }
}
