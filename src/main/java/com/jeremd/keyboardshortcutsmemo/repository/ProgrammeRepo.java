package com.jeremd.keyboardshortcutsmemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeremd.keyboardshortcutsmemo.entity.Programme;

public interface ProgrammeRepo extends JpaRepository<Programme, Integer> {


}
