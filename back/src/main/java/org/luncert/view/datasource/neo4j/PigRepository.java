package org.luncert.view.datasource.neo4j;

import java.util.List;

import org.luncert.view.datasource.neo4j.entity.Pig;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

public interface PigRepository extends Neo4jRepository<Pig, Long> {

    // @Query("MATCH (n:Pig) WHERE n.userId = { userId } AND n.name = { name } WITH n RETURN n, ID(n)")
    List<Pig> findByName(String name);

    // @Query("MATCH (n:Pig) WHERE n.userId = { userId } AND n.strain = { strain } WITH n RETURN n, ID(n)")
    List<Pig> findByStrain(@Param("strain") int strain);

}