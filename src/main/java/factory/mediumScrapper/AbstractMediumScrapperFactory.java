package factory.mediumScrapper;

import com.gargoylesoftware.htmlunit.WebClient;
import implementations.scrappers.AbstractScrapper;

public abstract class AbstractMediumScrapperFactory extends AbstractScrapper implements IMediumScrapperFactory {

    public AbstractMediumScrapperFactory(WebClient webClient) {
        super(webClient);
    }
}
