package com.jeremd.keyboardshortcutsmemo.dto;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.jeremd.keyboardshortcutsmemo.entity.Programme;

@Mapper
public interface ProgrammeMapper {
	
	ProgrammeMapper INSTANCE = Mappers.getMapper(ProgrammeMapper.class);
	
	ProgrammeDto programmeToProgrammeDto(Programme programme);
	Programme programmeDtoToProgramme(ProgrammeDto programmeDto);
}
