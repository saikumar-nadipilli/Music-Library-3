package com.example.song.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;
import com.example.song.model.*;

@Repository
public interface SongJpaRepository extends JpaRepository<Song, Integer>{

}