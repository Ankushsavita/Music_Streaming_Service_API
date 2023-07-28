package com.geekster.musicstreamingserviceapp.service;

import com.geekster.musicstreamingserviceapp.model.Song;
import com.geekster.musicstreamingserviceapp.repository.ISongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SongService {

    @Autowired
    ISongRepo songRepo;

    public Song addSong(Song song) {
        return songRepo.save(song);
    }

    public List<Song> getAllSongs() {
        return songRepo.findAll();
    }

    public Optional<Song> getSongById(Long songId) {
        return songRepo.findById(songId);
    }

    public String updateSongById(Long songId, Song song) {
        Optional<Song> mySongOpt = songRepo.findById(songId);
        Song mySong = null;
        if(mySongOpt.isPresent()){
            mySong = mySongOpt.get();
        }else{
            return "id not found!";
        }
        mySong.setSongId(song.getSongId());
        mySong.setSongTitle(song.getSongTitle());
        mySong.setSongArtist(song.getSongArtist());
        mySong.setSongDuration(song.getSongDuration());
        songRepo.save(mySong);
        return "song updated";
    }

    public String deleteSongById(Long songId) {
        songRepo.deleteById(songId);
        return "song deleted successfully..";
    }
}
