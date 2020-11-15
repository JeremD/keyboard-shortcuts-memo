package com.jeremd.keyboardshortcutsmemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jeremd.keyboardshortcutsmemo.entity.Programme;

@Repository
public interface ProgrammeRepo extends JpaRepository<Programme, Integer> {

}
