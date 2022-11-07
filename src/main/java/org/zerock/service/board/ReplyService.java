package org.zerock.service.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.board.ReplyDto;
import org.zerock.mapper.board.ReplyMapper;

@Service
public class ReplyService {
	
	@Autowired
	private ReplyMapper mapper;

	public int addReply(ReplyDto reply) {
		return mapper.insert(reply);
	}

}
