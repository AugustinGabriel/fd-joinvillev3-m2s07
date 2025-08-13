package br.futurodev.jmt.semana7.mapper;

import br.futurodev.jmt.semana7.dto.CityRequestDto;
import br.futurodev.jmt.semana7.dto.CityResponseDto;
import br.futurodev.jmt.semana7.entity.CityEntity;

public class CityMapper {

    private CityMapper() {}

    public static CityEntity requestToEntity(CityRequestDto dto) {
        CityEntity entity = new CityEntity();
        entity.setName(dto.name());
        entity.setNumberInhabitants(dto.numberInhabitants());
        return entity;
    }

    public static CityResponseDto entityToResponse(CityEntity entity) {
        return new CityResponseDto(
                entity.getId(),
                entity.getName(),
                entity.getNumberInhabitants()
        );
    }
}
