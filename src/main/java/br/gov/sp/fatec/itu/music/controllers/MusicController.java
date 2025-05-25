package br.gov.sp.fatec.itu.music.controllers;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import br.gov.sp.fatec.itu.music.entities.Music;
import br.gov.sp.fatec.itu.music.services.MusicService;

@RestController
@RequestMapping
public class MusicController {
  @Autowired
  private MusicService service;

  @GetMapping("musics")
  public ResponseEntity<List<Music>> getAll() {
    return ResponseEntity.ok(service.getAll());
  }

  @GetMapping("music/{id}")
  public ResponseEntity<Music> getMusicById(@PathVariable Long id) {
    return ResponseEntity.ok(service.getMusicById(id));
  }

  @PostMapping("musics")
  public ResponseEntity<Music> save(@RequestBody Music music) {
    Music savedMusic = service.save(music);
    URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path("/music/{id}")
        .buildAndExpand(savedMusic.getId()).toUri();
    return ResponseEntity.created(location).body(savedMusic);
  }
}
