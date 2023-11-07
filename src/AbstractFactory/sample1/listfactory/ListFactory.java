package AbstractFactory.sample1.listfactory;

import AbstractFactory.sample1.factory.Factory;
import AbstractFactory.sample1.factory.Link;
import AbstractFactory.sample1.factory.Page;
import AbstractFactory.sample1.factory.Tray;

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
