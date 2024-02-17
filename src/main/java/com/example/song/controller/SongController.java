/*
 * 
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 *
 */

// Write your code here
// Write your code here
package com.example.song.controller;

import com.example.song.model.Song;
import com.example.song.service.SongH2Service;
import java.util.*;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class SongController {
  @Autowired
  public SongH2Service songService;

  @GetMapping("/songs")
  public ArrayList<Song> getSongs() {
    return songService.getSongs();
  }

  @PostMapping("/songs")
  public Song addSong(@RequestBody Song song) {
    return songService.addSong(song);
  }

  @GetMapping("/songs/{songId}")
  public Song getSongById(@PathVariable int songId) {
    return songService.getSongById(songId);
  }

  @PutMapping("/songs/{songId}")
  public Song updateSong(@PathVariable int songId, @RequestBody Song song) {
    return songService.updateSong(songId, song);
  }

  @DeleteMapping("/songs/{songId}")
  public void deleteSongById(@PathVariable int songId) {
    songService.deleteSongById(songId);
  }
}