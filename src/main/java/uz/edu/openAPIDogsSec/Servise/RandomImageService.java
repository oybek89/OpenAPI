package uz.edu.openAPIDogsSec.Servise;

import uz.edu.openAPIDogsSec.dto.RandomImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RandomImageService {

    @Value("${dog.api.url}")
    private String subBreedApiUrl;

    @Autowired
    private RestTemplate restTemplate;

    public String getRandomImage(){
        return restTemplate.getForObject("https://dog.ceo/api/breeds/image/random", String.class);
    }
}
