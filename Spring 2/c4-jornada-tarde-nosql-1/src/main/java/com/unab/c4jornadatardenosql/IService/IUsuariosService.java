package com.unab.c4jornadatardenosql.IService;

import java.util.List;
import java.util.Optional;


import com.unab.c4jornadatardenosql.Collection.Usuarios;

public interface IUsuariosService {
	
	public List<Usuarios> all();
	
	public Optional<Usuarios> findById(String id);
	
	public Usuarios save(Usuarios usuarios);
	
	public void delete(String id);
}
