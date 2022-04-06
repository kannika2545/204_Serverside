package sit.int204.classicmodelsservice;

import org.modelmapper.ModelMapper;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sit.int204.classicmodelsservice.properties.FileStorageProperties;
import sit.int204.classicmodelsservice.utils.ListMapper;

@EnableConfigurationProperties({
        FileStorageProperties.class
})

@Configuration
public class ApplicationConfig {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public ListMapper listMapper() {
        return ListMapper.getInstance();
    }
}
