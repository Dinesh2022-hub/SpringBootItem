package com.ty.springBoot_Item.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.springBoot_Item.dto.Item;
import com.ty.springBoot_Item.repo.ItemRepo;

@Repository
public class ItemDao {

	@Autowired
	private ItemRepo repo;

	public Item saveItem(Item item) {
		return repo.save(item);

	}

	public Item updateItem(int id, Item item) throws Exception 
	{
		Item item2 = repo.findById(id).get();
		if (item2 != null) {
			item2.setCost(item.getCost());
			item2.setName(item.getName());
			return repo.save(item2);

	} else
	{
			throw new Exception("Item does not exists with id:"+item.getId());
		}

	}

	public Item deleteItem(int id) {

		Item item = repo.findById(id).get();
		repo.deleteById(id);
		return item;
	}

	public Item getItemById(int id) {
		return repo.findById(id).get();

	}

	public List<Item> getAllItems() {
		return repo.findAll();
	}
}
