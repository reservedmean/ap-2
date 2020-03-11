package com.revaturelabs.ap2.track;

import com.revaturelabs.ap2.track.dto.TrackDTO;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TrackService {
  private TrackRepository trackRepository;

  public TrackService(TrackRepository trackRepository) {
    this.trackRepository = trackRepository;
  }

  public Optional<List<TrackDTO>> findAll() {
    try {
      return Optional.of(this.trackRepository.findAll().stream()
          .map(TrackConverter::convert)
          .collect(Collectors.toList()));
    } catch (Exception e) {
      return Optional.empty();
    }
  }

  public Optional<TrackDTO> save(TrackDTO trackDTO) {
    Track track = TrackConverter.convert(trackDTO);
    try {
      track = this.trackRepository.save(track);
    } catch (Exception e) {
      return Optional.empty();
    }
    return Optional.of(TrackConverter.convert(track));
  }

}
