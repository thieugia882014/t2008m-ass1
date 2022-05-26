package aptech.t2008mass1.Streets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StreetsService {
    @Autowired
    private StreetsRepository streetRepository;
    public List<Streets> findAll(String name, int districtId){
        if (districtId==0){
            return streetRepository.findByInfo(name);
        }
        return streetRepository.findByInfo(name,districtId);
    }
    public List<Streets> findAll(){
        return streetRepository.findAll();
    }
    public Streets save(Streets street){
        return streetRepository.save(street);
    }
    public Optional<?> findById(int id){
        return streetRepository.findById(id);
    }
    public List<Streets> saveAll(List<Streets> districts){
        return streetRepository.saveAll(districts);
    }
}
