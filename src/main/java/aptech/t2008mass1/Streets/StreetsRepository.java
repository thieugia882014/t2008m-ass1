package aptech.t2008mass1.Streets;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StreetsRepository extends JpaRepository<Streets,Integer> {
    @Query(value = "select * from streets s where s.name like %:name% and s.district_id=:distinctId",nativeQuery = true)
    List<Streets> findByInfo(@Param("name") String name, @Param("distinctId") int distinctId);

    @Query(value = "select * from streets s where s.name like %:name%",nativeQuery = true)
    List<Streets> findByInfo(@Param("name") String name);
}
