package com.jeremd.keyboardshortcutsmemo.dto;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.jeremd.keyboardshortcutsmemo.entity.Raccourci;

@Mapper
public interface RaccourciMapper {

	RaccourciMapper INSTANCE = Mappers.getMapper(RaccourciMapper.class);
	
	RaccourciDto raccourciToRaccourciDto(Raccourci raccourci);
	Raccourci raccourciDtoToRaccourci(RaccourciDto raccourciDto);
}
