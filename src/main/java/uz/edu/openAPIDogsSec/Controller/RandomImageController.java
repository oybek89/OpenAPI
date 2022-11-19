package uz.edu.openAPIDogsSec.Controller;

import uz.edu.openAPIDogsSec.Servise.RandomImageService;
import uz.edu.openAPIDogsSec.dto.RandomImage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RandomImageController {
    private RandomImageService randomImageService;

    @GetMapping("/random")
    public String getRandom(){
        return randomImageService.getRandomImage();
    }
}
