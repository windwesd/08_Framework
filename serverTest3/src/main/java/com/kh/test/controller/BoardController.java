package com.kh.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.kh.test.dto.Board;

import jakarta.servlet.http.HttpServletRequest;

@Controller

public class BoardController {

	@GetMapping("/board/select")
	public String selectBoard(HttpServletRequest req, @ModelAttribute Board board) {
		req.setAttribute("boardTitle", board.getBoardTitle());
		req.setAttribute("boardContent", board.getBoardContent());
		return "board/select";
	}
	
}