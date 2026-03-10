package com.busanit501.ljj980413springbootorm.service;


import com.busanit501.ljj980413springbootorm.dto.BoardDTO;
import com.busanit501.ljj980413springbootorm.dto.BoardListReplyCountDTO;
import com.busanit501.ljj980413springbootorm.dto.PageRequestDTO;
import com.busanit501.ljj980413springbootorm.dto.PageResponseDTO;

public interface BoardService {

    Long register(BoardDTO boardDTO);
    BoardDTO readOne(Long bno);
    void modify(BoardDTO boardDTO);
    void remove(Long bno);
    PageResponseDTO<BoardDTO> list(PageRequestDTO pageRequestDTO);

    // 전체 목록 +  댓글 갯수 포함
    PageResponseDTO<BoardListReplyCountDTO> listWithReplyCount(PageRequestDTO pageRequestDTO);
}
