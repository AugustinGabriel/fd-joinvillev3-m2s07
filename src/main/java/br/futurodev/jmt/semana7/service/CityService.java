package br.futurodev.jmt.semana7.service;

import br.futurodev.jmt.semana7.dto.CityRequestDto;
import br.futurodev.jmt.semana7.dto.CityResponseDto;
import br.futurodev.jmt.semana7.entity.CityEntity;
import br.futurodev.jmt.semana7.mapper.CityMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {

    public List<CityResponseDto> findAll() {
        List<CityResponseDto> dtos = new ArrayList<>();

        List<CityEntity> entities = CityEntity.getCITIES();
        for (CityEntity entity : entities) {
            CityResponseDto dto = CityMapper.entityToResponse(entity);
            dtos.add(dto);
        }

        return dtos;
    }

    public CityResponseDto save(CityRequestDto dto) {
        CityEntity city = CityMapper.requestToEntity(dto);

        CityEntity.save(city);

        return CityMapper.entityToResponse(city);
    }

}
