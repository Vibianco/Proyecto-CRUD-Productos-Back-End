package com.vibianco.springboot.app.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vibianco.springboot.app.models.Producto;
import com.vibianco.springboot.app.repository.ProductoRepository;
import com.vibianco.springboot.app.services.IProductoService;

@Service("productoService")
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public Producto IdProducto(String idProducto) {
		
		Producto producto = null;
		
		try {
			
			producto = productoRepository.findById(idProducto);
					
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return producto;
	}
	
	@Override
	public Producto save(Producto entity) {
		Producto producto = null;
		
		try {
			producto = productoRepository.save(entity);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return producto;
	}
	
	@Override
	public List <Producto> findAll(){
		List <Producto> lstProductos = new ArrayList<Producto>();
		try {
			lstProductos = productoRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lstProductos;
	}
	
	@Override
	public Producto update(Producto entity) {
		Producto producto = null;
		try {
			producto = productoRepository.save(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return producto;
	}
	
	@Override
	public Producto deleteById(String idProducto) {
		Producto producto = null;
		try {
			producto = productoRepository.deleteById(idProducto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return producto;
	}

}
