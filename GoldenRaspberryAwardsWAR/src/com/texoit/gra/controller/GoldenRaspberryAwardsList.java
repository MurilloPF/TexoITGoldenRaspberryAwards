package com.texoit.gra.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.texoit.gra.service.MovieService;
import com.texoit.gra.vo.MovieVo;

public class GoldenRaspberryAwardsList extends MainServlet {
	private static final long serialVersionUID = 1L;

	public void doProcess(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		MovieService service = MovieService.getInstance();
		
		Collection<MovieVo> lista = service.listarTabela(); 
        
        req.setAttribute("lista", lista);
        
	    callPage(req, resp, "/listar.jsp");	    
	  }
}
