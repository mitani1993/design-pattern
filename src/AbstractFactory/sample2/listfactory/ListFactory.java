package AbstractFactory.sample2.listfactory;

import AbstractFactory.sample2.factory.Factory;
import AbstractFactory.sample2.factory.Link;
import AbstractFactory.sample2.factory.Page;
import AbstractFactory.sample2.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
