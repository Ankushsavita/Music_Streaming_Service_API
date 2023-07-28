package com.geekster.musicstreamingserviceapp.repository;

import com.geekster.musicstreamingserviceapp.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlaylistRepo extends JpaRepository<Playlist,Long> {
}
