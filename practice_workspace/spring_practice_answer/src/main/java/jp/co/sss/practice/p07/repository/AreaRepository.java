package jp.co.sss.practice.p07.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.sss.practice.p07.entity.Area;

public interface AreaRepository extends JpaRepository<Area, Integer> {

	// Practice7-02
	List<Area> findAllByOrderByAreaId();
}
