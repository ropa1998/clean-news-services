package factory.mediumScrapper;

import com.gargoylesoftware.htmlunit.WebClient;
import implementations.factory.webclient.WebClientFactory;
import implementations.scrappers.medium.IMediumScrapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class IMediumScrapperFactoryTest {

    WebClient webClient;

    public IMediumScrapperFactoryTest() {
        WebClientFactory webClientFactory = new WebClientFactory();
        webClient = webClientFactory.getBasicWebClient();
    }


    @Test
    public void Pagina12RSSScrapperWorks() {
        IMediumScrapperFactory mediumScrapperFactory = new RSSMediumScrapperFactory(webClient);
        IMediumScrapper pagina12Scrapper = mediumScrapperFactory.getPagina12Scrapper();
        pagina12Scrapper.run();
        assertFalse(pagina12Scrapper.getArticles().isEmpty());
    }

    @Test
    public void LaNacionRSSScrapperWorks() {
        IMediumScrapperFactory mediumScrapperFactory = new RSSMediumScrapperFactory(webClient);
        IMediumScrapper laNacionScrapper = mediumScrapperFactory.getLaNacionScrapper();
        laNacionScrapper.run();
        assertFalse(laNacionScrapper.getArticles().isEmpty());
    }

    @Test
    public void NYTAmericasRSSScrapperWorks() {
        IMediumScrapperFactory mediumScrapperFactory = new RSSMediumScrapperFactory(webClient);
        IMediumScrapper nytAmericasMediumScrapper = mediumScrapperFactory.getNYTAmericasScrapper();
        nytAmericasMediumScrapper.run();
        assertFalse(nytAmericasMediumScrapper.getArticles().isEmpty());
    }

    @Test
    public void InfobaeRSSScrapperWorks() {
        IMediumScrapperFactory mediumScrapperFactory = new RSSMediumScrapperFactory(webClient);
        IMediumScrapper ambitoScrapper = mediumScrapperFactory.getAmbitoScrapper();
        ambitoScrapper.run();
        assertFalse(ambitoScrapper.getArticles().isEmpty());
    }

    @Test
    public void VoxRSSScrapperWorks() {
        IMediumScrapperFactory mediumScrapperFactory = new RSSMediumScrapperFactory(webClient);
        IMediumScrapper voxScrapper = mediumScrapperFactory.getVoxScrapper();
        voxScrapper.run();
        assertFalse(voxScrapper.getArticles().isEmpty());
    }

    @Test
    public void WallStreetJournalWorks() {
        IMediumScrapperFactory mediumScrapperFactory = new RSSMediumScrapperFactory(webClient);
        IMediumScrapper wallStreetJournalScrapper = mediumScrapperFactory.getWallStreetJournalScrapper();
        wallStreetJournalScrapper.run();
        assertFalse(wallStreetJournalScrapper.getArticles().isEmpty());
    }



}