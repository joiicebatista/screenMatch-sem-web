package br.com.jrbdeveng.screenmatch.repository;

import br.com.jrbdeveng.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
}
