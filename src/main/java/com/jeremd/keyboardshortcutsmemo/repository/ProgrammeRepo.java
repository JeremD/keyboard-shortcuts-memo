package com.jeremd.keyboardshortcutsmemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jeremd.keyboardshortcutsmemo.entity.Programme;

@Repository
public interface ProgrammeRepo extends JpaRepository<Programme, String> {

	List<Programme> findByCategorie(String categorie);
	
}
