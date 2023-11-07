package AbstractFactory.sample1.divfactory;

import AbstractFactory.sample1.factory.Factory;
import AbstractFactory.sample1.factory.Link;
import AbstractFactory.sample1.factory.Page;
import AbstractFactory.sample1.factory.Tray;

public class DivFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new DivLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new DivTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new DivPage(title, author);
    }
}
