package shop.printservice.model.menu;

import java.util.Arrays;
import java.util.List;

public enum MenuData {
    MAIN("Главная", "/",  null),
    ABOUT("О приложении", "/about", null),
    TEST("Тест", null, Arrays.asList(new MenuSubItem("test1", "/test1"),
            new MenuSubItem("test2", "/test2")));

    private String name;
    private String link;
    private List<MenuSubItem> items;

    MenuData(String name, String link, List<MenuSubItem> items) {
        this.name = name;
        this.link = link;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }

    public List<MenuSubItem> getItems() {
        return items;
    }

}
