package com.OSUMC;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LobsterResource {

	List<Lobster> lobsters = new ArrayList<>();
	@RequestMapping("/getLobstersList")
	public List<Lobster> getLobsterList(){
		Lobster l1 = new Lobster("Reef Lobster", "Clawed", 1);
		Lobster l2 = new Lobster("Squat Lobster", "Clawed", 2);
		Lobster l3 = new Lobster("American Lobster", "Clawed", 3);
		Lobster l4 = new Lobster("European Lobster", "Clawed", 4);
		Lobster l5 = new Lobster("Rock Lobster", "Spiny", 5);
		Lobster l6 = new Lobster("Slipper Lobster", "Spiny", 6);
		Lobster l7 = new Lobster("Furry Lobster", "Spiny", 7);
		lobsters.add(l1);
		lobsters.add(l2);
		lobsters.add(l3);
		lobsters.add(l4);
		lobsters.add(l5);
		lobsters.add(l6);
		lobsters.add(l7);
		return lobsters;
		
	}
	
	@RequestMapping("/getLobsterDetail")
	public Lobster getLobsterDetail(@RequestParam String id){
		Lobster l1 = lobsters.get(Integer.parseInt(id));
		return l1;
		
	}
	@RequestMapping("/AddLobster")
	public String AddLobster(@RequestParam String name, @RequestParam String category){
		Lobster l1 = new Lobster(name, category, this.lobsters.size());
		this.lobsters.add(l1);
		return "Success";
	}
	
	@RequestMapping("/UpdateLobster")
	public String UpdateLobster(@RequestParam String name, @RequestParam String category, @RequestParam String id){
		Lobster l1 = this.getLobsterDetail(id);
		l1.setName(name);
		l1.setCategory(category);
		this.lobsters.set(Integer.parseInt(id), l1);
		return "Success";
	}
	@RequestMapping("/DeleteLobster")
	public String DeleteLobster(@RequestParam String id){
		this.lobsters.remove(Integer.parseInt(id));
		return "Success";
	}
	
}
