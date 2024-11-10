package com.ty.springBoot_Item.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.springBoot_Item.dao.ItemDao;
import com.ty.springBoot_Item.dto.Item;

@RestController
public class ItemController {

	@Autowired
	private ItemDao dao;

	@PostMapping("/saveItem")
	public Item saveItem(@RequestBody Item item) {
		return dao.saveItem(item);

	}

	@PutMapping("/updateItem")
	public Item updateItem(@RequestParam int id, @RequestBody Item item) throws Exception {
		return dao.updateItem(id, item);

	}

	@DeleteMapping("/deleteItem")
	public Item deleteItem(@RequestParam int id) {
		return dao.deleteItem(id);

	}

	@GetMapping("/getItemById")

	public Item getItemById(@RequestParam int id) {
		return dao.getItemById(id);
	}

	@GetMapping("/getAllItems")

	public List<Item> getAllItems() {

		return dao.getAllItems();

	}

}
