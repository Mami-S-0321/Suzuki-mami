package jo.co.sss.practice.p7.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jo.co.sss.practice.p7.entity.FruitsArea;

public interface FruitsAreaRepository extends JpaRepository<FruitsArea,Integer> {
	List<FruitsArea> findByFruitId(Integer areaId);

}
