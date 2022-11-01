package org.zerock.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.board.BoardDto;
import org.zerock.mapper.board.BoardMapper;

@Service
public class BoardSerivce {

	@Autowired
	private BoardMapper mapper;
	
	public int register(BoardDto board) {
		return mapper.insert(board);
	}

	public List<BoardDto> listBoard(int page) {
		int records = 10;
		int offset = (page - 1) * records;
		
		int countAll = mapper.countAll(); // SELECT Count(*) FROM Board
		
		return mapper.list(offset, records);
	}

	public BoardDto get(int id) {
		// TODO Auto-generated method stub
		return mapper.select(id);
	}

	public int update(BoardDto board) {
		
		return mapper.update(board);	
	}

	public int remove(int id) {
		return mapper.delete(id);
	}
	
}





