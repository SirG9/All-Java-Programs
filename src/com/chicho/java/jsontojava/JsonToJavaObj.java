package com.chicho.java.jsontojava;

import com.chicho.json.CBPMarineLubeChartIntJSONResponseDTO;
import com.chicho.json.CBPMarineLubeChartIntJSONResultDTO;
import com.google.gson.Gson;

public class JsonToJavaObj {

	public static void main(String[] args) {
		String restResp = "{'IsSuccess': true,'Result': [{'IMO': 9118630,'MPIds': '219000,219010'},{'IMO': 7827029,'MPIds': '219574'}]}";
		CBPMarineLubeChartIntJSONResponseDTO jsonResponse = new Gson().fromJson(restResp,
				CBPMarineLubeChartIntJSONResponseDTO.class);
		System.out.println(jsonResponse.toString());

		for (CBPMarineLubeChartIntJSONResultDTO listOfProd : jsonResponse.getResult()) {
			listOfProd.setMPIdsList(listOfProd.getMPIds().split(","));
		}
	}
}
