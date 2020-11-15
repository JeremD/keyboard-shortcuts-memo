package com.jeremd.keyboardshortcutsmemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jeremd.keyboardshortcutsmemo.entity.Raccourci;

@Repository
public interface RaccourciRepo extends JpaRepository<Raccourci, Integer> {

}
