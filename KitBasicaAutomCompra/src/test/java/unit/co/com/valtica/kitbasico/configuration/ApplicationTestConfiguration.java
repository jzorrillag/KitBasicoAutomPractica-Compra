package unit.co.com.valtica.kitbasico.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class ApplicationTestConfiguration {
	
//	@Bean
//    @Primary
//    public AfiliadosRepository afiliadosRepository() {
//        return Mockito.mock(AfiliadosRepository.class);
//    }

}
