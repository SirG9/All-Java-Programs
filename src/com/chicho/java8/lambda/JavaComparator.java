package com.chicho.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaComparator {

	public static void main(String[] args) {
		List<sellableUnitDTOList> sellableUnitDTO = Arrays.asList(new sellableUnitDTOList(2508D),
				new sellableUnitDTOList(1234D), new sellableUnitDTOList(2019D));

		Comparator<sellableUnitDTOList> specialComparator = Comparator.comparing(sellableUnitDTOList::getSortOrder);

		Collections.sort(sellableUnitDTO, specialComparator);

		sellableUnitDTO.stream().map(p -> p.getSortOrder()).forEach(System.out::println);
		;
	}

	static class sellableUnitDTOList {
		Double sortOrder;

		sellableUnitDTOList(Double sortOrder) {
			this.sortOrder = sortOrder;
		}

		public Double getSortOrder() {
			return sortOrder;
		}

		public void setSortOrder(Double sortOrder) {
			this.sortOrder = sortOrder;
		}

	}

}
