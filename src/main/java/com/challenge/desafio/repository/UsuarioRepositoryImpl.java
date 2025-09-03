package com.challenge.desafio.repository;

import com.challenge.desafio.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UsuarioRepositoryImpl implements UsuarioRepository{

    private final List<UserDto> usersRepository;

    @Override
    public List<UserDto> getAllUsersWithScoreHigherThan(Integer score) {
        return List.of();
    }
}
