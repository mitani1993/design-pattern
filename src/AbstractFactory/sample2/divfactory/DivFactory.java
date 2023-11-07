package AbstractFactory.sample2.divfactory;

import AbstractFactory.sample2.factory.Factory;
import AbstractFactory.sample2.factory.Link;
import AbstractFactory.sample2.factory.Page;
import AbstractFactory.sample2.factory.Tray;

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
