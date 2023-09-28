package service;

import java.util.List;
import dao.CategoriaDAO;
import model.Categoria;

public class CategoriaService {

	CategoriaDAO dao = new CategoriaDAO();
	
	public List<Categoria> listarCategoria() {
		return dao.listar();
	}
	
	public Categoria buscarCategoriaPorId(Integer id) {
		return dao.consultarPorId(id);
	}
}
