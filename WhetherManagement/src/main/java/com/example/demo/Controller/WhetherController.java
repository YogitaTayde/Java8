package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.WhetherService;
import com.example.demo.entity.Whether;

@RestController
public class WhetherController {
	@Autowired
	WhetherService ws;
	@PostMapping("Whether")
	public String addWhether(@RequestBody Whether w) {
		ws.saveWhether(w);
		return"whether added";
}
	@GetMapping("Whether/{id}")
public Whether  getWhetherDetails(@PathVariable int id) {
	return ws.getWhetherDetails(id);
}
	@GetMapping("Whethers")
	public List<Whether> getAll() {
		return  ws.getall();
	}
}
