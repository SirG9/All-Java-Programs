package com.chicho.json;

import java.util.List;

public class CBPMarineLubeChartIntJSONResponseDTO {
	private String IsSuccess;

	private List<CBPMarineLubeChartIntJSONResultDTO> Result;

	public String toString() {
		return String.format("isSuccess" + getIsSuccess());
	}

	public String getIsSuccess() {
		return IsSuccess;
	}

	public void setIsSuccess(String isSuccess) {
		IsSuccess = isSuccess;
	}

	public List<CBPMarineLubeChartIntJSONResultDTO> getResult() {
		return Result;
	}

	public void setResult(List<CBPMarineLubeChartIntJSONResultDTO> result) {
		Result = result;
	}
}
