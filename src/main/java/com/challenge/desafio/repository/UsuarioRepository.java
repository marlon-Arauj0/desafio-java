package com.challenge.desafio.repository;

import com.challenge.desafio.dto.UserDto;

import java.util.List;

public interface UsuarioRepository{

    List<UserDto> getAllUsersWithScoreHigherThan(Integer score);

}
