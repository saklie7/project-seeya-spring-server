package com.seeya.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seeya.board.model.Board;
import com.seeya.board.repository.BoardMapper;

@RestController
public class BoardController {
	
	private List<Board> myBoards = new ArrayList<>();

	@Autowired
	private BoardMapper boardMapper;

	@GetMapping("seeya/my-boards")
	public Object getMyBoards() {
		myBoards = boardMapper.getBoardListAll();
		return myBoards;
	}
}
