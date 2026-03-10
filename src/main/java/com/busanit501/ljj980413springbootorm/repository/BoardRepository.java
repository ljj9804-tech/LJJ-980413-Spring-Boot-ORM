package com.busanit501.ljj980413springbootorm.repository;


import com.busanit501.ljj980413springbootorm.domain.Board;
import com.busanit501.ljj980413springbootorm.repository.search.BoardSearch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardSearch {
// 아무 기능이 없지만, 우리는 기본 기능을 이용해서, CRUD 를 테스트 할수 있다.

}
