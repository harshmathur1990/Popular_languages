package lang;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@ComponentScan
@PropertySource(value = { "classpath:application.properties" })
@Import(RepositoryRestMvcConfiguration.class)
@EnableAutoConfiguration
public class Application extends RepositoryRestMvcConfiguration {
	
	@Override
	  protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
	    super.configureRepositoryRestConfiguration(config);
	    try {
	      config.setBaseUri(new URI("/app"));
	    } catch (URISyntaxException e) {
	      e.printStackTrace();
	    }
	  }

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        
        //LanguagePopularController repository = context.getBean(LanguagePopularController.class);
        
       // repository.save(new LangPopular("C",10000));
        //repository.save(new LangPopular("JAVA", 1000));
        //repository.save(new LangPopular("Python",100));
        
        /*List<LangPopular> lang = repository.getAll();
        
        for (LangPopular langP : lang) {
        	System.out.println(langP);
        }*/
    }
}
