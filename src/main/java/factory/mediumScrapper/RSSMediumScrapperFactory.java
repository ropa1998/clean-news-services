package factory.mediumScrapper;

import com.gargoylesoftware.htmlunit.WebClient;
import implementations.core.medium.Medium;
import implementations.scrappers.medium.IMediumScrapper;
import implementations.scrappers.medium.MediumScrapper;
import implementations.scrappers.medium.article.BasicAbstractArticleScrapper;
import implementations.scrappers.medium.title.RSSTitleScrapper;


public class RSSMediumScrapperFactory extends AbstractMediumScrapperFactory {


    private final String PAGINA12RSSTITLE = "Pagina12";
    private final String PAGINA12RSSURL = "https://www.pagina12.com.ar/rss/portada";
    private final String PAGINA12KEYCSS = "item";

    private final String LANACIONRSSTITLE = "La Nacion";
    private final String LANACIONRSSURL = "http://contenidos.lanacion.com.ar/herramientas/rss/origen=2";
    private final String LANACIONKEYCSS = "entry";

    private final String NYTAMERICASTITLE = "NYT Americas";
    private final String NYTAMERICASURL = "https://rss.nytimes.com/services/xml/rss/nyt/Americas.xml";
    private final String NYTAMERICASKEYCSS = "item";


    public RSSMediumScrapperFactory(WebClient webClient) {
        super(webClient);
    }

    @Override
    public IMediumScrapper getPagina12Scrapper() {
        return new MediumScrapper(this.webClient, new Medium(PAGINA12RSSTITLE, PAGINA12RSSURL, PAGINA12KEYCSS), new RSSTitleScrapper(this.webClient), new BasicAbstractArticleScrapper(this.webClient));
    }

    @Override
    public IMediumScrapper getLaNacionScrapper() {
        return new MediumScrapper(this.webClient, new Medium(LANACIONRSSTITLE, LANACIONRSSURL, LANACIONKEYCSS), new RSSTitleScrapper(this.webClient), new BasicAbstractArticleScrapper(this.webClient));
    }

    @Override
    public IMediumScrapper getNYTAmericasScrapper() {
        return new MediumScrapper(this.webClient, new Medium(NYTAMERICASTITLE, NYTAMERICASURL, NYTAMERICASKEYCSS), new RSSTitleScrapper(this.webClient), new BasicAbstractArticleScrapper(this.webClient));
    }


}
