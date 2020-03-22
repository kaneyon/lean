package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DemoController {

	private List<Name> names = new ArrayList<>();

	@GetMapping(value = "/main")
	public String show(Model model) {
		model.addAttribute("names", names.toArray());    // 表示メッセージ
		return "main";
	}

	@GetMapping(value = "/input")
	public String input(Model model) {
		model.addAttribute("name", new Name());    // 表示メッセージ
		return "input";
	}

	@PostMapping(value="/check")
    public String check(@ModelAttribute("name") Name name) {
		name.setNameNumn(name.getName().length());
		return "name";
	}

	@PostMapping(value = "/confirm")
	public String show(@ModelAttribute("name") Name name) {
		names.add(name);
		return "finished";
	}
}
