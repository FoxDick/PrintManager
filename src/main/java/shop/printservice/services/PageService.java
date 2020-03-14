package shop.printservice.services;

import org.springframework.stereotype.Service;
import shop.printservice.model.menu.MenuData;

import java.util.Arrays;
import java.util.List;

@Service
public class PageService {
    public List<MenuData> getMenuData() {
         return Arrays.asList(MenuData.values());
    }
}
