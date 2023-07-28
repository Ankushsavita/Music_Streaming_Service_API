package com.geekster.musicstreamingserviceapp.repository;

import com.geekster.musicstreamingserviceapp.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISongRepo extends JpaRepository<Song,Long> {
}
