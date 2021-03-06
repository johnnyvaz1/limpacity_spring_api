package br.com.limpacity.api.repository;

import br.com.limpacity.api.model.PostoColetaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PostoColetaRepository extends JpaRepository<PostoColetaModel, Long> {

    @Query(" select m from PostoColetaModel m " +
            " where m.active = true ")
    List<PostoColetaModel> findAllAndActive();

    @Query(" select m from PostoColetaModel m ")
    List<PostoColetaModel> findTudo();

    @Query(" select m from PostoColetaModel m " +
            " where m.active = true " +
            " and m.id = :id ")
    List<PostoColetaModel> findByIdAndActive(@Param("id") Long id);


}
