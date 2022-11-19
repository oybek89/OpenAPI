package uz.edu.openAPIDogsSec.Servise;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SubBreedServise {

    @Value("${dog.api.url}")
    private String subBreedApiUrl;

    @Autowired
    private RestTemplate restTemplate;


    public String getAllBreed(){
        String result = restTemplate.getForObject("https://dog.ceo/api/breed/hound/list", String.class); // step -1 .
        return result;
    }
}
