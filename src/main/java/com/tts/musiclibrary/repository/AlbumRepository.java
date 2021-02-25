package com.tts.musiclibrary.repository;

import com.tts.musiclibrary.model.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, Long> {


}
