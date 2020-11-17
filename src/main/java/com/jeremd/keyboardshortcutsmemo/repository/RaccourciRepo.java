package com.jeremd.keyboardshortcutsmemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jeremd.keyboardshortcutsmemo.entity.Programme;
import com.jeremd.keyboardshortcutsmemo.entity.Raccourci;

@Repository
public interface RaccourciRepo extends JpaRepository<Raccourci, String> {
	
	@Query("SELECT r FROM Raccourci r WHERE r.programme = :programme")
	List<Raccourci> findByProgramme(@Param("programme") Programme programme);
	
}
