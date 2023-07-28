package com.geekster.musicstreamingserviceapp.service;

import com.geekster.musicstreamingserviceapp.model.Playlist;
import com.geekster.musicstreamingserviceapp.repository.IPlaylistRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlaylistService {

    @Autowired
    IPlaylistRepo playlistRepo;

    public String createPlaylist(Playlist playlist) {
         playlistRepo.save(playlist);
         return "playlist added successfully..";
    }

    public List<Playlist> getAllPlaylists() {
        return playlistRepo.findAll();
    }

    public Optional<Playlist> getPlaylistById(Long playlistId) {
        return playlistRepo.findById(playlistId);
    }

    public String updatePlaylistById(Long playlistId, Playlist playlist) {
        Optional<Playlist> myPlaylistOpt = playlistRepo.findById(playlistId);
        Playlist myPlaylist = null;
        if(myPlaylistOpt.isPresent()){
            myPlaylist = myPlaylistOpt.get();
        }else{
            return "id not found..";
        }

        myPlaylist.setPlaylistId(playlist.getPlaylistId());
        myPlaylist.setPlaylistName(playlist.getPlaylistName());
        myPlaylist.setPlaylistDesc(playlist.getPlaylistDesc());
        playlistRepo.save(myPlaylist);
        return "playlist updated successfully";
    }

    public String deletePlaylistById(Long playlistId) {
        playlistRepo.deleteById(playlistId);
        return "playlist deleted successfully...";
    }
}
