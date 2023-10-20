package com.tibame.dao;

import com.tibame.vo.DeptVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepository extends JpaRepository<DeptVO, Integer> {
}
