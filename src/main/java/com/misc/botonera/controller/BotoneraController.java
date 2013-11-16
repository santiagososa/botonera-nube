package com.misc.botonera.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.logging.Logger;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/botonera")
public class BotoneraController {

	private final String SOUND_DIRECTORY = "/static/sounds";

	private static final Logger logger = Logger
			.getLogger(BotoneraController.class.getName());

	@Autowired
	ServletContext context;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView renderBotonera(HttpServletRequest request,
			HttpServletResponse response) {

		ModelAndView mov = new ModelAndView("main");
		Set<String> soundPathToFileList = context.getResourcePaths(SOUND_DIRECTORY);
		ArrayList<String> soundFileList = new ArrayList<String>();


		Iterator<String> iterator = soundPathToFileList.iterator();
		while (iterator.hasNext()) {
			String pathToFile = iterator.next();
			if(pathToFile.contains("m4a")){
				String fileName = new StringTokenizer(pathToFile.substring(
						SOUND_DIRECTORY.length() + 1, pathToFile.length()), ".")
						.nextToken();
				soundFileList.add(fileName);
			}
		}
		
		mov.addObject("sounds", soundFileList);
		return mov;
	}

}
