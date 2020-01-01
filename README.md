# clean-news-services

This project provides tested and officially maintained scrapping services for all [Clean News](https://github.com/ropa1998/clean-news) projects.

It does not add new logic to the source code, it just provides interfaces and implementations of objects that solve the scrapping process with objects that have working configurations.

## Table of contents

- [Install](#install)
- [Usage](#usage)
- [License](#license)

## Install

First of all you will need to clone the project. Then you will want to build it

```$ gradle shadowJar```

This will build a jar file with all necessary dependencies, which you can find in `clean-news-services/build/libs/clean-news-services-all.jar`

## Usage

You may want to use this jar in a CleanNews project, as for example, the [clean-news-cli](https://github.com/ropa1998/clean-news-cli) app. 

Take the next example, which is part of a test of this project: 

```java
IMediumScrapperFactory mediumScrapperFactory = new RSSMediumScrapperFactory(webClient);
IMediumScrapper wallStreetJournalScrapper = mediumScrapperFactory.getWallStreetJournalScrapper();
wallStreetJournalScrapper.run();
``` 

First of all, we have the ```IMediumScrapperFactory```, which is an interface that force all classes that implement it to be able to implement scrapper for all supported media.

Then, the ```RSSMediumsScrapperFactory``` is the preferred configuration, as it works against RSS instead of the web pages of the media.

Once we have the IMediumScrapper we want we later want to run it. The ```.run()``` populates the scarpers with items, which in this case is ```IArticles```. The execution and instantiation are separated because of how expensive is the execution, so that the user can choose when to make this expensive call. 
  
To understand common usage of the classes you might want to look at other Clean News projects source code or the [test](src/test) folders of this project.   

## License

[GNU General Public License v3.0](LICENSE)
