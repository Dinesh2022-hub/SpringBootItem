package com.ty.springBoot_Item.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.springBoot_Item.dto.Item;
@Repository
public interface ItemRepo extends JpaRepository<Item, Integer> {

}
