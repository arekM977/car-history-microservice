package com.example.demo.repository;

import com.example.demo.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository  extends JpaRepository<Post, Long> {

    // własna metoda w Spring Data JPA
    // przydaje sie m.in gdy robimy JOIN' y
    //@Query("select p from Post p where title =:title")  // przekazywany jest title z @Param
   // List<Post> findAllByTitle(@Param("title") String title);


    // łączę posty i komentarze poprzez JOIN
    // w JPA jeżeli pobieram powiązaną encję używam słowa kluczowego fetch
   //@Query("SELECT p FROM Post p LEFT JOIN fetch p.comment")
   List<Post> findAll();

}
