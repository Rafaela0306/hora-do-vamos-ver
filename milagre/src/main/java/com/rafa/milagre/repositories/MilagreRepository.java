package com.rafa.milagre.repositories;

import com.rafa.milagre.models.MilagreModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MilagreRepository  extends JpaRepository<MilagreModel,Long>{
}
