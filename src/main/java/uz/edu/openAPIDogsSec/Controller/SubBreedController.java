package uz.edu.openAPIDogsSec.Controller;

import uz.edu.openAPIDogsSec.Servise.SubBreedServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SubBreedController {


    @Autowired
    private SubBreedServise subBreedServise;

    @GetMapping("/all/subbreed")
    public String getAllBreed(){
        return subBreedServise.getAllBreed();
    }
}
