package com.geekster.musicstreamingserviceapp.controller;

import com.geekster.musicstreamingserviceapp.model.Song;
import com.geekster.musicstreamingserviceapp.service.SongService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AdminController {

    @Autowired
    SongService songService;

    @PostMapping("song")
    public Song addSong(@Valid @RequestBody Song song){
        return songService.addSong(song);
    }

    @GetMapping("songs")
    public List<Song> getAllSongs(){
        return songService.getAllSongs();
    }

    @GetMapping("song/{songId}")
    public Optional<Song> getSongById(@PathVariable Long songId){
        return songService.getSongById(songId);
    }

    @PutMapping("songs/{songId}")
    public String updateSongById(@PathVariable Long songId, @RequestBody Song song){
        return songService.updateSongById(songId, song);
    }

    @DeleteMapping("song/delete/{songId}")
    public String deleteSongById(@PathVariable Long songId){
        return songService.deleteSongById(songId);
    }
}
