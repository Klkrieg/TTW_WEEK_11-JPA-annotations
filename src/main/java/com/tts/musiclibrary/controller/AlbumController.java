package com.tts.musiclibrary.controller;

import com.tts.musiclibrary.repository.AlbumRepository;
import com.tts.musiclibrary.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AlbumController {

  @Autowired
  private AlbumRepository albumRepository;

  @GetMapping(value = "/")
  public String index(Album album){
    return "album/index";
  }

  private Album album;
  @PostMapping(value = "/")
  public String addAlbum(Album album, Model model){
    albumRepository.save(new Album(album.getAlbumName(), album.getArtist(), album.getYearReleased()));
    model.addAttribute("albumName", album.getAlbumName());
    model.addAttribute("artist", album.getArtist());
    model.addAttribute("yearReleased", album.getYearReleased());
    return "album/library";
  }
}
