package lk.ijse.vehicle_service.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
