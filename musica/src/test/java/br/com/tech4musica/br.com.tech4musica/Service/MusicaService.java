
package br.com.tech4musica.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4musica.dto.MusicaDTO;

public interface MusicaService {
    List<MusicaDTO> obterTodosAsMusica();

    Optional<MusicaDTO> obterMusicaPorId(String id);

    MusicaDTO armazenarMusica(MusicaDTO musica);

    void excluirMusicaPorId(String id);

    MusicaDTO atualizarMusica(String id, MusicaDTO Musica);
}