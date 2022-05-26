package aptech.t2008mass1.Streets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/address")
public class StreetsApi {
    @Autowired
    private StreetsService addressService;
    @GetMapping
    public ResponseEntity<List<Streets>> getList(@RequestParam(defaultValue = "")String name, @RequestParam(defaultValue = "0")int districtId){
        return ResponseEntity.ok(addressService.findAll(name, districtId));
    }
    @PostMapping
    public ResponseEntity<Streets> save(@RequestBody Streets street){
        return ResponseEntity.ok(addressService.save(street));
    }
}
