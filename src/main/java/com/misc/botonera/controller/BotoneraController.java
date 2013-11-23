package com.misc.botonera.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class BotoneraController {

	@Autowired
	ServletContext context;
	
	private final Map<String, String> buttonList;
	
	public BotoneraController(){
		buttonList = new HashMap<String, String>();
		buttonList.put("aqui_o", "lombo");
		buttonList.put("ay_soy_un_amor", "dani");
		buttonList.put("callate_la_boca", "fonso");
		buttonList.put("es_una_caca", "dani");
		buttonList.put("dddd", "fonso");
		buttonList.put("internet", "lau");
		buttonList.put("los_adwords", "sulz");
		buttonList.put("magique", "fonso");
		buttonList.put("mmmm", "fonso");
		buttonList.put("nos_calmamos", "lau");
		buttonList.put("nuvem_shop_mateus", "fonso");
		buttonList.put("produtos", "fonso");
		buttonList.put("sos_joda", "lombo");
		buttonList.put("te_balean", "sulz");
		buttonList.put("te_podes_calmar", "lau");
		buttonList.put("toy_turbado", "sosi");
		buttonList.put("una_paja", "fonso");
		buttonList.put("what", "dani");
	}
	

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView renderBotonera(HttpServletRequest request,
			HttpServletResponse response) {

		ModelAndView mov = new ModelAndView("main");
		mov.addObject("sounds", buttonList);
		return mov;
		
	}

	@RequestMapping(value = "/{soundId}", method = RequestMethod.GET)
	public ModelAndView singleSound(@PathVariable String soundId) {

		ModelAndView mov = null;
		String curatedSoundId = soundId.replace("-", "_");
		
		if(buttonList.containsKey(curatedSoundId)){
			mov = new ModelAndView("single-sound");
			mov.addObject("sound", curatedSoundId);
		}else{
			mov = new ModelAndView("404");
		}
		
		return mov;

	}

}


	





