// Write your code here

package com.example.song.repository;

import java.util.*;

import com.example.song.model.Song;
import com.example.song.service.SongH2Service;

public interface SongRepository {
   ArrayList<Song> getSongs();

   Song addSong(Song song);

   Song getSongById(int songId);

   Song updateSong(int songId, Song song);

   void deleteSongById(int songId);

}