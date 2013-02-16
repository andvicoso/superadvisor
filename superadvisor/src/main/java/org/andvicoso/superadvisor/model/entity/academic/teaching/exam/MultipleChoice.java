package org.andvicoso.superadvisor.model.entity.academic.teaching.exam;

import java.util.Map;

public class MultipleChoice extends Question {
	private Map<String, Boolean> items;

	public Map<String, Boolean> getItems() {
		return items;
	}

	public void setItems(Map<String, Boolean> items) {
		this.items = items;
	}

}
