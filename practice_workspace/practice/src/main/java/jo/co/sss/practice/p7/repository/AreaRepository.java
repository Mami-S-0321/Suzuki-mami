package jo.co.sss.practice.p7.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jo.co.sss.practice.p7.entity.Area;

public interface AreaRepository extends JpaRepository<Area,Integer>{
	List<Area> findAllByOrderByAreaIdAsc();

}
