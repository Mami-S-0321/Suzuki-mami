package jp.co.sss.practice.p06.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.sss.practice.p06.entity.FruitsSeason;

public interface FruitsSeasonRepository extends JpaRepository<FruitsSeason,Integer>{

	// Practice6-02
	List<FruitsSeason> findAllByOrderBySeasonMonth();

	// Practice6-03
	List<FruitsSeason> findAllByOrderByFruitId();

	// Practice6-04
	List<FruitsSeason> findBySeasonMonthOrderByFruitId(Integer season);


}
