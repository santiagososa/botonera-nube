package com.misc.botonera.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class BotoneraController {

	@Autowired
	ServletContext context;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView renderBotonera(HttpServletRequest request,
			HttpServletResponse response) {

		ModelAndView mov = new ModelAndView("main");
		List<String> soundFileList = new ArrayList<String>();

		for (FileNames fileName : FileNames.values()) {
			soundFileList.add(fileName.toString());
		}

		mov.addObject("sounds", soundFileList);
		return mov;
	}

}

enum FileNames {
	ay_soy_un_amor, es_una_caca, internet, nos_calmamos, nuvem_shop_mateus, sos_joda, 
	te_podes_calmar, what, aqui_o, dddd, los_adwords, magique, mmmm, te_balean, toy_turbado, una_paja
}
