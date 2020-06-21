package it.bandadirecco.musicarchive.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PieceRepository extends CrudRepository<Piece, Long> {
    Piece findByid(long id);

    List<Piece> findAll();

    List<Piece> findByComposer(Author composer);

    List<Piece> findByArranger(Author arranger);
}
