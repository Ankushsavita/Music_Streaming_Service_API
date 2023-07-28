package com.geekster.musicstreamingserviceapp.controller;

import com.geekster.musicstreamingserviceapp.model.Playlist;
import com.geekster.musicstreamingserviceapp.model.User;
import com.geekster.musicstreamingserviceapp.service.PlaylistService;
import com.geekster.musicstreamingserviceapp.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    PlaylistService playlistService;

    @Autowired
    UserService userService;

    // ------------------------------------------------------------------------
    @PostMapping("playlist")
    public String createPlaylist(@Valid @RequestBody Playlist playlist){
        return playlistService.createPlaylist(playlist);
    }

    @GetMapping("playlists")
    public List<Playlist> getAllPlaylists(){
        return playlistService.getAllPlaylists();
    }

    @GetMapping("playlist/{playlistId}")
    public Optional<Playlist> getPlaylistById(@PathVariable Long playlistId){
        return playlistService.getPlaylistById(playlistId);
    }

    @PutMapping("playlists/{playlistId}")
    public String updatePlaylistById(@PathVariable Long playlistId, @RequestBody Playlist playlist){
        return playlistService.updatePlaylistById(playlistId, playlist);
    }

    @DeleteMapping("playlist/delete/{playlistId}")
    public String deletePlaylistById(@PathVariable Long playlistId){
        return playlistService.deletePlaylistById(playlistId);
    }

    // ----------------------------------------------------------------
    @PostMapping("user")
    public String addUser(@Valid @RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("user/{userId}")
    public Optional<User> getUserById(@PathVariable Long userId){
        return userService.getUserById(userId);
    }

    @PutMapping("users/{userId}")
    public String updateUserById(@PathVariable Long userId, @Valid @RequestBody User user){
        return userService.updateUserById(userId, user);
    }

    @DeleteMapping("user/delete/{userId}")
    public String deleteUserById(@PathVariable Long userId){
        return userService.deleteUserById(userId);
    }
}
