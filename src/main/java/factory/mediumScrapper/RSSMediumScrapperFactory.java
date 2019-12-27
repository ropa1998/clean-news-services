package factory.mediumScrapper;

import com.gargoylesoftware.htmlunit.WebClient;
import implementations.core.medium.Medium;
import implementations.scrappers.medium.IMediumScrapper;
import implementations.scrappers.medium.MediumScrapper;
import implementations.scrappers.medium.article.BasicAbstractArticleScrapper;
import implementations.scrappers.medium.title.RSSTitleScrapper;


public class RSSMediumScrapperFactory extends AbstractMediumScrapperFactory {


    private static final String AMBITO_TITLE = "Ambito Finaciero";
    private static final String AMBITO_URL = "https://www.ambito.com/rss/ultimas-noticias.xml";
    private static final String AMBITO_KEY_CSS = "item";


    private static final String PAGINA12_TITLE = "Pagina12";
    private static final String PAGINA12_URL = "https://www.pagina12.com.ar/rss/portada";
    private static final String PAGINA12_KEY_CSS = "item";

    private static final String LANACION_TITLE = "La Nacion";
    private static final String LANACION_URL = "http://contenidos.lanacion.com.ar/herramientas/rss/origen=2";
    private static final String LANACION_KEY_CSS = "entry";

    private static final String NYT_AMERICAS_TITLE = "NYT Americas";
    private static final String NYT_AMERICAS_URL = "https://rss.nytimes.com/services/xml/rss/nyt/Americas.xml";
    private static final String NYT_AMERICAS_KEY_CSS = "item";

    private static final String VOX_TITLE = "Vox";
    private static final String VOX_URL = "https://www.vox.com/rss/index.xml";
    private static final String VOX_KEY_CSS = "entry";

    private static final String WSJ_TITLE = "Wall Street Journal";
    private static final String WSJ_URL = "https://feeds.a.dj.com/rss/RSSWorldNews.xml";
    private static final String WSJ_KEY_CSS = "item";


    public RSSMediumScrapperFactory(WebClient webClient) {
        super(webClient);
    }

    @Override
    public IMediumScrapper getPagina12Scrapper() {
        return new MediumScrapper(this.webClient, new Medium(PAGINA12_TITLE, PAGINA12_URL, PAGINA12_KEY_CSS), new RSSTitleScrapper(this.webClient), new BasicAbstractArticleScrapper(this.webClient));
    }

    @Override
    public IMediumScrapper getLaNacionScrapper() {
        return new MediumScrapper(this.webClient, new Medium(LANACION_TITLE, LANACION_URL, LANACION_KEY_CSS), new RSSTitleScrapper(this.webClient), new BasicAbstractArticleScrapper(this.webClient));
    }

    @Override
    public IMediumScrapper getNYTAmericasScrapper() {
        return new MediumScrapper(this.webClient, new Medium(NYT_AMERICAS_TITLE, NYT_AMERICAS_URL, NYT_AMERICAS_KEY_CSS), new RSSTitleScrapper(this.webClient), new BasicAbstractArticleScrapper(this.webClient));
    }

    @Override
    public IMediumScrapper getAmbitoScrapper() {
        return new MediumScrapper(this.webClient, new Medium(AMBITO_TITLE, AMBITO_URL, AMBITO_KEY_CSS), new RSSTitleScrapper(this.webClient), new BasicAbstractArticleScrapper(this.webClient));
    }

    @Override
    public IMediumScrapper getVoxScrapper() {
        return new MediumScrapper(this.webClient, new Medium(VOX_TITLE, VOX_URL, VOX_KEY_CSS), new RSSTitleScrapper(this.webClient), new BasicAbstractArticleScrapper(this.webClient));
    }

    @Override
    public IMediumScrapper getWallStreetJournalScrapper() {
        return new MediumScrapper(this.webClient, new Medium(WSJ_TITLE, WSJ_URL, WSJ_KEY_CSS), new RSSTitleScrapper(this.webClient), new BasicAbstractArticleScrapper(this.webClient));
    }


}
